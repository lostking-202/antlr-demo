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
		T__0=1, T__1=2, T__2=3, DOT=4, LR_BRACKET=5, RR_BRACKET=6, COMMA=7, MULTI_SUM=8, 
		MULTI_MAX=9, MULTI_MIN=10, MULTI_AVG=11, MULTI_UNIQUE_COUNT=12, MULTI_COUNT=13, 
		MULTI_TOP3FREQUENCY=14, MULTI_LAST_VALUE=15, SUBTRACT=16, MULTIPLY=17, 
		DIVIDE=18, ADD=19, LOG=20, REGRESSION_LABEL=21, SPLIT=22, SPLIT_KEY=23, 
		WINDOW_MAX=24, WINDOW_MIN=25, WINDOW_AVG=26, WINDOW_UNIQUE_COUNT=27, WINDOW_COUNT=28, 
		WINDOW_TOP1_RATIO=29, DAY=30, LIMIT=31, SECOND=32, MULTI_DIRECT=33, BINARY_LABEL=34, 
		ORIGINAL=35, TIMEDIFF=36, ISIN=37, COMBINE=38, DAYOFWEEK=39, HOUROFDAY=40, 
		ISWEEKDAY=41, WINDOW_SUM=42, STRING=43;
	public static final int
		RULE_parse = 0, RULE_feature_express = 1, RULE_key = 2, RULE_variable_name = 3, 
		RULE_time_express = 4, RULE_day = 5, RULE_limit = 6, RULE_second = 7, 
		RULE_table_name = 8, RULE_field_name = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "feature_express", "key", "variable_name", "time_express", "day", 
			"limit", "second", "table_name", "field_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'d:'", "':'", "'s'", "'.'", "'('", "')'", "','", "'multi_sum'", 
			"'multi_max'", "'multi_min'", "'multi_avg'", "'multi_unique_count'", 
			"'multi_count'", "'multi_top3frequency'", "'multi_last_value'", "'subtract'", 
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
			null, null, null, null, "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "MULTI_SUM", 
			"MULTI_MAX", "MULTI_MIN", "MULTI_AVG", "MULTI_UNIQUE_COUNT", "MULTI_COUNT", 
			"MULTI_TOP3FREQUENCY", "MULTI_LAST_VALUE", "SUBTRACT", "MULTIPLY", "DIVIDE", 
			"ADD", "LOG", "REGRESSION_LABEL", "SPLIT", "SPLIT_KEY", "WINDOW_MAX", 
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
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			feature_express();
			setState(21);
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
		public List<TerminalNode> LR_BRACKET() { return getTokens(FeatureParser.LR_BRACKET); }
		public TerminalNode LR_BRACKET(int i) {
			return getToken(FeatureParser.LR_BRACKET, i);
		}
		public List<TerminalNode> RR_BRACKET() { return getTokens(FeatureParser.RR_BRACKET); }
		public TerminalNode RR_BRACKET(int i) {
			return getToken(FeatureParser.RR_BRACKET, i);
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
		public List<TerminalNode> COMMA() { return getTokens(FeatureParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FeatureParser.COMMA, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
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
	}

	public final Feature_expressContext feature_express() throws RecognitionException {
		Feature_expressContext _localctx = new Feature_expressContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_feature_express);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				key();
				setState(24);
				match(LR_BRACKET);
				setState(27);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(25);
					variable_name();
					}
					break;
				case LR_BRACKET:
				case MULTI_SUM:
				case MULTI_MAX:
				case MULTI_MIN:
				case MULTI_AVG:
				case MULTI_UNIQUE_COUNT:
				case MULTI_COUNT:
				case MULTI_TOP3FREQUENCY:
				case MULTI_LAST_VALUE:
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
					setState(26);
					feature_express();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(29);
					match(COMMA);
					setState(32);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(30);
						variable_name();
						}
						break;
					case LR_BRACKET:
					case MULTI_SUM:
					case MULTI_MAX:
					case MULTI_MIN:
					case MULTI_AVG:
					case MULTI_UNIQUE_COUNT:
					case MULTI_COUNT:
					case MULTI_TOP3FREQUENCY:
					case MULTI_LAST_VALUE:
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
						setState(31);
						feature_express();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(39);
				match(RR_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(LR_BRACKET);
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(42);
					variable_name();
					}
					break;
				case LR_BRACKET:
				case MULTI_SUM:
				case MULTI_MAX:
				case MULTI_MIN:
				case MULTI_AVG:
				case MULTI_UNIQUE_COUNT:
				case MULTI_COUNT:
				case MULTI_TOP3FREQUENCY:
				case MULTI_LAST_VALUE:
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
					setState(43);
					feature_express();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(46);
				match(RR_BRACKET);
				setState(47);
				key();
				setState(48);
				match(LR_BRACKET);
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(49);
					variable_name();
					}
					break;
				case LR_BRACKET:
				case MULTI_SUM:
				case MULTI_MAX:
				case MULTI_MIN:
				case MULTI_AVG:
				case MULTI_UNIQUE_COUNT:
				case MULTI_COUNT:
				case MULTI_TOP3FREQUENCY:
				case MULTI_LAST_VALUE:
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
					setState(50);
					feature_express();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53);
				match(RR_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				key();
				setState(56);
				match(LR_BRACKET);
				setState(57);
				table_name();
				setState(58);
				match(COMMA);
				setState(59);
				variable_name();
				setState(60);
				match(RR_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				key();
				setState(63);
				match(LR_BRACKET);
				{
				setState(64);
				variable_name();
				}
				setState(65);
				match(COMMA);
				{
				setState(66);
				variable_name();
				}
				setState(67);
				match(COMMA);
				setState(68);
				time_express();
				setState(69);
				match(COMMA);
				{
				setState(70);
				variable_name();
				}
				setState(71);
				match(RR_BRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				key();
				setState(74);
				match(LR_BRACKET);
				setState(75);
				table_name();
				setState(76);
				match(COMMA);
				setState(77);
				variable_name();
				setState(78);
				match(COMMA);
				setState(79);
				time_express();
				setState(80);
				match(RR_BRACKET);
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
		public TerminalNode MULTI_SUM() { return getToken(FeatureParser.MULTI_SUM, 0); }
		public TerminalNode MULTI_MAX() { return getToken(FeatureParser.MULTI_MAX, 0); }
		public TerminalNode MULTI_MIN() { return getToken(FeatureParser.MULTI_MIN, 0); }
		public TerminalNode MULTI_AVG() { return getToken(FeatureParser.MULTI_AVG, 0); }
		public TerminalNode MULTI_UNIQUE_COUNT() { return getToken(FeatureParser.MULTI_UNIQUE_COUNT, 0); }
		public TerminalNode MULTI_COUNT() { return getToken(FeatureParser.MULTI_COUNT, 0); }
		public TerminalNode MULTI_TOP3FREQUENCY() { return getToken(FeatureParser.MULTI_TOP3FREQUENCY, 0); }
		public TerminalNode MULTI_LAST_VALUE() { return getToken(FeatureParser.MULTI_LAST_VALUE, 0); }
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
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_key);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORIGINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(ORIGINAL);
				}
				break;
			case BINARY_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(BINARY_LABEL);
				}
				break;
			case REGRESSION_LABEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(REGRESSION_LABEL);
				}
				break;
			case SPLIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(SPLIT);
				}
				break;
			case SPLIT_KEY:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				match(SPLIT_KEY);
				}
				break;
			case WINDOW_SUM:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				match(WINDOW_SUM);
				}
				break;
			case WINDOW_MAX:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				match(WINDOW_MAX);
				}
				break;
			case WINDOW_MIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				match(WINDOW_MIN);
				}
				break;
			case WINDOW_AVG:
				enterOuterAlt(_localctx, 9);
				{
				setState(92);
				match(WINDOW_AVG);
				}
				break;
			case WINDOW_UNIQUE_COUNT:
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				match(WINDOW_UNIQUE_COUNT);
				}
				break;
			case WINDOW_COUNT:
				enterOuterAlt(_localctx, 11);
				{
				setState(94);
				match(WINDOW_COUNT);
				}
				break;
			case WINDOW_TOP1_RATIO:
				enterOuterAlt(_localctx, 12);
				{
				setState(95);
				match(WINDOW_TOP1_RATIO);
				}
				break;
			case MULTI_DIRECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(96);
				match(MULTI_DIRECT);
				}
				break;
			case ISIN:
				enterOuterAlt(_localctx, 14);
				{
				setState(97);
				match(ISIN);
				}
				break;
			case COMBINE:
				enterOuterAlt(_localctx, 15);
				{
				setState(98);
				match(COMBINE);
				}
				break;
			case TIMEDIFF:
				enterOuterAlt(_localctx, 16);
				{
				setState(99);
				match(TIMEDIFF);
				setState(100);
				match(LOG);
				}
				break;
			case DAYOFWEEK:
				enterOuterAlt(_localctx, 17);
				{
				setState(101);
				match(DAYOFWEEK);
				}
				break;
			case ISWEEKDAY:
				enterOuterAlt(_localctx, 18);
				{
				setState(102);
				match(ISWEEKDAY);
				}
				break;
			case HOUROFDAY:
				enterOuterAlt(_localctx, 19);
				{
				setState(103);
				match(HOUROFDAY);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 20);
				{
				setState(104);
				match(ADD);
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 21);
				{
				setState(105);
				match(DIVIDE);
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 22);
				{
				setState(106);
				match(MULTIPLY);
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 23);
				{
				setState(107);
				match(SUBTRACT);
				}
				break;
			case MULTI_SUM:
				enterOuterAlt(_localctx, 24);
				{
				setState(108);
				match(MULTI_SUM);
				}
				break;
			case MULTI_MAX:
				enterOuterAlt(_localctx, 25);
				{
				setState(109);
				match(MULTI_MAX);
				}
				break;
			case MULTI_MIN:
				enterOuterAlt(_localctx, 26);
				{
				setState(110);
				match(MULTI_MIN);
				}
				break;
			case MULTI_AVG:
				enterOuterAlt(_localctx, 27);
				{
				setState(111);
				match(MULTI_AVG);
				}
				break;
			case MULTI_UNIQUE_COUNT:
				enterOuterAlt(_localctx, 28);
				{
				setState(112);
				match(MULTI_UNIQUE_COUNT);
				}
				break;
			case MULTI_COUNT:
				enterOuterAlt(_localctx, 29);
				{
				setState(113);
				match(MULTI_COUNT);
				}
				break;
			case MULTI_TOP3FREQUENCY:
				enterOuterAlt(_localctx, 30);
				{
				setState(114);
				match(MULTI_TOP3FREQUENCY);
				}
				break;
			case MULTI_LAST_VALUE:
				enterOuterAlt(_localctx, 31);
				{
				setState(115);
				match(MULTI_LAST_VALUE);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FeatureParser.DOT, 0); }
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
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			table_name();
			setState(119);
			match(DOT);
			setState(120);
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
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public SecondContext second() {
			return getRuleContext(SecondContext.class,0);
		}
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
	}

	public final Time_expressContext time_express() throws RecognitionException {
		Time_expressContext _localctx = new Time_expressContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_time_express);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			day();
			setState(123);
			match(T__0);
			setState(124);
			limit();
			setState(125);
			match(T__1);
			setState(126);
			second();
			setState(127);
			match(T__2);
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

	public static class DayContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(FeatureParser.DAY, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitDay(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(DAY);
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

	public static class LimitContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(FeatureParser.LIMIT, 0); }
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitLimit(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(LIMIT);
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

	public static class SecondContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(FeatureParser.SECOND, 0); }
		public SecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).enterSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatureListener ) ((FeatureListener)listener).exitSecond(this);
		}
	}

	public final SecondContext second() throws RecognitionException {
		SecondContext _localctx = new SecondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_second);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SECOND);
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
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
	}

	public final Field_nameContext field_name() throws RecognitionException {
		Field_nameContext _localctx = new Field_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u008e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\3\5\3#\n\3\7\3%\n"+
		"\3\f\3\16\3(\13\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\66\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3U\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4w\n\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u00aa\2\26\3\2\2\2\4"+
		"T\3\2\2\2\6v\3\2\2\2\bx\3\2\2\2\n|\3\2\2\2\f\u0083\3\2\2\2\16\u0085\3"+
		"\2\2\2\20\u0087\3\2\2\2\22\u0089\3\2\2\2\24\u008b\3\2\2\2\26\27\5\4\3"+
		"\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32\5\6\4\2\32\35\7\7\2\2\33\36\5\b\5"+
		"\2\34\36\5\4\3\2\35\33\3\2\2\2\35\34\3\2\2\2\36&\3\2\2\2\37\"\7\t\2\2"+
		" #\5\b\5\2!#\5\4\3\2\" \3\2\2\2\"!\3\2\2\2#%\3\2\2\2$\37\3\2\2\2%(\3\2"+
		"\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\b\2\2*U\3\2\2\2+.\7"+
		"\7\2\2,/\5\b\5\2-/\5\4\3\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60\61\7\b\2"+
		"\2\61\62\5\6\4\2\62\65\7\7\2\2\63\66\5\b\5\2\64\66\5\4\3\2\65\63\3\2\2"+
		"\2\65\64\3\2\2\2\66\67\3\2\2\2\678\7\b\2\28U\3\2\2\29:\5\6\4\2:;\7\7\2"+
		"\2;<\5\22\n\2<=\7\t\2\2=>\5\b\5\2>?\7\b\2\2?U\3\2\2\2@A\5\6\4\2AB\7\7"+
		"\2\2BC\5\b\5\2CD\7\t\2\2DE\5\b\5\2EF\7\t\2\2FG\5\n\6\2GH\7\t\2\2HI\5\b"+
		"\5\2IJ\7\b\2\2JU\3\2\2\2KL\5\6\4\2LM\7\7\2\2MN\5\22\n\2NO\7\t\2\2OP\5"+
		"\b\5\2PQ\7\t\2\2QR\5\n\6\2RS\7\b\2\2SU\3\2\2\2T\31\3\2\2\2T+\3\2\2\2T"+
		"9\3\2\2\2T@\3\2\2\2TK\3\2\2\2U\5\3\2\2\2Vw\7%\2\2Ww\7$\2\2Xw\7\27\2\2"+
		"Yw\7\30\2\2Zw\7\31\2\2[w\7,\2\2\\w\7\32\2\2]w\7\33\2\2^w\7\34\2\2_w\7"+
		"\35\2\2`w\7\36\2\2aw\7\37\2\2bw\7#\2\2cw\7\'\2\2dw\7(\2\2ef\7&\2\2fw\7"+
		"\26\2\2gw\7)\2\2hw\7+\2\2iw\7*\2\2jw\7\25\2\2kw\7\24\2\2lw\7\23\2\2mw"+
		"\7\22\2\2nw\7\n\2\2ow\7\13\2\2pw\7\f\2\2qw\7\r\2\2rw\7\16\2\2sw\7\17\2"+
		"\2tw\7\20\2\2uw\7\21\2\2vV\3\2\2\2vW\3\2\2\2vX\3\2\2\2vY\3\2\2\2vZ\3\2"+
		"\2\2v[\3\2\2\2v\\\3\2\2\2v]\3\2\2\2v^\3\2\2\2v_\3\2\2\2v`\3\2\2\2va\3"+
		"\2\2\2vb\3\2\2\2vc\3\2\2\2vd\3\2\2\2ve\3\2\2\2vg\3\2\2\2vh\3\2\2\2vi\3"+
		"\2\2\2vj\3\2\2\2vk\3\2\2\2vl\3\2\2\2vm\3\2\2\2vn\3\2\2\2vo\3\2\2\2vp\3"+
		"\2\2\2vq\3\2\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\7\3\2\2\2xy"+
		"\5\22\n\2yz\7\6\2\2z{\5\24\13\2{\t\3\2\2\2|}\5\f\7\2}~\7\3\2\2~\177\5"+
		"\16\b\2\177\u0080\7\4\2\2\u0080\u0081\5\20\t\2\u0081\u0082\7\5\2\2\u0082"+
		"\13\3\2\2\2\u0083\u0084\7 \2\2\u0084\r\3\2\2\2\u0085\u0086\7!\2\2\u0086"+
		"\17\3\2\2\2\u0087\u0088\7\"\2\2\u0088\21\3\2\2\2\u0089\u008a\7-\2\2\u008a"+
		"\23\3\2\2\2\u008b\u008c\7-\2\2\u008c\25\3\2\2\2\t\35\"&.\65Tv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}