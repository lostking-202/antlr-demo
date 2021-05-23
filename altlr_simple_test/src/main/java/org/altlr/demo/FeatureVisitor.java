package org.altlr.demo;

import org.antlr.v4.runtime.ParserRuleContext;
import t4.FeatureParser;

import java.util.List;
import java.util.Map;

public class FeatureVisitor {
  private final Map<String,Object> map=Map.of(
          "origin",null,
          "multi_direct","[0]表名中的[1]字段",
          "binary_label",null,
          "dayofweek","计算[0]是周几",
          "hourofday","计算[0]是几点"




  );
  private FeatureParser.ParseContext parseContext;
  public FeatureVisitor(FeatureParser.ParseContext parseContext){
    this.parseContext=parseContext;
  }
  public FeatureParser.Feature_expressContext getExpress(){
    return parseContext.feature_express();
  }
  public boolean isNested(){
    return parseContext.feature_express().feature_express()!=null;
  }
  public String getFunctionName(){
    return parseContext.feature_express().key().getText();
  }
  public List<String> getParams(){
    return null;
  }
  public String parseFeatureExpress(){
    String functionName=getExpress().key().getText();
    map.get(functionName);
    getExpress().variable_name();
    return null;
  }
}
