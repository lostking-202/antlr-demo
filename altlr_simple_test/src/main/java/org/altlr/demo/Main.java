package org.altlr.demo;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import t4.FeatureLexer;
import t4.FeatureParser;

import java.io.IOException;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    FeatureLexer lexer = new FeatureLexer(CharStreams.fromFileName("/Users/4parardigm/pp/l_java/test_demo/altlr_simple_test/src/main/tl/test.tl"));
    FeatureParser parser = new FeatureParser(new CommonTokenStream(lexer));
    parser.setBuildParseTree(true);
    FeatureParser.ParseContext tree = parser.parse();
    FeatureVisitor visitor=new FeatureVisitor(tree);
    //visitor.visit(tree);
    /*tree.
    visitor.visitFeature_express()*/
    System.out.println(tree);
    FeatureParser.Feature_expressContext context =tree.feature_express();
    /*System.out.println(context);
    visitor.visitFeature_express(context);
    //System.out.println(context.express1().getText());
    System.out.println(context.express2().getText());
    System.out.println(context.express2().express1().getText());*/
    /*System.out.println(context.express1().key1().getText());
    System.out.println(context.express1().variable_name().getText());*/
    /*System.out.println(context.express2().getText());
    System.out.println(context.express3().getText());
    System.out.println(context.express4().getText());
    System.out.println(context.express5().getText());*/
    List<ParseTree> trees=context.children;
    System.out.println(visitor.getExpress().getText());

  }
}