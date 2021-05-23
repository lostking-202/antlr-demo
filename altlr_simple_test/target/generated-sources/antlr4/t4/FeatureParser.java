// Generated from t4\Feature.g4 by ANTLR 4.9.2
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
		RULE_parse = 0, RULE_feature_express = 1, RULE_key = 2, RULE_feature_express2 = 3, 
		RULE_expression = 4, RULE_inner_expression = 5, RULE_express1 = 6, RULE_express2 = 7, 
		RULE_express3 = 8, RULE_express4 = 9, RULE_express5 = 10, RULE_express6 = 11, 
		RULE_express7 = 12, RULE_single_window_express = 13, RULE_variable_name = 14, 
		RULE_key1 = 15, RULE_key2 = 16, RULE_key3 = 17, RULE_key4 = 18, RULE_key5 = 19, 
		RULE_key6 = 20, RULE_key7 = 21, RULE_key8 = 22, RULE_time_express = 23, 
		RULE_table_name = 24, RULE_field_name = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "feature_express", "key", "feature_express2", "expression", 
			"inner_expression", "express1", "express2", "express3", "express4", "express5", 
			"express6", "express7", "single_window_express", "variable_name", "key1", 
			"key2", "key3", "key4", "key5", "key6", "key7", "key8", "time_express", 
			"table_name", "field_name"
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
			setState(52);
			feature_express(0);
			setState(53);
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
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Feature_expressContext feature_express() {
			return getRuleContext(Feature_expressContext.class,0);
		}
		public Key7Context key7() {
			return getRuleContext(Key7Context.class,0);
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
		return feature_express(0);
	}

	private Feature_expressContext feature_express(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Feature_expressContext _localctx = new Feature_expressContext(_ctx, _parentState);
		Feature_expressContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_feature_express, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(56);
				key();
				setState(57);
				match(T__0);
				setState(58);
				variable_name();
				}
				break;
			case 2:
				{
				setState(60);
				key();
				setState(61);
				match(T__0);
				setState(62);
				variable_name();
				}
				break;
			case 3:
				{
				setState(64);
				match(T__0);
				setState(65);
				variable_name();
				}
				break;
			case 4:
				{
				setState(66);
				key();
				setState(67);
				match(T__0);
				setState(68);
				variable_name();
				}
				break;
			case 5:
				{
				setState(70);
				key();
				setState(71);
				match(T__0);
				setState(72);
				table_name();
				setState(73);
				match(T__2);
				setState(74);
				variable_name();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new Feature_expressContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_feature_express);
						setState(78);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(79);
						match(T__1);
						}
						break;
					case 2:
						{
						_localctx = new Feature_expressContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_feature_express);
						setState(80);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(81);
						match(T__2);
						setState(82);
						variable_name();
						}
						break;
					case 3:
						{
						_localctx = new Feature_expressContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_feature_express);
						setState(83);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(84);
						match(T__1);
						}
						break;
					case 4:
						{
						_localctx = new Feature_expressContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_feature_express);
						setState(85);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(86);
						match(T__1);
						setState(87);
						key7();
						setState(88);
						match(T__0);
						setState(89);
						variable_name();
						}
						break;
					case 5:
						{
						_localctx = new Feature_expressContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_feature_express);
						setState(91);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(92);
						match(T__1);
						}
						break;
					case 6:
						{
						_localctx = new Feature_expressContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_feature_express);
						setState(93);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94);
						match(T__2);
						setState(95);
						variable_name();
						}
						break;
					case 7:
						{
						_localctx = new Feature_expressContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_feature_express);
						setState(96);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(97);
						match(T__2);
						setState(98);
						time_express();
						setState(99);
						match(T__2);
						setState(100);
						variable_name();
						}
						break;
					case 8:
						{
						_localctx = new Feature_expressContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_feature_express);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(103);
						match(T__1);
						}
						break;
					case 9:
						{
						_localctx = new Feature_expressContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_feature_express);
						setState(104);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(105);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode ORIGINAL() { return getToken(FeatureParser.ORIGINAL, 0); }
		public TerminalNode BINARY_LABEL() { return getToken(FeatureParser.BINARY_LABEL, 0); }
		public TerminalNode DAYOFWEEK() { return getToken(FeatureParser.DAYOFWEEK, 0); }
		public TerminalNode HOUROFDAY() { return getToken(FeatureParser.HOUROFDAY, 0); }
		public TerminalNode ISWEEKDAY() { return getToken(FeatureParser.ISWEEKDAY, 0); }
		public TerminalNode MULTI_DIRECT() { return getToken(FeatureParser.MULTI_DIRECT, 0); }
		public TerminalNode TIMEDIFF() { return getToken(FeatureParser.TIMEDIFF, 0); }
		public TerminalNode COMBINE() { return getToken(FeatureParser.COMBINE, 0); }
		public TerminalNode ISIN() { return getToken(FeatureParser.ISIN, 0); }
		public TerminalNode WINDOW_SUM() { return getToken(FeatureParser.WINDOW_SUM, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTI_DIRECT) | (1L << BINARY_LABEL) | (1L << ORIGINAL) | (1L << TIMEDIFF) | (1L << ISIN) | (1L << COMBINE) | (1L << DAYOFWEEK) | (1L << HOUROFDAY) | (1L << ISWEEKDAY) | (1L << WINDOW_SUM))) != 0)) ) {
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

	public static class Feature_express2Context extends ParserRuleContext {
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
		public Feature_express2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_express2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterFeature_express2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitFeature_express2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitFeature_express2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_express2Context feature_express2() throws RecognitionException {
		Feature_express2Context _localctx = new Feature_express2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature_express2);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				key1();
				setState(114);
				match(T__0);
				setState(115);
				variable_name();
				setState(116);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				key2();
				setState(119);
				match(T__0);
				setState(120);
				inner_expression();
				setState(121);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				key3();
				setState(124);
				match(T__0);
				setState(125);
				table_name();
				setState(126);
				match(T__2);
				setState(127);
				variable_name();
				setState(128);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				key4();
				setState(131);
				match(T__0);
				setState(132);
				variable_name();
				setState(133);
				match(T__2);
				setState(134);
				variable_name();
				setState(135);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				key5();
				setState(138);
				match(T__0);
				setState(139);
				variable_name();
				setState(140);
				match(T__2);
				setState(141);
				inner_expression();
				setState(142);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				key6();
				setState(145);
				match(T__0);
				setState(146);
				table_name();
				setState(147);
				match(T__2);
				setState(148);
				variable_name();
				setState(149);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				match(T__0);
				setState(152);
				variable_name();
				setState(153);
				match(T__1);
				setState(154);
				key7();
				setState(155);
				match(T__0);
				setState(156);
				variable_name();
				setState(157);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				key8();
				setState(160);
				match(T__0);
				setState(161);
				variable_name();
				setState(162);
				match(T__2);
				setState(163);
				variable_name();
				setState(164);
				match(T__2);
				setState(165);
				time_express();
				setState(166);
				match(T__2);
				setState(167);
				variable_name();
				setState(168);
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
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORIGINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				key1();
				setState(173);
				match(T__0);
				setState(174);
				variable_name();
				setState(175);
				match(T__1);
				}
				break;
			case BINARY_LABEL:
			case DAYOFWEEK:
			case HOUROFDAY:
			case ISWEEKDAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				key2();
				setState(178);
				match(T__0);
				setState(179);
				inner_expression();
				setState(180);
				match(T__1);
				}
				break;
			case TIMEDIFF:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				key4();
				setState(183);
				match(T__0);
				setState(184);
				variable_name();
				setState(185);
				match(T__2);
				setState(186);
				variable_name();
				setState(187);
				match(T__1);
				}
				break;
			case COMBINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				key5();
				setState(190);
				match(T__0);
				setState(191);
				variable_name();
				setState(192);
				match(T__2);
				setState(193);
				inner_expression();
				setState(194);
				match(T__1);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(T__0);
				setState(197);
				variable_name();
				setState(198);
				match(T__1);
				setState(199);
				key7();
				setState(200);
				match(T__0);
				setState(201);
				variable_name();
				setState(202);
				match(T__1);
				}
				break;
			case WINDOW_SUM:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				key8();
				setState(205);
				match(T__0);
				setState(206);
				variable_name();
				setState(207);
				match(T__2);
				setState(208);
				variable_name();
				setState(209);
				match(T__2);
				setState(210);
				time_express();
				setState(211);
				match(T__2);
				setState(212);
				variable_name();
				setState(213);
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
		enterRule(_localctx, 10, RULE_inner_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			key3();
			setState(218);
			match(T__0);
			setState(219);
			table_name();
			setState(220);
			match(T__2);
			setState(221);
			variable_name();
			setState(222);
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
		enterRule(_localctx, 12, RULE_express1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			key1();
			setState(225);
			match(T__0);
			setState(226);
			variable_name();
			setState(227);
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
		enterRule(_localctx, 14, RULE_express2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			key2();
			setState(230);
			match(T__0);
			setState(231);
			express3();
			setState(232);
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
		enterRule(_localctx, 16, RULE_express3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			key3();
			setState(235);
			match(T__0);
			setState(236);
			table_name();
			setState(237);
			match(T__2);
			setState(238);
			variable_name();
			setState(239);
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
		enterRule(_localctx, 18, RULE_express4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			key4();
			setState(242);
			match(T__0);
			setState(243);
			variable_name();
			setState(244);
			match(T__2);
			setState(245);
			variable_name();
			setState(246);
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
		enterRule(_localctx, 20, RULE_express5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			key5();
			setState(249);
			match(T__0);
			setState(250);
			variable_name();
			setState(251);
			match(T__2);
			setState(252);
			express6();
			setState(253);
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
		enterRule(_localctx, 22, RULE_express6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			key6();
			setState(256);
			match(T__0);
			setState(257);
			table_name();
			setState(258);
			match(T__2);
			setState(259);
			variable_name();
			setState(260);
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
		enterRule(_localctx, 24, RULE_express7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__0);
			setState(263);
			variable_name();
			setState(264);
			match(T__1);
			setState(265);
			key7();
			setState(266);
			match(T__0);
			setState(267);
			variable_name();
			setState(268);
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
		enterRule(_localctx, 26, RULE_single_window_express);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			key8();
			setState(271);
			match(T__0);
			setState(272);
			variable_name();
			setState(273);
			match(T__2);
			setState(274);
			variable_name();
			setState(275);
			match(T__2);
			setState(276);
			time_express();
			setState(277);
			match(T__2);
			setState(278);
			variable_name();
			setState(279);
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
		enterRule(_localctx, 28, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			table_name();
			setState(282);
			match(T__3);
			setState(283);
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
		enterRule(_localctx, 30, RULE_key1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		enterRule(_localctx, 32, RULE_key2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
		enterRule(_localctx, 34, RULE_key3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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
		enterRule(_localctx, 36, RULE_key4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		enterRule(_localctx, 38, RULE_key5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		enterRule(_localctx, 40, RULE_key6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 42, RULE_key7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		enterRule(_localctx, 44, RULE_key8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		enterRule(_localctx, 46, RULE_time_express);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(DAY);
			setState(302);
			match(T__4);
			setState(303);
			match(LIMIT);
			setState(304);
			match(T__5);
			setState(305);
			match(SECOND);
			setState(306);
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
		enterRule(_localctx, 48, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		enterRule(_localctx, 50, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return feature_express_sempred((Feature_expressContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean feature_express_sempred(Feature_expressContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u013b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00ad\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00da\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\2\3\4\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\2\4\3\2\r\26\4\2\16\16\23\25\2\u0139\2\66\3\2\2\2\4"+
		"N\3\2\2\2\6q\3\2\2\2\b\u00ac\3\2\2\2\n\u00d9\3\2\2\2\f\u00db\3\2\2\2\16"+
		"\u00e2\3\2\2\2\20\u00e7\3\2\2\2\22\u00ec\3\2\2\2\24\u00f3\3\2\2\2\26\u00fa"+
		"\3\2\2\2\30\u0101\3\2\2\2\32\u0108\3\2\2\2\34\u0110\3\2\2\2\36\u011b\3"+
		"\2\2\2 \u011f\3\2\2\2\"\u0121\3\2\2\2$\u0123\3\2\2\2&\u0125\3\2\2\2(\u0127"+
		"\3\2\2\2*\u0129\3\2\2\2,\u012b\3\2\2\2.\u012d\3\2\2\2\60\u012f\3\2\2\2"+
		"\62\u0136\3\2\2\2\64\u0138\3\2\2\2\66\67\5\4\3\2\678\7\2\2\38\3\3\2\2"+
		"\29:\b\3\1\2:;\5\6\4\2;<\7\3\2\2<=\5\36\20\2=O\3\2\2\2>?\5\6\4\2?@\7\3"+
		"\2\2@A\5\36\20\2AO\3\2\2\2BC\7\3\2\2CO\5\36\20\2DE\5\6\4\2EF\7\3\2\2F"+
		"G\5\36\20\2GO\3\2\2\2HI\5\6\4\2IJ\7\3\2\2JK\5\62\32\2KL\7\5\2\2LM\5\36"+
		"\20\2MO\3\2\2\2N9\3\2\2\2N>\3\2\2\2NB\3\2\2\2ND\3\2\2\2NH\3\2\2\2On\3"+
		"\2\2\2PQ\f\17\2\2Qm\7\4\2\2RS\f\r\2\2ST\7\5\2\2Tm\5\36\20\2UV\f\f\2\2"+
		"Vm\7\4\2\2WX\f\n\2\2XY\7\4\2\2YZ\5,\27\2Z[\7\3\2\2[\\\5\36\20\2\\m\3\2"+
		"\2\2]^\f\t\2\2^m\7\4\2\2_`\f\7\2\2`a\7\5\2\2am\5\36\20\2bc\f\6\2\2cd\7"+
		"\5\2\2de\5\60\31\2ef\7\5\2\2fg\5\36\20\2gm\3\2\2\2hi\f\5\2\2im\7\4\2\2"+
		"jk\f\3\2\2km\7\4\2\2lP\3\2\2\2lR\3\2\2\2lU\3\2\2\2lW\3\2\2\2l]\3\2\2\2"+
		"l_\3\2\2\2lb\3\2\2\2lh\3\2\2\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"o\5\3\2\2\2pn\3\2\2\2qr\t\2\2\2r\7\3\2\2\2st\5 \21\2tu\7\3\2\2uv\5\36"+
		"\20\2vw\7\4\2\2w\u00ad\3\2\2\2xy\5\"\22\2yz\7\3\2\2z{\5\f\7\2{|\7\4\2"+
		"\2|\u00ad\3\2\2\2}~\5$\23\2~\177\7\3\2\2\177\u0080\5\62\32\2\u0080\u0081"+
		"\7\5\2\2\u0081\u0082\5\36\20\2\u0082\u0083\7\4\2\2\u0083\u00ad\3\2\2\2"+
		"\u0084\u0085\5&\24\2\u0085\u0086\7\3\2\2\u0086\u0087\5\36\20\2\u0087\u0088"+
		"\7\5\2\2\u0088\u0089\5\36\20\2\u0089\u008a\7\4\2\2\u008a\u00ad\3\2\2\2"+
		"\u008b\u008c\5(\25\2\u008c\u008d\7\3\2\2\u008d\u008e\5\36\20\2\u008e\u008f"+
		"\7\5\2\2\u008f\u0090\5\f\7\2\u0090\u0091\7\4\2\2\u0091\u00ad\3\2\2\2\u0092"+
		"\u0093\5*\26\2\u0093\u0094\7\3\2\2\u0094\u0095\5\62\32\2\u0095\u0096\7"+
		"\5\2\2\u0096\u0097\5\36\20\2\u0097\u0098\7\4\2\2\u0098\u00ad\3\2\2\2\u0099"+
		"\u009a\7\3\2\2\u009a\u009b\5\36\20\2\u009b\u009c\7\4\2\2\u009c\u009d\5"+
		",\27\2\u009d\u009e\7\3\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\7\4\2\2\u00a0"+
		"\u00ad\3\2\2\2\u00a1\u00a2\5.\30\2\u00a2\u00a3\7\3\2\2\u00a3\u00a4\5\36"+
		"\20\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\5\36\20\2\u00a6\u00a7\7\5\2\2\u00a7"+
		"\u00a8\5\60\31\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab"+
		"\7\4\2\2\u00ab\u00ad\3\2\2\2\u00acs\3\2\2\2\u00acx\3\2\2\2\u00ac}\3\2"+
		"\2\2\u00ac\u0084\3\2\2\2\u00ac\u008b\3\2\2\2\u00ac\u0092\3\2\2\2\u00ac"+
		"\u0099\3\2\2\2\u00ac\u00a1\3\2\2\2\u00ad\t\3\2\2\2\u00ae\u00af\5 \21\2"+
		"\u00af\u00b0\7\3\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\7\4\2\2\u00b2\u00da"+
		"\3\2\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00b5\7\3\2\2\u00b5\u00b6\5\f\7\2"+
		"\u00b6\u00b7\7\4\2\2\u00b7\u00da\3\2\2\2\u00b8\u00b9\5&\24\2\u00b9\u00ba"+
		"\7\3\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00bc\7\5\2\2\u00bc\u00bd\5\36\20"+
		"\2\u00bd\u00be\7\4\2\2\u00be\u00da\3\2\2\2\u00bf\u00c0\5(\25\2\u00c0\u00c1"+
		"\7\3\2\2\u00c1\u00c2\5\36\20\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\5\f\7\2"+
		"\u00c4\u00c5\7\4\2\2\u00c5\u00da\3\2\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8"+
		"\5\36\20\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca\5,\27\2\u00ca\u00cb\7\3\2\2"+
		"\u00cb\u00cc\5\36\20\2\u00cc\u00cd\7\4\2\2\u00cd\u00da\3\2\2\2\u00ce\u00cf"+
		"\5.\30\2\u00cf\u00d0\7\3\2\2\u00d0\u00d1\5\36\20\2\u00d1\u00d2\7\5\2\2"+
		"\u00d2\u00d3\5\36\20\2\u00d3\u00d4\7\5\2\2\u00d4\u00d5\5\60\31\2\u00d5"+
		"\u00d6\7\5\2\2\u00d6\u00d7\5\36\20\2\u00d7\u00d8\7\4\2\2\u00d8\u00da\3"+
		"\2\2\2\u00d9\u00ae\3\2\2\2\u00d9\u00b3\3\2\2\2\u00d9\u00b8\3\2\2\2\u00d9"+
		"\u00bf\3\2\2\2\u00d9\u00c6\3\2\2\2\u00d9\u00ce\3\2\2\2\u00da\13\3\2\2"+
		"\2\u00db\u00dc\5$\23\2\u00dc\u00dd\7\3\2\2\u00dd\u00de\5\62\32\2\u00de"+
		"\u00df\7\5\2\2\u00df\u00e0\5\36\20\2\u00e0\u00e1\7\4\2\2\u00e1\r\3\2\2"+
		"\2\u00e2\u00e3\5 \21\2\u00e3\u00e4\7\3\2\2\u00e4\u00e5\5\36\20\2\u00e5"+
		"\u00e6\7\4\2\2\u00e6\17\3\2\2\2\u00e7\u00e8\5\"\22\2\u00e8\u00e9\7\3\2"+
		"\2\u00e9\u00ea\5\22\n\2\u00ea\u00eb\7\4\2\2\u00eb\21\3\2\2\2\u00ec\u00ed"+
		"\5$\23\2\u00ed\u00ee\7\3\2\2\u00ee\u00ef\5\62\32\2\u00ef\u00f0\7\5\2\2"+
		"\u00f0\u00f1\5\36\20\2\u00f1\u00f2\7\4\2\2\u00f2\23\3\2\2\2\u00f3\u00f4"+
		"\5&\24\2\u00f4\u00f5\7\3\2\2\u00f5\u00f6\5\36\20\2\u00f6\u00f7\7\5\2\2"+
		"\u00f7\u00f8\5\36\20\2\u00f8\u00f9\7\4\2\2\u00f9\25\3\2\2\2\u00fa\u00fb"+
		"\5(\25\2\u00fb\u00fc\7\3\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\7\5\2\2"+
		"\u00fe\u00ff\5\30\r\2\u00ff\u0100\7\4\2\2\u0100\27\3\2\2\2\u0101\u0102"+
		"\5*\26\2\u0102\u0103\7\3\2\2\u0103\u0104\5\62\32\2\u0104\u0105\7\5\2\2"+
		"\u0105\u0106\5\36\20\2\u0106\u0107\7\4\2\2\u0107\31\3\2\2\2\u0108\u0109"+
		"\7\3\2\2\u0109\u010a\5\36\20\2\u010a\u010b\7\4\2\2\u010b\u010c\5,\27\2"+
		"\u010c\u010d\7\3\2\2\u010d\u010e\5\36\20\2\u010e\u010f\7\4\2\2\u010f\33"+
		"\3\2\2\2\u0110\u0111\5.\30\2\u0111\u0112\7\3\2\2\u0112\u0113\5\36\20\2"+
		"\u0113\u0114\7\5\2\2\u0114\u0115\5\36\20\2\u0115\u0116\7\5\2\2\u0116\u0117"+
		"\5\60\31\2\u0117\u0118\7\5\2\2\u0118\u0119\5\36\20\2\u0119\u011a\7\4\2"+
		"\2\u011a\35\3\2\2\2\u011b\u011c\5\62\32\2\u011c\u011d\7\6\2\2\u011d\u011e"+
		"\5\64\33\2\u011e\37\3\2\2\2\u011f\u0120\7\17\2\2\u0120!\3\2\2\2\u0121"+
		"\u0122\t\3\2\2\u0122#\3\2\2\2\u0123\u0124\7\r\2\2\u0124%\3\2\2\2\u0125"+
		"\u0126\7\20\2\2\u0126\'\3\2\2\2\u0127\u0128\7\22\2\2\u0128)\3\2\2\2\u0129"+
		"\u012a\7\r\2\2\u012a+\3\2\2\2\u012b\u012c\7\21\2\2\u012c-\3\2\2\2\u012d"+
		"\u012e\7\26\2\2\u012e/\3\2\2\2\u012f\u0130\7\n\2\2\u0130\u0131\7\7\2\2"+
		"\u0131\u0132\7\13\2\2\u0132\u0133\7\b\2\2\u0133\u0134\7\f\2\2\u0134\u0135"+
		"\7\t\2\2\u0135\61\3\2\2\2\u0136\u0137\7\27\2\2\u0137\63\3\2\2\2\u0138"+
		"\u0139\7\27\2\2\u0139\65\3\2\2\2\7Nln\u00ac\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}