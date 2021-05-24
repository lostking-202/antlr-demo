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
	 * Visit a parse tree produced by {@link FeatureParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(FeatureParser.KeyContext ctx);
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