package org.altlr.demo;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import t4.FeatureLexer;
import t4.FeatureParser;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    String path=System.getProperty("os.name").equals("Windows 10")?"D:\\workspace\\java\\antlr-demo\\altlr_simple_test\\src\\main\\tl\\test.tl":"/Users/4parardigm/pp/l_java/test_demo/altlr_simple_test/src/main/tl/test.tl";
    //FeatureLexer lexer = new FeatureLexer(CharStreams.fromFileName(path));
    //String op="binary_label(multi_direct(batch102600_flatten_request,batch102603_action.label))";
    String op="combine(batch102600_flatten_request.platform,multi_direct(batch102600_flatten_request,batch102603_action.rank))";
    FeatureLexer lexer = new FeatureLexer(CharStreams.fromString(op));
    FeatureParser parser = new FeatureParser(new CommonTokenStream(lexer));
    parser.setBuildParseTree(true);
    FeatureParser.ParseContext tree = parser.parse();
    FeatureVisitor visitor=new FeatureVisitor(tree);
    //visitor.visit(tree);
    System.out.println(tree);
    FeatureParser.Feature_expressContext context =tree.feature_express();
    List<ParseTree> childern=context.children;
    System.out.println(context.getRuleContext());
    //context.variable_name()
    System.out.println(context.getChild(FeatureParser.Variable_nameContext.class,0));
    context.getRuleContext();
    context.variable_name();
    System.out.println(context.variable_name(0).invokingState);
    //
    System.out.println("ruleindex"+context.variable_name(0).getRuleIndex());//14
    //context.
    System.out.println(childern);
    childern.stream().forEach(

            child->{
                //child.
              System.out.println(child.getText());
              System.out.println(child);
              System.out.println(child.toStringTree());
              System.out.println(child.getPayload());
              //System.out.println(child instanceof FeatureParser.Feature_expressContext)；
            }
    );
    /*System.out.println(context);
    visitor.visitFeature_express(context);
    //System.out.println(context.express1().getText());
    System.out.println(context.express2().getText());
    System.out.println(context.express2().express1().getText());
    System.out.println(context.express1().key1().getText());
    System.out.println(context.express1().variable_name().getText());
    System.out.println(context.express2().getText());
    System.out.println(context.express3().getText());
    System.out.println(context.express4().getText());
    System.out.println(context.express5().getText());*/
  }
}