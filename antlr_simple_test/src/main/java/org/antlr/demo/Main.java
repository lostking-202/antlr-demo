package org.antlr.demo;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import t4.FeatureLexer;
import t4.FeatureParser;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    String path=System.getProperty("os.name").equals("Windows 10")?"D:\\workspace\\java\\antlr-demo\\altlr_simple_test\\src\\main\\tl\\test.tl":"/Users/4parardigm/pp/l_java/test_demo/altlr_simple_test/src/main/tl/test.tl";
    //FeatureLexer lexer = new FeatureLexer(CharStreams.fromFileName(path));
    //String op="binary_label(multi_direct(batch102600_flatten_request,batch102603_action.label))";
    //String op="multi_unique_count(batch100006_flatten_request,batch100010_bo_adinfo.I_weight,2d:100:10s)";
    //String op="window_count(batch100006_flatten_request.eveTime,batch100006_flatten_request.query,2d:100:0s,batch100006_flatten_request.browser_version)";
    //在user表中，固定userid后，基于user.ingestiontime找到以该条数据的behaviour.eventTime之前最近10天内最多100条数据，然后针对$A计算不重复的取值数
    String op="combine(batch102600_flatten_request.platform,multi_direct(batch102600_flatten_request,batch102603_action.rank))";
    FeatureLexer lexer = new FeatureLexer(CharStreams.fromString(op));
    FeatureParser parser = new FeatureParser(new CommonTokenStream(lexer));
    parser.setBuildParseTree(true);
    FeatureParser.ParseContext tree = parser.parse();
    FeatureVisitorImpl visitor = new FeatureVisitorImpl();
    System.out.println(visitor.visit(tree));
  }
}