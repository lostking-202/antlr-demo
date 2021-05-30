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
public class FeatureVisitorImpl implements FeatureVisitor<String> {

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
    public String visitParse(FeatureParser.ParseContext ctx) {
        return visitFeature_express(ctx.feature_express());
    }

    @Override
    public String visitCombineExpression(FeatureParser.CombineExpressionContext ctx) {
        return visitFeature_express(ctx);
    }

    @Override
    public String visitJudgeExpression(FeatureParser.JudgeExpressionContext ctx) {
        return visitFeature_express(ctx);
    }

    //TODO
    private String visitFeature_express(FeatureParser.Feature_expressContext ctx) {
        Class c;
        if(ctx instanceof FeatureParser.CombineExpressionContext){
            c=FeatureParser.CombineExpressionContext.class;
        }else{
            FeatureParser.JudgeExpressionContext context=(FeatureParser.JudgeExpressionContext)ctx;
        }
        List<ParseTreeGroup> children=this.parseTreeGroupByType(ctx);
        String[] arguments=new String[children.size()];

        int expressCount=0;

        for(int i=0;i<arguments.length;i++){
            if(children.get(i).type==Type.Express){
                arguments[i]=visitFeature_express(ctx.feature_express(expressCount));
                expressCount++;
            }else if(children.get(i).type==Type.TimeExpress){
                arguments[i]=visitTime_express(ctx.time_express());
            }else{
                arguments[i]=children.get(i).child.getText();
            }
        }
        if("combine".equals(ctx.key().getText())){
            //缩短参数
            String[] newArguments=new String[2];
            newArguments[0]=String.join("、", Arrays.stream(arguments).collect(Collectors.toList()).subList(0,arguments.length-1));
            newArguments[1]=arguments[arguments.length-1];
            return MessageFormat.format(OP_MAP.getProperty(visitKey(ctx.key())),newArguments);
        }
        return MessageFormat.format(OP_MAP.getProperty(visitKey(ctx.key())),arguments);
    }

    @Override
    public String visitMutilDirectExpression(FeatureParser.MutilDirectExpressionContext ctx) {
        return MessageFormat.format(OP_MAP.getProperty(visitKey(ctx.key())),visitTable_name(ctx.variable_name().table_name()),visitField_name(ctx.variable_name().field_name()));
    }


    //在{0}表中，根据{1}，找到在该条数据的{2}之前{3}，然后针对{4}做求和
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
            String pyconf= Files.readString(ResourceUtils.getFile("classpath:pyconf.json").toPath(), StandardCharsets.UTF_8);
            ObjectMapper om=new ObjectMapper();
            String bo_table_name=visitTable_name(ctx.variable_name().table_name());
            List<RelationInfo> relationInfos=getFeatureInfo().getRelations();
            RelationInfo relation=relationInfos.stream().filter(
                    relationInfo -> "1-M".equals(relationInfo.getType())&&bo_table_name.equals(relationInfo.getToEntity())
            ).findAny().get();
            //在user表中，固定userid后，基于user.ingestiontime找到以该条数据的behaviour.eventTime之前最近10天内最多100条数据，然后针对$A计算不重复的取值数
            arguments[0]=bo_table_name;
            List<String> toEntityKeys=relation.getToEntityKeys();
            if(toEntityKeys.size()<=2){
                arguments[1]=String.join("和",relation.getToEntityKeys());
            }else{
                arguments[1]=String.join("、",relation.getToEntityKeys().subList(0,toEntityKeys.size()-1)
                )+"和"+relation.getToEntityKeys().get(toEntityKeys.size()-1);
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
        TimeExpress,
        Express,
        Other
    }

    private List<ParseTreeGroup> parseTreeGroupByType(FeatureParser.Feature_expressContext feature_expressContext){
        List<ParseTreeGroup> children= Lists.newArrayListWithCapacity(feature_expressContext.children.size());
        for(ParseTree child:feature_expressContext.children){
            if(child instanceof FeatureParser.Variable_nameContext){
                children.add(new ParseTreeGroup(Type.Other,child));
            }else if(child instanceof FeatureParser.Feature_expressContext){
                children.add(new ParseTreeGroup(Type.Express,child));
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
        return MessageFormat.format("最近{0}天到{1}秒内最多{2}条数据",
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

    @Override
    public String visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
