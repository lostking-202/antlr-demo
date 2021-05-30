// Generated from t4/Feature.g4 by ANTLR 4.9.2
package t4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FeatureParser}.
 */
public interface FeatureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FeatureParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(FeatureParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatureParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(FeatureParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeatureParser#feature_express}.
	 * @param ctx the parse tree
	 */
	void enterFeature_express(FeatureParser.Feature_expressContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatureParser#feature_express}.
	 * @param ctx the parse tree
	 */
	void exitFeature_express(FeatureParser.Feature_expressContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeatureParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(FeatureParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatureParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(FeatureParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeatureParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(FeatureParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatureParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(FeatureParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeatureParser#time_express}.
	 * @param ctx the parse tree
	 */
	void enterTime_express(FeatureParser.Time_expressContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatureParser#time_express}.
	 * @param ctx the parse tree
	 */
	void exitTime_express(FeatureParser.Time_expressContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeatureParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(FeatureParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatureParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(FeatureParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeatureParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(FeatureParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatureParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(FeatureParser.LimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeatureParser#second}.
	 * @param ctx the parse tree
	 */
	void enterSecond(FeatureParser.SecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatureParser#second}.
	 * @param ctx the parse tree
	 */
	void exitSecond(FeatureParser.SecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeatureParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(FeatureParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatureParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(FeatureParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeatureParser#field_name}.
	 * @param ctx the parse tree
	 */
	void enterField_name(FeatureParser.Field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatureParser#field_name}.
	 * @param ctx the parse tree
	 */
	void exitField_name(FeatureParser.Field_nameContext ctx);
}