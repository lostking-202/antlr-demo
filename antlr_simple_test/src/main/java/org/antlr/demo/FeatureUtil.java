package org.antlr.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.util.ResourceUtils;

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

public class FeatureUtil {

  private static Properties OP_MAP = new Properties();
  private static final List<String> ss=List.of(
          "multi_sum","multi_max","multi_min","multi_avg","multi_unique_count","multi_count","multi_top3frequency"
  );
  private static final List<String> sss=List.of(
          "window_sum",
          "window_max",
          "window_min",
          "window_avg",
          "window_unique_count",
          "window_count",
          "window_top1_ratio"
  );

  static {
    try {
      URLConnection con = FeatureUtil.class.getClassLoader().getResource("op.properties").openConnection();
      //ResourceUtils.useCachesIfNecessary(con);
      InputStream is = con.getInputStream();
      OP_MAP.load(new InputStreamReader(is,StandardCharsets.UTF_8));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private FeatureParser.ParseContext parseContext;

  public FeatureUtil(FeatureParser.ParseContext parseContext){
    this.parseContext=parseContext;
  }

  public FeatureParser.Feature_expressContext getExpress(){
    return parseContext.feature_express();
  }

  public String parseFeatureExpress(FeatureParser.Feature_expressContext context) throws IOException {
    List<ParseTreeGroup> children=this.parseTreeGroupByType(context);
    String[] arguments=new String[children.size()];

    int expressCount=0;

    for(int i=0;i<arguments.length;i++){
      if(children.get(i).type==Type.Express){
        arguments[i]=parseFeatureExpress(context.feature_express(expressCount));
        expressCount++;
      }else if(children.get(i).type==Type.TimeExpress){
        arguments[i]=parseTimeExpress(context.time_express());
      }else{
          arguments[i]=children.get(i).child.getText();
      }
    }
    if("combine".equals(context.key().getText())){
      //缩短参数
      String[] newArguments=new String[2];
      newArguments[0]=String.join("、", Arrays.stream(arguments).collect(Collectors.toList()).subList(0,arguments.length-1));
      newArguments[1]=arguments[arguments.length-1];
      return MessageFormat.format(OP_MAP.getProperty(context.key().getText()),newArguments);
    }
    if("multi_direct".equals(context.key().getText())){
      arguments=new String[2];
      arguments[0]=((FeatureParser.Variable_nameContext)(children.get(0).child)).table_name().getText();
      arguments[1]=((FeatureParser.Variable_nameContext)(children.get(0).child)).field_name().getText();
    }else if(ss.contains(context.key().getText())){
      //TODO
      arguments=new String[6];
      System.out.println();
      String pyconf= Files.readString(ResourceUtils.getFile("classpath:pyconf.json").toPath(), StandardCharsets.UTF_8);
      ObjectMapper om=new ObjectMapper();
      JsonNode jn=om.readTree(pyconf);
      System.out.println(jn);
      //.findPath("");
      FeatureParser.Variable_nameContext variableContext= context.variable_name().get(0);
      String bo_table_name=variableContext.table_name().getText();
      /*{
        "type": "1-M",
              "time_windows": [
        "2d,100:10s"
                    ],
        "window_delay": "10s",
              "from_entity": "batch100006_flatten_request",
              "from_entity_keys": [
        "itemId"
                    ],
        "from_entity_time_col": "eveTime",
              "to_entity": "batch100010_bo_adinfo",
              "to_entity_keys": [
        "itemId"
                    ],
        "to_entity_time_col": "ingTime"
      },*/
      variableContext.field_name();
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
      arguments[4]=parseTimeExpress(context.time_express());
      arguments[5]=context.variable_name(0).getText();
      return MessageFormat.format(OP_MAP.getProperty(context.key().getText()),arguments);
    }else if(sss.contains(context.key().getText())){
      arguments=new String[5];
      arguments[0]=context.variable_name(0).table_name().getText();
      arguments[1]=context.variable_name(1).field_name().getText();
      arguments[2]=context.variable_name(0).field_name().getText();
      arguments[3]=parseTimeExpress(context.time_express());
      arguments[4]=context.variable_name(2).field_name().getText();
      return MessageFormat.format(OP_MAP.getProperty(context.key().getText()),arguments);
    }

    return MessageFormat.format(OP_MAP.getProperty(context.key().getText()),arguments);
  }

  private String parseTimeExpress(FeatureParser.Time_expressContext time_expressContext){
    return MessageFormat.format("最近{0}天到{1}秒内最多{2}条数据",time_expressContext.day().getText(),time_expressContext.second().getText(),time_expressContext.limit().getText());
  }

  private FeatureInfo getFeatureInfo() throws IOException {
    String pyconf= Files.readString(ResourceUtils.getFile("classpath:pyconf.json").toPath(), StandardCharsets.UTF_8);
    ObjectMapper om=new ObjectMapper();
    JsonNode jn=om.readTree(pyconf);
    return om.reader().readValue(jn.findPath("app").findPath("feature_info"),FeatureInfo.class);
  }

  private List<ParseTreeGroup> parseTreeGroupByType(FeatureParser.Feature_expressContext feature_expressContext){
    List<ParseTreeGroup> children= Lists.newArrayListWithCapacity(feature_expressContext.children.size());
    for(ParseTree child:feature_expressContext.children){
      if(child instanceof FeatureParser.Variable_nameContext){
        children.add(new ParseTreeGroup(Type.Other,child));
      }else if(child instanceof FeatureParser.Feature_expressContext){
        children.add(new ParseTreeGroup(Type.Express,child));
      }else if(child instanceof FeatureParser.Time_expressContext){
        children.add(new ParseTreeGroup(Type.TimeExpress,child));
      }
    }
    return children;
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
}
