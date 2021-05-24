package org.altlr.demo;

import com.google.common.collect.Lists;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.util.ResourceUtils;
import t4.FeatureParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.List;
import java.util.Properties;

public class FeatureVisitor {

  private static Properties OP_MAP = new Properties();

  static {
    try {
      URLConnection con = FeatureVisitor.class.getClassLoader().getResource("op.properties").openConnection();
      ResourceUtils.useCachesIfNecessary(con);
      InputStream is = con.getInputStream();
      OP_MAP.load(new InputStreamReader(is,StandardCharsets.UTF_8));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private FeatureParser.ParseContext parseContext;

  public FeatureVisitor(FeatureParser.ParseContext parseContext){
    this.parseContext=parseContext;
  }

  private FeatureParser.Feature_expressContext getExpress(){
    return parseContext.feature_express();
  }

  public String parseFeatureExpress(FeatureParser.Feature_expressContext context){
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
        if("multi_direct".equals(context.key().getText())){
          arguments=new String[2];
          arguments[0]=((FeatureParser.Variable_nameContext)(children.get(i).child)).table_name().getText();
          arguments[1]=((FeatureParser.Variable_nameContext)(children.get(i).child)).field_name().getText();
          break;
        }else{
          arguments[i]=children.get(i).child.getText();
        }
      }
    }
    return MessageFormat.format(OP_MAP.getProperty(context.key().getText()),arguments);
  }

  private String parseTimeExpress(FeatureParser.Time_expressContext time_expressContext){
    return MessageFormat.format("最近{0}天到{1}分钟内最多{2}条数据",time_expressContext.DAY(),time_expressContext.SECOND(),time_expressContext.LIMIT());
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
