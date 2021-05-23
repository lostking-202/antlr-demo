// Generated from t4/Feature.g4 by ANTLR 4.9.2
package t4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FeatureParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DAY=8, LIMIT=9, 
		SECOND=10, MULTI_DIRECT=11, BINARY_LABEL=12, ORIGINAL=13, TIMEDIFF=14, 
		ISIN=15, COMBINE=16, DAYOFWEEK=17, HOUROFDAY=18, ISWEEKDAY=19, WINDOW_SUM=20, 
		STRING=21;
	public static final int
		RULE_parse = 0, RULE_feature_express = 1, RULE_expression = 2, RULE_inner_expression = 3, 
		RULE_express1 = 4, RULE_express2 = 5, RULE_express3 = 6, RULE_express4 = 7, 
		RULE_express5 = 8, RULE_express6 = 9, RULE_express7 = 10, RULE_single_window_express = 11, 
		RULE_variable_name = 12, RULE_key1 = 13, RULE_key2 = 14, RULE_key3 = 15, 
		RULE_key4 = 16, RULE_key5 = 17, RULE_key6 = 18, RULE_key7 = 19, RULE_key8 = 20, 
		RULE_time_express = 21, RULE_table_name = 22, RULE_field_name = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "feature_express", "expression", "inner_expression", "express1", 
			"express2", "express3", "express4", "express5", "express6", "express7", 
			"single_window_express", "variable_name", "key1", "key2", "key3", "key4", 
			"key5", "key6", "key7", "key8", "time_express", "table_name", "field_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'.'", "'d:'", "':'", "'s'", null, null, null, 
			"'multi_direct'", "'binary_label'", "'original'", "'timediff'", "'isin'", 
			"'combine'", "'dayofweek'", "'hourofday'", "'isweekday'", "'window_sum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DAY", "LIMIT", "SECOND", 
			"MULTI_DIRECT", "BINARY_LABEL", "ORIGINAL", "TIMEDIFF", "ISIN", "COMBINE", 
			"DAYOFWEEK", "HOUROFDAY", "ISWEEKDAY", "WINDOW_SUM", "STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Feature.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FeatureParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public Feature_expressContext feature_express() {
			return getRuleContext(Feature_expressContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FeatureParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			feature_express();
			setState(49);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Feature_expressContext extends ParserRuleContext {
		public Key1Context key1() {
			return getRuleContext(Key1Context.class,0);
		}
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public Key2Context key2() {
			return getRuleContext(Key2Context.class,0);
		}
		public Inner_expressionContext inner_expression() {
			return getRuleContext(Inner_expressionContext.class,0);
		}
		public Key3Context key3() {
			return getRuleContext(Key3Context.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Key4Context key4() {
			return getRuleContext(Key4Context.class,0);
		}
		public Key5Context key5() {
			return getRuleContext(Key5Context.class,0);
		}
		public Key6Context key6() {
			return getRuleContext(Key6Context.class,0);
		}
		public Key7Context key7() {
			return getRuleContext(Key7Context.class,0);
		}
		public Key8Context key8() {
			return getRuleContext(Key8Context.class,0);
		}
		public Time_expressContext time_express() {
			return getRuleContext(Time_expressContext.class,0);
		}
		public Feature_expressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_express; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterFeature_express(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitFeature_express(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitFeature_express(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_expressContext feature_express() throws RecognitionException {
		Feature_expressContext _localctx = new Feature_expressContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_feature_express);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				key1();
				setState(52);
				match(T__0);
				setState(53);
				variable_name();
				setState(54);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				key2();
				setState(57);
				match(T__0);
				setState(58);
				inner_expression();
				setState(59);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				key3();
				setState(62);
				match(T__0);
				setState(63);
				table_name();
				setState(64);
				match(T__2);
				setState(65);
				variable_name();
				setState(66);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				key4();
				setState(69);
				match(T__0);
				setState(70);
				variable_name();
				setState(71);
				match(T__2);
				setState(72);
				variable_name();
				setState(73);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				key5();
				setState(76);
				match(T__0);
				setState(77);
				variable_name();
				setState(78);
				match(T__2);
				setState(79);
				inner_expression();
				setState(80);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				key6();
				setState(83);
				match(T__0);
				setState(84);
				table_name();
				setState(85);
				match(T__2);
				setState(86);
				variable_name();
				setState(87);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				match(T__0);
				setState(90);
				variable_name();
				setState(91);
				match(T__1);
				setState(92);
				key7();
				setState(93);
				match(T__0);
				setState(94);
				variable_name();
				setState(95);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				key8();
				setState(98);
				match(T__0);
				setState(99);
				variable_name();
				setState(100);
				match(T__2);
				setState(101);
				variable_name();
				setState(102);
				match(T__2);
				setState(103);
				time_express();
				setState(104);
				match(T__2);
				setState(105);
				variable_name();
				setState(106);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Key1Context key1() {
			return getRuleContext(Key1Context.class,0);
		}
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public Key2Context key2() {
			return getRuleContext(Key2Context.class,0);
		}
		public Inner_expressionContext inner_expression() {
			return getRuleContext(Inner_expressionContext.class,0);
		}
		public Key4Context key4() {
			return getRuleContext(Key4Context.class,0);
		}
		public Key5Context key5() {
			return getRuleContext(Key5Context.class,0);
		}
		public Key7Context key7() {
			return getRuleContext(Key7Context.class,0);
		}
		public Key8Context key8() {
			return getRuleContext(Key8Context.class,0);
		}
		public Time_expressContext time_express() {
			return getRuleContext(Time_expressContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORIGINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				key1();
				setState(111);
				match(T__0);
				setState(112);
				variable_name();
				setState(113);
				match(T__1);
				}
				break;
			case BINARY_LABEL:
			case DAYOFWEEK:
			case HOUROFDAY:
			case ISWEEKDAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				key2();
				setState(116);
				match(T__0);
				setState(117);
				inner_expression();
				setState(118);
				match(T__1);
				}
				break;
			case TIMEDIFF:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				key4();
				setState(121);
				match(T__0);
				setState(122);
				variable_name();
				setState(123);
				match(T__2);
				setState(124);
				variable_name();
				setState(125);
				match(T__1);
				}
				break;
			case COMBINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				key5();
				setState(128);
				match(T__0);
				setState(129);
				variable_name();
				setState(130);
				match(T__2);
				setState(131);
				inner_expression();
				setState(132);
				match(T__1);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(T__0);
				setState(135);
				variable_name();
				setState(136);
				match(T__1);
				setState(137);
				key7();
				setState(138);
				match(T__0);
				setState(139);
				variable_name();
				setState(140);
				match(T__1);
				}
				break;
			case WINDOW_SUM:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				key8();
				setState(143);
				match(T__0);
				setState(144);
				variable_name();
				setState(145);
				match(T__2);
				setState(146);
				variable_name();
				setState(147);
				match(T__2);
				setState(148);
				time_express();
				setState(149);
				match(T__2);
				setState(150);
				variable_name();
				setState(151);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inner_expressionContext extends ParserRuleContext {
		public Key3Context key3() {
			return getRuleContext(Key3Context.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Inner_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterInner_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitInner_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitInner_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_expressionContext inner_expression() throws RecognitionException {
		Inner_expressionContext _localctx = new Inner_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inner_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			key3();
			setState(156);
			match(T__0);
			setState(157);
			table_name();
			setState(158);
			match(T__2);
			setState(159);
			variable_name();
			setState(160);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Express1Context extends ParserRuleContext {
		public Key1Context key1() {
			return getRuleContext(Key1Context.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Express1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_express1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterExpress1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitExpress1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitExpress1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Express1Context express1() throws RecognitionException {
		Express1Context _localctx = new Express1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_express1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			key1();
			setState(163);
			match(T__0);
			setState(164);
			variable_name();
			setState(165);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Express2Context extends ParserRuleContext {
		public Key2Context key2() {
			return getRuleContext(Key2Context.class,0);
		}
		public Express3Context express3() {
			return getRuleContext(Express3Context.class,0);
		}
		public Express2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_express2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterExpress2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitExpress2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitExpress2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Express2Context express2() throws RecognitionException {
		Express2Context _localctx = new Express2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_express2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			key2();
			setState(168);
			match(T__0);
			setState(169);
			express3();
			setState(170);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Express3Context extends ParserRuleContext {
		public Key3Context key3() {
			return getRuleContext(Key3Context.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Express3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_express3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterExpress3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitExpress3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitExpress3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Express3Context express3() throws RecognitionException {
		Express3Context _localctx = new Express3Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_express3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			key3();
			setState(173);
			match(T__0);
			setState(174);
			table_name();
			setState(175);
			match(T__2);
			setState(176);
			variable_name();
			setState(177);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Express4Context extends ParserRuleContext {
		public Key4Context key4() {
			return getRuleContext(Key4Context.class,0);
		}
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public Express4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_express4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterExpress4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitExpress4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitExpress4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Express4Context express4() throws RecognitionException {
		Express4Context _localctx = new Express4Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_express4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			key4();
			setState(180);
			match(T__0);
			setState(181);
			variable_name();
			setState(182);
			match(T__2);
			setState(183);
			variable_name();
			setState(184);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Express5Context extends ParserRuleContext {
		public Key5Context key5() {
			return getRuleContext(Key5Context.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Express6Context express6() {
			return getRuleContext(Express6Context.class,0);
		}
		public Express5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_express5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterExpress5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitExpress5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitExpress5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Express5Context express5() throws RecognitionException {
		Express5Context _localctx = new Express5Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_express5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			key5();
			setState(187);
			match(T__0);
			setState(188);
			variable_name();
			setState(189);
			match(T__2);
			setState(190);
			express6();
			setState(191);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Express6Context extends ParserRuleContext {
		public Key6Context key6() {
			return getRuleContext(Key6Context.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Express6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_express6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterExpress6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitExpress6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitExpress6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Express6Context express6() throws RecognitionException {
		Express6Context _localctx = new Express6Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_express6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			key6();
			setState(194);
			match(T__0);
			setState(195);
			table_name();
			setState(196);
			match(T__2);
			setState(197);
			variable_name();
			setState(198);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Express7Context extends ParserRuleContext {
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public Key7Context key7() {
			return getRuleContext(Key7Context.class,0);
		}
		public Express7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_express7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterExpress7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitExpress7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitExpress7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Express7Context express7() throws RecognitionException {
		Express7Context _localctx = new Express7Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_express7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__0);
			setState(201);
			variable_name();
			setState(202);
			match(T__1);
			setState(203);
			key7();
			setState(204);
			match(T__0);
			setState(205);
			variable_name();
			setState(206);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_window_expressContext extends ParserRuleContext {
		public Key8Context key8() {
			return getRuleContext(Key8Context.class,0);
		}
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public Time_expressContext time_express() {
			return getRuleContext(Time_expressContext.class,0);
		}
		public Single_window_expressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_window_express; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterSingle_window_express(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitSingle_window_express(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitSingle_window_express(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_window_expressContext single_window_express() throws RecognitionException {
		Single_window_expressContext _localctx = new Single_window_expressContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_single_window_express);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			key8();
			setState(209);
			match(T__0);
			setState(210);
			variable_name();
			setState(211);
			match(T__2);
			setState(212);
			variable_name();
			setState(213);
			match(T__2);
			setState(214);
			time_express();
			setState(215);
			match(T__2);
			setState(216);
			variable_name();
			setState(217);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Field_nameContext field_name() {
			return getRuleContext(Field_nameContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			table_name();
			setState(220);
			match(T__3);
			setState(221);
			field_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key1Context extends ParserRuleContext {
		public TerminalNode ORIGINAL() { return getToken(FeatureParser.ORIGINAL, 0); }
		public Key1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterKey1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitKey1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitKey1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key1Context key1() throws RecognitionException {
		Key1Context _localctx = new Key1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_key1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ORIGINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key2Context extends ParserRuleContext {
		public TerminalNode BINARY_LABEL() { return getToken(FeatureParser.BINARY_LABEL, 0); }
		public TerminalNode DAYOFWEEK() { return getToken(FeatureParser.DAYOFWEEK, 0); }
		public TerminalNode HOUROFDAY() { return getToken(FeatureParser.HOUROFDAY, 0); }
		public TerminalNode ISWEEKDAY() { return getToken(FeatureParser.ISWEEKDAY, 0); }
		public Key2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterKey2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitKey2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitKey2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key2Context key2() throws RecognitionException {
		Key2Context _localctx = new Key2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_key2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BINARY_LABEL) | (1L << DAYOFWEEK) | (1L << HOUROFDAY) | (1L << ISWEEKDAY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key3Context extends ParserRuleContext {
		public TerminalNode MULTI_DIRECT() { return getToken(FeatureParser.MULTI_DIRECT, 0); }
		public Key3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterKey3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitKey3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitKey3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key3Context key3() throws RecognitionException {
		Key3Context _localctx = new Key3Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_key3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(MULTI_DIRECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key4Context extends ParserRuleContext {
		public TerminalNode TIMEDIFF() { return getToken(FeatureParser.TIMEDIFF, 0); }
		public Key4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterKey4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitKey4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitKey4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key4Context key4() throws RecognitionException {
		Key4Context _localctx = new Key4Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_key4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(TIMEDIFF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key5Context extends ParserRuleContext {
		public TerminalNode COMBINE() { return getToken(FeatureParser.COMBINE, 0); }
		public Key5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterKey5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitKey5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitKey5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key5Context key5() throws RecognitionException {
		Key5Context _localctx = new Key5Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_key5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(COMBINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key6Context extends ParserRuleContext {
		public TerminalNode MULTI_DIRECT() { return getToken(FeatureParser.MULTI_DIRECT, 0); }
		public Key6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterKey6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitKey6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitKey6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key6Context key6() throws RecognitionException {
		Key6Context _localctx = new Key6Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_key6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(MULTI_DIRECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key7Context extends ParserRuleContext {
		public TerminalNode ISIN() { return getToken(FeatureParser.ISIN, 0); }
		public Key7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterKey7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitKey7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitKey7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key7Context key7() throws RecognitionException {
		Key7Context _localctx = new Key7Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_key7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ISIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key8Context extends ParserRuleContext {
		public TerminalNode WINDOW_SUM() { return getToken(FeatureParser.WINDOW_SUM, 0); }
		public Key8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterKey8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitKey8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitKey8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key8Context key8() throws RecognitionException {
		Key8Context _localctx = new Key8Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_key8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(WINDOW_SUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_expressContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(FeatureParser.DAY, 0); }
		public TerminalNode LIMIT() { return getToken(FeatureParser.LIMIT, 0); }
		public TerminalNode SECOND() { return getToken(FeatureParser.SECOND, 0); }
		public Time_expressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_express; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterTime_express(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitTime_express(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitTime_express(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_expressContext time_express() throws RecognitionException {
		Time_expressContext _localctx = new Time_expressContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_time_express);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(DAY);
			setState(240);
			match(T__4);
			setState(241);
			match(LIMIT);
			setState(242);
			match(T__5);
			setState(243);
			match(SECOND);
			setState(244);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FeatureParser.STRING, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FeatureParser.STRING, 0); }
		public Field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterField_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitField_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitField_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_nameContext field_name() throws RecognitionException {
		Field_nameContext _localctx = new Field_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00fd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u009c\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\2\3\4\2\16\16\23\25\2\u00f0\2\62\3\2\2\2\4n\3\2\2\2\6\u009b"+
		"\3\2\2\2\b\u009d\3\2\2\2\n\u00a4\3\2\2\2\f\u00a9\3\2\2\2\16\u00ae\3\2"+
		"\2\2\20\u00b5\3\2\2\2\22\u00bc\3\2\2\2\24\u00c3\3\2\2\2\26\u00ca\3\2\2"+
		"\2\30\u00d2\3\2\2\2\32\u00dd\3\2\2\2\34\u00e1\3\2\2\2\36\u00e3\3\2\2\2"+
		" \u00e5\3\2\2\2\"\u00e7\3\2\2\2$\u00e9\3\2\2\2&\u00eb\3\2\2\2(\u00ed\3"+
		"\2\2\2*\u00ef\3\2\2\2,\u00f1\3\2\2\2.\u00f8\3\2\2\2\60\u00fa\3\2\2\2\62"+
		"\63\5\4\3\2\63\64\7\2\2\3\64\3\3\2\2\2\65\66\5\34\17\2\66\67\7\3\2\2\67"+
		"8\5\32\16\289\7\4\2\29o\3\2\2\2:;\5\36\20\2;<\7\3\2\2<=\5\b\5\2=>\7\4"+
		"\2\2>o\3\2\2\2?@\5 \21\2@A\7\3\2\2AB\5.\30\2BC\7\5\2\2CD\5\32\16\2DE\7"+
		"\4\2\2Eo\3\2\2\2FG\5\"\22\2GH\7\3\2\2HI\5\32\16\2IJ\7\5\2\2JK\5\32\16"+
		"\2KL\7\4\2\2Lo\3\2\2\2MN\5$\23\2NO\7\3\2\2OP\5\32\16\2PQ\7\5\2\2QR\5\b"+
		"\5\2RS\7\4\2\2So\3\2\2\2TU\5&\24\2UV\7\3\2\2VW\5.\30\2WX\7\5\2\2XY\5\32"+
		"\16\2YZ\7\4\2\2Zo\3\2\2\2[\\\7\3\2\2\\]\5\32\16\2]^\7\4\2\2^_\5(\25\2"+
		"_`\7\3\2\2`a\5\32\16\2ab\7\4\2\2bo\3\2\2\2cd\5*\26\2de\7\3\2\2ef\5\32"+
		"\16\2fg\7\5\2\2gh\5\32\16\2hi\7\5\2\2ij\5,\27\2jk\7\5\2\2kl\5\32\16\2"+
		"lm\7\4\2\2mo\3\2\2\2n\65\3\2\2\2n:\3\2\2\2n?\3\2\2\2nF\3\2\2\2nM\3\2\2"+
		"\2nT\3\2\2\2n[\3\2\2\2nc\3\2\2\2o\5\3\2\2\2pq\5\34\17\2qr\7\3\2\2rs\5"+
		"\32\16\2st\7\4\2\2t\u009c\3\2\2\2uv\5\36\20\2vw\7\3\2\2wx\5\b\5\2xy\7"+
		"\4\2\2y\u009c\3\2\2\2z{\5\"\22\2{|\7\3\2\2|}\5\32\16\2}~\7\5\2\2~\177"+
		"\5\32\16\2\177\u0080\7\4\2\2\u0080\u009c\3\2\2\2\u0081\u0082\5$\23\2\u0082"+
		"\u0083\7\3\2\2\u0083\u0084\5\32\16\2\u0084\u0085\7\5\2\2\u0085\u0086\5"+
		"\b\5\2\u0086\u0087\7\4\2\2\u0087\u009c\3\2\2\2\u0088\u0089\7\3\2\2\u0089"+
		"\u008a\5\32\16\2\u008a\u008b\7\4\2\2\u008b\u008c\5(\25\2\u008c\u008d\7"+
		"\3\2\2\u008d\u008e\5\32\16\2\u008e\u008f\7\4\2\2\u008f\u009c\3\2\2\2\u0090"+
		"\u0091\5*\26\2\u0091\u0092\7\3\2\2\u0092\u0093\5\32\16\2\u0093\u0094\7"+
		"\5\2\2\u0094\u0095\5\32\16\2\u0095\u0096\7\5\2\2\u0096\u0097\5,\27\2\u0097"+
		"\u0098\7\5\2\2\u0098\u0099\5\32\16\2\u0099\u009a\7\4\2\2\u009a\u009c\3"+
		"\2\2\2\u009bp\3\2\2\2\u009bu\3\2\2\2\u009bz\3\2\2\2\u009b\u0081\3\2\2"+
		"\2\u009b\u0088\3\2\2\2\u009b\u0090\3\2\2\2\u009c\7\3\2\2\2\u009d\u009e"+
		"\5 \21\2\u009e\u009f\7\3\2\2\u009f\u00a0\5.\30\2\u00a0\u00a1\7\5\2\2\u00a1"+
		"\u00a2\5\32\16\2\u00a2\u00a3\7\4\2\2\u00a3\t\3\2\2\2\u00a4\u00a5\5\34"+
		"\17\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8\7\4\2\2\u00a8"+
		"\13\3\2\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7\3\2\2\u00ab\u00ac\5\16"+
		"\b\2\u00ac\u00ad\7\4\2\2\u00ad\r\3\2\2\2\u00ae\u00af\5 \21\2\u00af\u00b0"+
		"\7\3\2\2\u00b0\u00b1\5.\30\2\u00b1\u00b2\7\5\2\2\u00b2\u00b3\5\32\16\2"+
		"\u00b3\u00b4\7\4\2\2\u00b4\17\3\2\2\2\u00b5\u00b6\5\"\22\2\u00b6\u00b7"+
		"\7\3\2\2\u00b7\u00b8\5\32\16\2\u00b8\u00b9\7\5\2\2\u00b9\u00ba\5\32\16"+
		"\2\u00ba\u00bb\7\4\2\2\u00bb\21\3\2\2\2\u00bc\u00bd\5$\23\2\u00bd\u00be"+
		"\7\3\2\2\u00be\u00bf\5\32\16\2\u00bf\u00c0\7\5\2\2\u00c0\u00c1\5\24\13"+
		"\2\u00c1\u00c2\7\4\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\5&\24\2\u00c4\u00c5"+
		"\7\3\2\2\u00c5\u00c6\5.\30\2\u00c6\u00c7\7\5\2\2\u00c7\u00c8\5\32\16\2"+
		"\u00c8\u00c9\7\4\2\2\u00c9\25\3\2\2\2\u00ca\u00cb\7\3\2\2\u00cb\u00cc"+
		"\5\32\16\2\u00cc\u00cd\7\4\2\2\u00cd\u00ce\5(\25\2\u00ce\u00cf\7\3\2\2"+
		"\u00cf\u00d0\5\32\16\2\u00d0\u00d1\7\4\2\2\u00d1\27\3\2\2\2\u00d2\u00d3"+
		"\5*\26\2\u00d3\u00d4\7\3\2\2\u00d4\u00d5\5\32\16\2\u00d5\u00d6\7\5\2\2"+
		"\u00d6\u00d7\5\32\16\2\u00d7\u00d8\7\5\2\2\u00d8\u00d9\5,\27\2\u00d9\u00da"+
		"\7\5\2\2\u00da\u00db\5\32\16\2\u00db\u00dc\7\4\2\2\u00dc\31\3\2\2\2\u00dd"+
		"\u00de\5.\30\2\u00de\u00df\7\6\2\2\u00df\u00e0\5\60\31\2\u00e0\33\3\2"+
		"\2\2\u00e1\u00e2\7\17\2\2\u00e2\35\3\2\2\2\u00e3\u00e4\t\2\2\2\u00e4\37"+
		"\3\2\2\2\u00e5\u00e6\7\r\2\2\u00e6!\3\2\2\2\u00e7\u00e8\7\20\2\2\u00e8"+
		"#\3\2\2\2\u00e9\u00ea\7\22\2\2\u00ea%\3\2\2\2\u00eb\u00ec\7\r\2\2\u00ec"+
		"\'\3\2\2\2\u00ed\u00ee\7\21\2\2\u00ee)\3\2\2\2\u00ef\u00f0\7\26\2\2\u00f0"+
		"+\3\2\2\2\u00f1\u00f2\7\n\2\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\7\13\2\2"+
		"\u00f4\u00f5\7\b\2\2\u00f5\u00f6\7\f\2\2\u00f6\u00f7\7\t\2\2\u00f7-\3"+
		"\2\2\2\u00f8\u00f9\7\27\2\2\u00f9/\3\2\2\2\u00fa\u00fb\7\27\2\2\u00fb"+
		"\61\3\2\2\2\4n\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}