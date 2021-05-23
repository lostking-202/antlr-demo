// Generated from t4/Feature.g4 by ANTLR 4.9.2
package t4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FeatureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FeatureVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FeatureParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(FeatureParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#feature_express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_express(FeatureParser.Feature_expressContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FeatureParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#inner_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_expression(FeatureParser.Inner_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#express1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpress1(FeatureParser.Express1Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#express2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpress2(FeatureParser.Express2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#express3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpress3(FeatureParser.Express3Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#express4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpress4(FeatureParser.Express4Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#express5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpress5(FeatureParser.Express5Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#express6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpress6(FeatureParser.Express6Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#express7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpress7(FeatureParser.Express7Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#single_window_express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_window_express(FeatureParser.Single_window_expressContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(FeatureParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#key1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey1(FeatureParser.Key1Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#key2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey2(FeatureParser.Key2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#key3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey3(FeatureParser.Key3Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#key4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey4(FeatureParser.Key4Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#key5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey5(FeatureParser.Key5Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#key6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey6(FeatureParser.Key6Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#key7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey7(FeatureParser.Key7Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#key8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey8(FeatureParser.Key8Context ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#time_express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_express(FeatureParser.Time_expressContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(FeatureParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeatureParser#field_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_name(FeatureParser.Field_nameContext ctx);
}