package org.antlr.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.springframework.util.ResourceUtils;
import t4.FeatureBaseVisitor;
import t4.FeatureParser;
import t4.FeatureVisitor;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;


@Slf4j
public class FeatureVisitorImpl extends FeatureBaseVisitor<String> {

    private static Properties OP_MAP = new Properties();
    private static final List<String> ss=List.of(
            "multi_sum","multi_max","multi_min","multi_avg","multi_unique_count","multi_count","multi_top3frequency"
    );

    static {
        try {
            URLConnection con =ResourceUtils.getURL("classpath:op.properties").openConnection();
            //ResourceUtils.useCachesIfNecessary(con);
            InputStream is = con.getInputStream();
            OP_MAP.load(new InputStreamReader(is,StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String visitCombineExpression(FeatureParser.CombineExpressionContext ctx) {
        return visitFeature_express(ctx,ctx.key());
    }

    @Override
    public String visitJudgeExpression(FeatureParser.JudgeExpressionContext ctx) {
        return visitFeature_express(ctx,ctx.key());
    }

    public String visitFeature_express(FeatureParser.Feature_expressContext ctx,FeatureParser.KeyContext keyContext) {
        List<ParseTreeGroup> children=this.parseTreeGroupByType(ctx);
        String[] arguments=new String[children.size()];
        for(int i=0;i<arguments.length;i++){
            if(children.get(i).type==Type.CombineExpression){
                arguments[i]=visitCombineExpression((FeatureParser.CombineExpressionContext) children.get(i).child);
            }else if(children.get(i).type==Type.JudgeExpression){
                arguments[i]=visitJudgeExpression((FeatureParser.JudgeExpressionContext) children.get(i).child);
            }else if(children.get(i).type==Type.MutilDirectExpression){
                arguments[i]=visitMutilDirectExpression((FeatureParser.MutilDirectExpressionContext) children.get(i).child);
            }else if(children.get(i).type==Type.SingleWindowExpression){
                arguments[i]=visitSingleWindowExpression((FeatureParser.SingleWindowExpressionContext) children.get(i).child);
            }else if(children.get(i).type==Type.MutilWindowExpression){
                arguments[i]=visitMutilWindowExpression((FeatureParser.MutilWindowExpressionContext) children.get(i).child);
            }else{
                arguments[i]=visitVariable_name((FeatureParser.Variable_nameContext) children.get(i).child);
            }
        }
        if(ctx instanceof FeatureParser.CombineExpressionContext){
            //????????????
            String[] newArguments=new String[2];
            newArguments[0]=String.join("???", Arrays.stream(arguments).collect(Collectors.toList()).subList(0,arguments.length-1));
            newArguments[1]=arguments[arguments.length-1];
            String message1=MessageFormat.format(OP_MAP.getProperty(visitKey(keyContext)),newArguments);
            return message1;
        }
        String message2=MessageFormat.format(OP_MAP.getProperty(visitKey(keyContext)),arguments);
        return message2;
    }

    @Override
    public String visitMutilDirectExpression(FeatureParser.MutilDirectExpressionContext ctx) {
        return MessageFormat.format(OP_MAP.getProperty(visitKey(ctx.key())),visitTable_name(ctx.variable_name().table_name()),visitField_name(ctx.variable_name().field_name()));
    }


    //???{0}???????????????{1}???????????????????????????{2}??????{3}???????????????{4}?????????
    @Override
    public String visitSingleWindowExpression(FeatureParser.SingleWindowExpressionContext ctx) {
        return MessageFormat.format(OP_MAP.getProperty(visitKey(ctx.key())),visitTable_name(ctx.variable_name(0).table_name()),
                visitField_name(ctx.variable_name(1).field_name()),
                visitField_name(ctx.variable_name(0).field_name()),
                visitTime_express(ctx.time_express()),
                visitField_name(ctx.variable_name(2).field_name()));
    }

    //TODO
    @Override
    public String visitMutilWindowExpression(FeatureParser.MutilWindowExpressionContext ctx) {
        String[] arguments=new String[6];
        try{
            String bo_table_name=visitTable_name(ctx.variable_name().table_name());
            List<RelationInfo> relationInfos=getFeatureInfo().getRelations();
            RelationInfo relation=relationInfos.stream().filter(
                    relationInfo -> "1-M".equals(relationInfo.getType())&&bo_table_name.equals(relationInfo.getToEntity())
            ).findAny().get();
            //???user???????????????userid????????????user.ingestiontime????????????????????????behaviour.eventTime????????????10????????????100????????????????????????$A???????????????????????????
            arguments[0]=bo_table_name;
            List<String> toEntityKeys=relation.getToEntityKeys();
            if(toEntityKeys.size()<=2){
                arguments[1]=String.join("???",relation.getToEntityKeys());
            }else{
                arguments[1]=String.join("???",relation.getToEntityKeys().subList(0,toEntityKeys.size()-1)
                )+"???"+relation.getToEntityKeys().get(toEntityKeys.size()-1);
            }
            arguments[2]=relation.getToEntity()+"."+relation.getToEntityTimeCol();
            arguments[3]=relation.getFromEntity()+"."+relation.getFromEntityTimeCol();
            arguments[4]=visitTime_express(ctx.time_express());
            arguments[5]=visitVariable_name(ctx.variable_name());
            return MessageFormat.format(OP_MAP.getProperty(visitKey(ctx.key())),arguments);
        }catch (IOException e){
            log.error("pyconf.json not found");
            return null;
        }
    }

    class ParseTreeGroup{
        Type type;
        ParseTree child;
        private ParseTreeGroup(Type type,ParseTree child){
            this.type=type;
            this.child=child;
        }
    }

    enum Type{
        MutilDirectExpression,
        SingleWindowExpression,
        MutilWindowExpression,
        CombineExpression,
        JudgeExpression,Other
    }

    private List<ParseTreeGroup> parseTreeGroupByType(FeatureParser.Feature_expressContext feature_expressContext){
        List<ParseTreeGroup> children= Lists.newArrayListWithCapacity(feature_expressContext.children.size());
        for(ParseTree child:feature_expressContext.children){
            if(child instanceof FeatureParser.CombineExpressionContext){
                children.add(new ParseTreeGroup(Type.CombineExpression,child));
            }else if(child instanceof FeatureParser.MutilDirectExpressionContext){
                children.add(new ParseTreeGroup(Type.MutilDirectExpression,child));
            }else if(child instanceof FeatureParser.JudgeExpressionContext){
                children.add(new ParseTreeGroup(Type.JudgeExpression,child));
            }else if(child instanceof FeatureParser.MutilWindowExpressionContext){
                children.add(new ParseTreeGroup(Type.MutilWindowExpression,child));
            }else if(child instanceof FeatureParser.SingleWindowExpressionContext){
                children.add(new ParseTreeGroup(Type.SingleWindowExpression,child));
            }else if(child instanceof FeatureParser.Variable_nameContext){
                children.add(new ParseTreeGroup(Type.Other,child));
            }
        }
        return children;
    }

    private FeatureInfo getFeatureInfo() throws IOException {
        String pyconf= Files.readString(ResourceUtils.getFile("classpath:pyconf.json").toPath(), StandardCharsets.UTF_8);
        ObjectMapper om=new ObjectMapper();
        JsonNode jn=om.readTree(pyconf);
        return om.reader().readValue(jn.findPath("app").findPath("feature_info"),FeatureInfo.class);
    }

    @Override
    public String visitKey(FeatureParser.KeyContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVariable_name(FeatureParser.Variable_nameContext ctx) {
        return visitTable_name(ctx.table_name())+"."+visitField_name(ctx.field_name());
    }

    @Override
    public String visitTime_express(FeatureParser.Time_expressContext ctx) {
        return MessageFormat.format("??????{0}??????{1}????????????{2}?????????",
                visitDay(ctx.day()),visitSecond(ctx.second()),
                visitLimit(ctx.limit())
                );
    }

    @Override
    public String visitDay(FeatureParser.DayContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLimit(FeatureParser.LimitContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSecond(FeatureParser.SecondContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTable_name(FeatureParser.Table_nameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitField_name(FeatureParser.Field_nameContext ctx) {
        return ctx.getText();
    }
}
