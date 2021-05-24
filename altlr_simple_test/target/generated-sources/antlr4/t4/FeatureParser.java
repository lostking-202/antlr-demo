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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SUBTRACT=8, MULTIPLY=9, 
		DIVIDE=10, ADD=11, LOG=12, REGRESSION_LABEL=13, SPLIT=14, SPLIT_KEY=15, 
		WINDOW_MAX=16, WINDOW_MIN=17, WINDOW_AVG=18, WINDOW_UNIQUE_COUNT=19, WINDOW_COUNT=20, 
		WINDOW_TOP1_RATIO=21, DAY=22, LIMIT=23, SECOND=24, MULTI_DIRECT=25, BINARY_LABEL=26, 
		ORIGINAL=27, TIMEDIFF=28, ISIN=29, COMBINE=30, DAYOFWEEK=31, HOUROFDAY=32, 
		ISWEEKDAY=33, WINDOW_SUM=34, STRING=35;
	public static final int
		RULE_parse = 0, RULE_feature_express = 1, RULE_key = 2, RULE_single_window_express = 3, 
		RULE_variable_name = 4, RULE_time_express = 5, RULE_table_name = 6, RULE_field_name = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "feature_express", "key", "single_window_express", "variable_name", 
			"time_express", "table_name", "field_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'.'", "'d:'", "':'", "'s'", "'subtract'", 
			"'multiply'", "'divide'", "'add'", "'log'", "'regression_label'", "'split'", 
			"'split_key'", "'window_max'", "'window_min'", "'window_avg'", "'window_unique_count'", 
			"'window_count'", "'window_top1_ratio'", null, null, null, "'multi_direct'", 
			"'binary_label'", "'original'", "'timediff'", "'isin'", "'combine'", 
			"'dayofweek'", "'hourofday'", "'isweekday'", "'window_sum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SUBTRACT", "MULTIPLY", 
			"DIVIDE", "ADD", "LOG", "REGRESSION_LABEL", "SPLIT", "SPLIT_KEY", "WINDOW_MAX", 
			"WINDOW_MIN", "WINDOW_AVG", "WINDOW_UNIQUE_COUNT", "WINDOW_COUNT", "WINDOW_TOP1_RATIO", 
			"DAY", "LIMIT", "SECOND", "MULTI_DIRECT", "BINARY_LABEL", "ORIGINAL", 
			"TIMEDIFF", "ISIN", "COMBINE", "DAYOFWEEK", "HOUROFDAY", "ISWEEKDAY", 
			"WINDOW_SUM", "STRING"
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
			setState(16);
			feature_express();
			setState(17);
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
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public List<Feature_expressContext> feature_express() {
			return getRuleContexts(Feature_expressContext.class);
		}
		public Feature_expressContext feature_express(int i) {
			return getRuleContext(Feature_expressContext.class,i);
		}
		public Time_expressContext time_express() {
			return getRuleContext(Time_expressContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				key();
				setState(20);
				match(T__0);
				setState(23);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(21);
					variable_name();
					}
					break;
				case T__0:
				case SUBTRACT:
				case MULTIPLY:
				case DIVIDE:
				case ADD:
				case REGRESSION_LABEL:
				case SPLIT:
				case SPLIT_KEY:
				case WINDOW_MAX:
				case WINDOW_MIN:
				case WINDOW_AVG:
				case WINDOW_UNIQUE_COUNT:
				case WINDOW_COUNT:
				case WINDOW_TOP1_RATIO:
				case MULTI_DIRECT:
				case BINARY_LABEL:
				case ORIGINAL:
				case TIMEDIFF:
				case ISIN:
				case COMBINE:
				case DAYOFWEEK:
				case HOUROFDAY:
				case ISWEEKDAY:
				case WINDOW_SUM:
					{
					setState(22);
					feature_express();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(25);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				key();
				setState(28);
				match(T__0);
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(29);
					variable_name();
					}
					break;
				case T__0:
				case SUBTRACT:
				case MULTIPLY:
				case DIVIDE:
				case ADD:
				case REGRESSION_LABEL:
				case SPLIT:
				case SPLIT_KEY:
				case WINDOW_MAX:
				case WINDOW_MIN:
				case WINDOW_AVG:
				case WINDOW_UNIQUE_COUNT:
				case WINDOW_COUNT:
				case WINDOW_TOP1_RATIO:
				case MULTI_DIRECT:
				case BINARY_LABEL:
				case ORIGINAL:
				case TIMEDIFF:
				case ISIN:
				case COMBINE:
				case DAYOFWEEK:
				case HOUROFDAY:
				case ISWEEKDAY:
				case WINDOW_SUM:
					{
					setState(30);
					feature_express();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(33);
				match(T__2);
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(34);
					variable_name();
					}
					break;
				case T__0:
				case SUBTRACT:
				case MULTIPLY:
				case DIVIDE:
				case ADD:
				case REGRESSION_LABEL:
				case SPLIT:
				case SPLIT_KEY:
				case WINDOW_MAX:
				case WINDOW_MIN:
				case WINDOW_AVG:
				case WINDOW_UNIQUE_COUNT:
				case WINDOW_COUNT:
				case WINDOW_TOP1_RATIO:
				case MULTI_DIRECT:
				case BINARY_LABEL:
				case ORIGINAL:
				case TIMEDIFF:
				case ISIN:
				case COMBINE:
				case DAYOFWEEK:
				case HOUROFDAY:
				case ISWEEKDAY:
				case WINDOW_SUM:
					{
					setState(35);
					feature_express();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(38);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(T__0);
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(41);
					variable_name();
					}
					break;
				case T__0:
				case SUBTRACT:
				case MULTIPLY:
				case DIVIDE:
				case ADD:
				case REGRESSION_LABEL:
				case SPLIT:
				case SPLIT_KEY:
				case WINDOW_MAX:
				case WINDOW_MIN:
				case WINDOW_AVG:
				case WINDOW_UNIQUE_COUNT:
				case WINDOW_COUNT:
				case WINDOW_TOP1_RATIO:
				case MULTI_DIRECT:
				case BINARY_LABEL:
				case ORIGINAL:
				case TIMEDIFF:
				case ISIN:
				case COMBINE:
				case DAYOFWEEK:
				case HOUROFDAY:
				case ISWEEKDAY:
				case WINDOW_SUM:
					{
					setState(42);
					feature_express();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(45);
				match(T__1);
				setState(46);
				key();
				setState(47);
				match(T__0);
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(48);
					variable_name();
					}
					break;
				case T__0:
				case SUBTRACT:
				case MULTIPLY:
				case DIVIDE:
				case ADD:
				case REGRESSION_LABEL:
				case SPLIT:
				case SPLIT_KEY:
				case WINDOW_MAX:
				case WINDOW_MIN:
				case WINDOW_AVG:
				case WINDOW_UNIQUE_COUNT:
				case WINDOW_COUNT:
				case WINDOW_TOP1_RATIO:
				case MULTI_DIRECT:
				case BINARY_LABEL:
				case ORIGINAL:
				case TIMEDIFF:
				case ISIN:
				case COMBINE:
				case DAYOFWEEK:
				case HOUROFDAY:
				case ISWEEKDAY:
				case WINDOW_SUM:
					{
					setState(49);
					feature_express();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(52);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				key();
				setState(55);
				match(T__0);
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(56);
					variable_name();
					}
					break;
				case T__0:
				case SUBTRACT:
				case MULTIPLY:
				case DIVIDE:
				case ADD:
				case REGRESSION_LABEL:
				case SPLIT:
				case SPLIT_KEY:
				case WINDOW_MAX:
				case WINDOW_MIN:
				case WINDOW_AVG:
				case WINDOW_UNIQUE_COUNT:
				case WINDOW_COUNT:
				case WINDOW_TOP1_RATIO:
				case MULTI_DIRECT:
				case BINARY_LABEL:
				case ORIGINAL:
				case TIMEDIFF:
				case ISIN:
				case COMBINE:
				case DAYOFWEEK:
				case HOUROFDAY:
				case ISWEEKDAY:
				case WINDOW_SUM:
					{
					setState(57);
					feature_express();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60);
				match(T__2);
				setState(63);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(61);
					variable_name();
					}
					break;
				case T__0:
				case SUBTRACT:
				case MULTIPLY:
				case DIVIDE:
				case ADD:
				case REGRESSION_LABEL:
				case SPLIT:
				case SPLIT_KEY:
				case WINDOW_MAX:
				case WINDOW_MIN:
				case WINDOW_AVG:
				case WINDOW_UNIQUE_COUNT:
				case WINDOW_COUNT:
				case WINDOW_TOP1_RATIO:
				case MULTI_DIRECT:
				case BINARY_LABEL:
				case ORIGINAL:
				case TIMEDIFF:
				case ISIN:
				case COMBINE:
				case DAYOFWEEK:
				case HOUROFDAY:
				case ISWEEKDAY:
				case WINDOW_SUM:
					{
					setState(62);
					feature_express();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65);
				match(T__2);
				setState(66);
				time_express();
				setState(67);
				match(T__2);
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(68);
					variable_name();
					}
					break;
				case T__0:
				case SUBTRACT:
				case MULTIPLY:
				case DIVIDE:
				case ADD:
				case REGRESSION_LABEL:
				case SPLIT:
				case SPLIT_KEY:
				case WINDOW_MAX:
				case WINDOW_MIN:
				case WINDOW_AVG:
				case WINDOW_UNIQUE_COUNT:
				case WINDOW_COUNT:
				case WINDOW_TOP1_RATIO:
				case MULTI_DIRECT:
				case BINARY_LABEL:
				case ORIGINAL:
				case TIMEDIFF:
				case ISIN:
				case COMBINE:
				case DAYOFWEEK:
				case HOUROFDAY:
				case ISWEEKDAY:
				case WINDOW_SUM:
					{
					setState(69);
					feature_express();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				key();
				setState(75);
				match(T__0);
				setState(76);
				table_name();
				setState(77);
				match(T__2);
				{
				setState(78);
				variable_name();
				}
				setState(79);
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode ORIGINAL() { return getToken(FeatureParser.ORIGINAL, 0); }
		public TerminalNode BINARY_LABEL() { return getToken(FeatureParser.BINARY_LABEL, 0); }
		public TerminalNode REGRESSION_LABEL() { return getToken(FeatureParser.REGRESSION_LABEL, 0); }
		public TerminalNode SPLIT() { return getToken(FeatureParser.SPLIT, 0); }
		public TerminalNode SPLIT_KEY() { return getToken(FeatureParser.SPLIT_KEY, 0); }
		public TerminalNode WINDOW_SUM() { return getToken(FeatureParser.WINDOW_SUM, 0); }
		public TerminalNode WINDOW_MAX() { return getToken(FeatureParser.WINDOW_MAX, 0); }
		public TerminalNode WINDOW_MIN() { return getToken(FeatureParser.WINDOW_MIN, 0); }
		public TerminalNode WINDOW_AVG() { return getToken(FeatureParser.WINDOW_AVG, 0); }
		public TerminalNode WINDOW_UNIQUE_COUNT() { return getToken(FeatureParser.WINDOW_UNIQUE_COUNT, 0); }
		public TerminalNode WINDOW_COUNT() { return getToken(FeatureParser.WINDOW_COUNT, 0); }
		public TerminalNode WINDOW_TOP1_RATIO() { return getToken(FeatureParser.WINDOW_TOP1_RATIO, 0); }
		public TerminalNode MULTI_DIRECT() { return getToken(FeatureParser.MULTI_DIRECT, 0); }
		public TerminalNode ISIN() { return getToken(FeatureParser.ISIN, 0); }
		public TerminalNode COMBINE() { return getToken(FeatureParser.COMBINE, 0); }
		public TerminalNode TIMEDIFF() { return getToken(FeatureParser.TIMEDIFF, 0); }
		public TerminalNode LOG() { return getToken(FeatureParser.LOG, 0); }
		public TerminalNode DAYOFWEEK() { return getToken(FeatureParser.DAYOFWEEK, 0); }
		public TerminalNode ISWEEKDAY() { return getToken(FeatureParser.ISWEEKDAY, 0); }
		public TerminalNode HOUROFDAY() { return getToken(FeatureParser.HOUROFDAY, 0); }
		public TerminalNode ADD() { return getToken(FeatureParser.ADD, 0); }
		public TerminalNode DIVIDE() { return getToken(FeatureParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(FeatureParser.MULTIPLY, 0); }
		public TerminalNode SUBTRACT() { return getToken(FeatureParser.SUBTRACT, 0); }
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
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORIGINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(ORIGINAL);
				}
				break;
			case BINARY_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(BINARY_LABEL);
				}
				break;
			case REGRESSION_LABEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(REGRESSION_LABEL);
				}
				break;
			case SPLIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				match(SPLIT);
				}
				break;
			case SPLIT_KEY:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(SPLIT_KEY);
				}
				break;
			case WINDOW_SUM:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(WINDOW_SUM);
				}
				break;
			case WINDOW_MAX:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				match(WINDOW_MAX);
				}
				break;
			case WINDOW_MIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				match(WINDOW_MIN);
				}
				break;
			case WINDOW_AVG:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				match(WINDOW_AVG);
				}
				break;
			case WINDOW_UNIQUE_COUNT:
				enterOuterAlt(_localctx, 10);
				{
				setState(92);
				match(WINDOW_UNIQUE_COUNT);
				}
				break;
			case WINDOW_COUNT:
				enterOuterAlt(_localctx, 11);
				{
				setState(93);
				match(WINDOW_COUNT);
				}
				break;
			case WINDOW_TOP1_RATIO:
				enterOuterAlt(_localctx, 12);
				{
				setState(94);
				match(WINDOW_TOP1_RATIO);
				}
				break;
			case MULTI_DIRECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(95);
				match(MULTI_DIRECT);
				}
				break;
			case ISIN:
				enterOuterAlt(_localctx, 14);
				{
				setState(96);
				match(ISIN);
				}
				break;
			case COMBINE:
				enterOuterAlt(_localctx, 15);
				{
				setState(97);
				match(COMBINE);
				}
				break;
			case TIMEDIFF:
				enterOuterAlt(_localctx, 16);
				{
				setState(98);
				match(TIMEDIFF);
				setState(99);
				match(LOG);
				}
				break;
			case DAYOFWEEK:
				enterOuterAlt(_localctx, 17);
				{
				setState(100);
				match(DAYOFWEEK);
				}
				break;
			case ISWEEKDAY:
				enterOuterAlt(_localctx, 18);
				{
				setState(101);
				match(ISWEEKDAY);
				}
				break;
			case HOUROFDAY:
				enterOuterAlt(_localctx, 19);
				{
				setState(102);
				match(HOUROFDAY);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 20);
				{
				setState(103);
				match(ADD);
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 21);
				{
				setState(104);
				match(DIVIDE);
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 22);
				{
				setState(105);
				match(MULTIPLY);
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 23);
				{
				setState(106);
				match(SUBTRACT);
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

	public static class Single_window_expressContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
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
		enterRule(_localctx, 6, RULE_single_window_express);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			key();
			setState(110);
			match(T__0);
			setState(111);
			variable_name();
			setState(112);
			match(T__2);
			setState(113);
			variable_name();
			setState(114);
			match(T__2);
			setState(115);
			time_express();
			setState(116);
			match(T__2);
			setState(117);
			variable_name();
			setState(118);
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
		enterRule(_localctx, 8, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			table_name();
			setState(121);
			match(T__3);
			setState(122);
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
		enterRule(_localctx, 10, RULE_time_express);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(DAY);
			setState(125);
			match(T__4);
			setState(126);
			match(LIMIT);
			setState(127);
			match(T__5);
			setState(128);
			match(SECOND);
			setState(129);
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
		enterRule(_localctx, 12, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		enterRule(_localctx, 14, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u008a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\5\3\32\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\3\3"+
		"\5\3\'\n\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\3\3\3\5\3\65\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\3\3\5\3B\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3I\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3T\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2"+
		"\4\6\b\n\f\16\20\2\2\2\u00a3\2\22\3\2\2\2\4S\3\2\2\2\6m\3\2\2\2\bo\3\2"+
		"\2\2\nz\3\2\2\2\f~\3\2\2\2\16\u0085\3\2\2\2\20\u0087\3\2\2\2\22\23\5\4"+
		"\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\26\5\6\4\2\26\31\7\3\2\2\27\32\5\n"+
		"\6\2\30\32\5\4\3\2\31\27\3\2\2\2\31\30\3\2\2\2\32\33\3\2\2\2\33\34\7\4"+
		"\2\2\34T\3\2\2\2\35\36\5\6\4\2\36!\7\3\2\2\37\"\5\n\6\2 \"\5\4\3\2!\37"+
		"\3\2\2\2! \3\2\2\2\"#\3\2\2\2#&\7\5\2\2$\'\5\n\6\2%\'\5\4\3\2&$\3\2\2"+
		"\2&%\3\2\2\2\'(\3\2\2\2()\7\4\2\2)T\3\2\2\2*-\7\3\2\2+.\5\n\6\2,.\5\4"+
		"\3\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/\60\7\4\2\2\60\61\5\6\4\2\61\64\7\3"+
		"\2\2\62\65\5\n\6\2\63\65\5\4\3\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2"+
		"\2\2\66\67\7\4\2\2\67T\3\2\2\289\5\6\4\29<\7\3\2\2:=\5\n\6\2;=\5\4\3\2"+
		"<:\3\2\2\2<;\3\2\2\2=>\3\2\2\2>A\7\5\2\2?B\5\n\6\2@B\5\4\3\2A?\3\2\2\2"+
		"A@\3\2\2\2BC\3\2\2\2CD\7\5\2\2DE\5\f\7\2EH\7\5\2\2FI\5\n\6\2GI\5\4\3\2"+
		"HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\7\4\2\2KT\3\2\2\2LM\5\6\4\2MN\7\3\2\2"+
		"NO\5\16\b\2OP\7\5\2\2PQ\5\n\6\2QR\7\4\2\2RT\3\2\2\2S\25\3\2\2\2S\35\3"+
		"\2\2\2S*\3\2\2\2S8\3\2\2\2SL\3\2\2\2T\5\3\2\2\2Un\7\35\2\2Vn\7\34\2\2"+
		"Wn\7\17\2\2Xn\7\20\2\2Yn\7\21\2\2Zn\7$\2\2[n\7\22\2\2\\n\7\23\2\2]n\7"+
		"\24\2\2^n\7\25\2\2_n\7\26\2\2`n\7\27\2\2an\7\33\2\2bn\7\37\2\2cn\7 \2"+
		"\2de\7\36\2\2en\7\16\2\2fn\7!\2\2gn\7#\2\2hn\7\"\2\2in\7\r\2\2jn\7\f\2"+
		"\2kn\7\13\2\2ln\7\n\2\2mU\3\2\2\2mV\3\2\2\2mW\3\2\2\2mX\3\2\2\2mY\3\2"+
		"\2\2mZ\3\2\2\2m[\3\2\2\2m\\\3\2\2\2m]\3\2\2\2m^\3\2\2\2m_\3\2\2\2m`\3"+
		"\2\2\2ma\3\2\2\2mb\3\2\2\2mc\3\2\2\2md\3\2\2\2mf\3\2\2\2mg\3\2\2\2mh\3"+
		"\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\7\3\2\2\2op\5\6\4\2pq"+
		"\7\3\2\2qr\5\n\6\2rs\7\5\2\2st\5\n\6\2tu\7\5\2\2uv\5\f\7\2vw\7\5\2\2w"+
		"x\5\n\6\2xy\7\4\2\2y\t\3\2\2\2z{\5\16\b\2{|\7\6\2\2|}\5\20\t\2}\13\3\2"+
		"\2\2~\177\7\30\2\2\177\u0080\7\7\2\2\u0080\u0081\7\31\2\2\u0081\u0082"+
		"\7\b\2\2\u0082\u0083\7\32\2\2\u0083\u0084\7\t\2\2\u0084\r\3\2\2\2\u0085"+
		"\u0086\7%\2\2\u0086\17\3\2\2\2\u0087\u0088\7%\2\2\u0088\21\3\2\2\2\f\31"+
		"!&-\64<AHSm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}