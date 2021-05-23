package org.altlr.demo;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.bytebuddy.asm.Advice;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import t4.FeatureParser;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FeatureVisitor {
  class Express{
    public Express(int index,String express){
      this.index=index;
      this.express=express;
    }
    int index;
    String express;
  }
  private final Map<String,Express> OP_MAP=Map.of(
          "original",new Express(1,"{0}"),
          "multi_direct",new Express(2,"{0}表名中的{1}字段"),
          "binary_label",new Express(1,"{0}"),
          "dayofweek",new Express(1,"计算{0}是周几"),
          "hourofday",new Express(1,"计算{0}是几点"),
          "window_max",new Express(4,"根据{0}，找到在该条数据的{1}之前{2}，然后针对{3}求最大值")

  );
  private FeatureParser.ParseContext parseContext;
  public FeatureVisitor(FeatureParser.ParseContext parseContext){
    this.parseContext=parseContext;
  }
  public FeatureParser.Feature_expressContext getExpress(){
    return parseContext.feature_express();
  }
  public boolean isNested(FeatureParser.Feature_expressContext context){
    return context.feature_express()!=null;
  }
  public String getFunctionName(){
    return parseContext.feature_express().key().getText();
  }
  public List<String> getParams(){
    return null;
  }

  //TODO
  public String parseFeatureExpress(FeatureParser.Feature_expressContext context){
    String key=context.key().getText();
    Express express=OP_MAP.get(key);
   List<DD> mm=a(context);
    String[] ss=new String[mm.size()];
    int expressCount=0;
    for(int i=0;i<ss.length;i++){
      if(mm.get(i).type==Type.Express){
        ss[i]=parseFeatureExpress(context.feature_express(expressCount));
        expressCount++;
      }else if(mm.get(i).type==Type.TimeExpress){
        ss[i]=parseTimeExpress(context.time_express());
      }else{
        ss[i]=mm.get(i).ee;
      }
    }
    return MessageFormat.format(express.express,ss);
  }

  public String parseTimeExpress(FeatureParser.Time_expressContext time_expressContext){
    return MessageFormat.format("最近{0}天到{1}分钟内最多{2}条数据",time_expressContext.DAY(),time_expressContext.SECOND(),time_expressContext.LIMIT());
  }
  public boolean isExpress(ParserRuleContext parserRuleContext){
    return false;
    //parserRuleContext.
  }

  public List<DD> a(FeatureParser.Feature_expressContext feature_expressContext){
    List<DD> map= Lists.newArrayListWithCapacity(feature_expressContext.children.size());
    for(ParseTree child:feature_expressContext.children){
      if(child instanceof FeatureParser.Variable_nameContext||
              child instanceof FeatureParser.Table_nameContext){
        map.add(new DD(Type.Other,child.getText()));
      }else if(child instanceof FeatureParser.Feature_expressContext){
        map.add(new DD(Type.Express,child.getText()));
      }else if(child instanceof FeatureParser.Time_expressContext){
        map.add(new DD(Type.TimeExpress,child.getText()));
      }
    }
    return map;
  }
  class DD{
    public DD(Type type,String ee){
      this.type=type;
      this.ee=ee;
    }
    Type type;
    String ee;
  }
  enum Type{
    TimeExpress,
    Express,
    Other
  }
}
