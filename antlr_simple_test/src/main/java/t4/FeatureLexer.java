// Generated from t4/Feature.g4 by ANTLR 4.9.2
package t4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FeatureLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "MULTI_SUM", 
			"MULTI_MAX", "MULTI_MIN", "MULTI_AVG", "MULTI_UNIQUE_COUNT", "MULTI_COUNT", 
			"MULTI_TOP3FREQUENCY", "MULTI_LAST_VALUE", "SUBTRACT", "MULTIPLY", "DIVIDE", 
			"ADD", "LOG", "REGRESSION_LABEL", "SPLIT", "SPLIT_KEY", "WINDOW_MAX", 
			"WINDOW_MIN", "WINDOW_AVG", "WINDOW_UNIQUE_COUNT", "WINDOW_COUNT", "WINDOW_TOP1_RATIO", 
			"DAY", "LIMIT", "SECOND", "MULTI_DIRECT", "BINARY_LABEL", "ORIGINAL", 
			"TIMEDIFF", "ISIN", "COMBINE", "DAYOFWEEK", "HOUROFDAY", "ISWEEKDAY", 
			"WINDOW_SUM", "STRING"
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


	public FeatureLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Feature.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u01eb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u016d\n\37"+
		"\f\37\16\37\u0170\13\37\3 \3 \7 \u0174\n \f \16 \u0177\13 \3!\3!\3!\7"+
		"!\u017c\n!\f!\16!\u017f\13!\5!\u0181\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3,\3,\7,\u01e7\n,\f,\16,\u01ea\13,\2\2-\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-\3\2\6\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\2\u01ef\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\3Y\3\2\2\2\5\\\3\2\2\2\7^\3\2\2\2\t`\3\2\2\2\13b\3\2\2"+
		"\2\rd\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23r\3\2\2\2\25|\3\2\2\2\27\u0086"+
		"\3\2\2\2\31\u0090\3\2\2\2\33\u00a3\3\2\2\2\35\u00af\3\2\2\2\37\u00c3\3"+
		"\2\2\2!\u00d4\3\2\2\2#\u00dd\3\2\2\2%\u00e6\3\2\2\2\'\u00ed\3\2\2\2)\u00f1"+
		"\3\2\2\2+\u00f5\3\2\2\2-\u0106\3\2\2\2/\u010c\3\2\2\2\61\u0116\3\2\2\2"+
		"\63\u0121\3\2\2\2\65\u012c\3\2\2\2\67\u0137\3\2\2\29\u014b\3\2\2\2;\u0158"+
		"\3\2\2\2=\u016a\3\2\2\2?\u0171\3\2\2\2A\u0180\3\2\2\2C\u0182\3\2\2\2E"+
		"\u018f\3\2\2\2G\u019c\3\2\2\2I\u01a5\3\2\2\2K\u01ae\3\2\2\2M\u01b3\3\2"+
		"\2\2O\u01bb\3\2\2\2Q\u01c5\3\2\2\2S\u01cf\3\2\2\2U\u01d9\3\2\2\2W\u01e4"+
		"\3\2\2\2YZ\7f\2\2Z[\7<\2\2[\4\3\2\2\2\\]\7<\2\2]\6\3\2\2\2^_\7u\2\2_\b"+
		"\3\2\2\2`a\7\60\2\2a\n\3\2\2\2bc\7*\2\2c\f\3\2\2\2de\7+\2\2e\16\3\2\2"+
		"\2fg\7.\2\2g\20\3\2\2\2hi\7o\2\2ij\7w\2\2jk\7n\2\2kl\7v\2\2lm\7k\2\2m"+
		"n\7a\2\2no\7u\2\2op\7w\2\2pq\7o\2\2q\22\3\2\2\2rs\7o\2\2st\7w\2\2tu\7"+
		"n\2\2uv\7v\2\2vw\7k\2\2wx\7a\2\2xy\7o\2\2yz\7c\2\2z{\7z\2\2{\24\3\2\2"+
		"\2|}\7o\2\2}~\7w\2\2~\177\7n\2\2\177\u0080\7v\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7a\2\2\u0082\u0083\7o\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2"+
		"\u0085\26\3\2\2\2\u0086\u0087\7o\2\2\u0087\u0088\7w\2\2\u0088\u0089\7"+
		"n\2\2\u0089\u008a\7v\2\2\u008a\u008b\7k\2\2\u008b\u008c\7a\2\2\u008c\u008d"+
		"\7c\2\2\u008d\u008e\7x\2\2\u008e\u008f\7i\2\2\u008f\30\3\2\2\2\u0090\u0091"+
		"\7o\2\2\u0091\u0092\7w\2\2\u0092\u0093\7n\2\2\u0093\u0094\7v\2\2\u0094"+
		"\u0095\7k\2\2\u0095\u0096\7a\2\2\u0096\u0097\7w\2\2\u0097\u0098\7p\2\2"+
		"\u0098\u0099\7k\2\2\u0099\u009a\7s\2\2\u009a\u009b\7w\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7a\2\2\u009d\u009e\7e\2\2\u009e\u009f\7q\2\2\u009f"+
		"\u00a0\7w\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\32\3\2\2\2\u00a3"+
		"\u00a4\7o\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7v\2\2"+
		"\u00a7\u00a8\7k\2\2\u00a8\u00a9\7a\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae"+
		"\34\3\2\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7v\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7a\2\2\u00b5\u00b6\7v\2\2"+
		"\u00b6\u00b7\7q\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7\65\2\2\u00b9\u00ba"+
		"\7h\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7s\2\2\u00bd"+
		"\u00be\7w\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7e\2\2"+
		"\u00c1\u00c2\7{\2\2\u00c2\36\3\2\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7"+
		"w\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9"+
		"\7a\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7u\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd\u00ce\7a\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7c\2\2"+
		"\u00d0\u00d1\7n\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7g\2\2\u00d3 \3\2\2"+
		"\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8"+
		"\7v\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7e\2\2\u00db"+
		"\u00dc\7v\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7o\2\2\u00de\u00df\7w\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7r\2\2"+
		"\u00e3\u00e4\7n\2\2\u00e4\u00e5\7{\2\2\u00e5$\3\2\2\2\u00e6\u00e7\7f\2"+
		"\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7x\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb"+
		"\7f\2\2\u00eb\u00ec\7g\2\2\u00ec&\3\2\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef"+
		"\7f\2\2\u00ef\u00f0\7f\2\2\u00f0(\3\2\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3"+
		"\7q\2\2\u00f3\u00f4\7i\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7"+
		"\7g\2\2\u00f7\u00f8\7i\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7g\2\2\u00fa"+
		"\u00fb\7u\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7q\2\2"+
		"\u00fe\u00ff\7p\2\2\u00ff\u0100\7a\2\2\u0100\u0101\7n\2\2\u0101\u0102"+
		"\7c\2\2\u0102\u0103\7d\2\2\u0103\u0104\7g\2\2\u0104\u0105\7n\2\2\u0105"+
		",\3\2\2\2\u0106\u0107\7u\2\2\u0107\u0108\7r\2\2\u0108\u0109\7n\2\2\u0109"+
		"\u010a\7k\2\2\u010a\u010b\7v\2\2\u010b.\3\2\2\2\u010c\u010d\7u\2\2\u010d"+
		"\u010e\7r\2\2\u010e\u010f\7n\2\2\u010f\u0110\7k\2\2\u0110\u0111\7v\2\2"+
		"\u0111\u0112\7a\2\2\u0112\u0113\7m\2\2\u0113\u0114\7g\2\2\u0114\u0115"+
		"\7{\2\2\u0115\60\3\2\2\2\u0116\u0117\7y\2\2\u0117\u0118\7k\2\2\u0118\u0119"+
		"\7p\2\2\u0119\u011a\7f\2\2\u011a\u011b\7q\2\2\u011b\u011c\7y\2\2\u011c"+
		"\u011d\7a\2\2\u011d\u011e\7o\2\2\u011e\u011f\7c\2\2\u011f\u0120\7z\2\2"+
		"\u0120\62\3\2\2\2\u0121\u0122\7y\2\2\u0122\u0123\7k\2\2\u0123\u0124\7"+
		"p\2\2\u0124\u0125\7f\2\2\u0125\u0126\7q\2\2\u0126\u0127\7y\2\2\u0127\u0128"+
		"\7a\2\2\u0128\u0129\7o\2\2\u0129\u012a\7k\2\2\u012a\u012b\7p\2\2\u012b"+
		"\64\3\2\2\2\u012c\u012d\7y\2\2\u012d\u012e\7k\2\2\u012e\u012f\7p\2\2\u012f"+
		"\u0130\7f\2\2\u0130\u0131\7q\2\2\u0131\u0132\7y\2\2\u0132\u0133\7a\2\2"+
		"\u0133\u0134\7c\2\2\u0134\u0135\7x\2\2\u0135\u0136\7i\2\2\u0136\66\3\2"+
		"\2\2\u0137\u0138\7y\2\2\u0138\u0139\7k\2\2\u0139\u013a\7p\2\2\u013a\u013b"+
		"\7f\2\2\u013b\u013c\7q\2\2\u013c\u013d\7y\2\2\u013d\u013e\7a\2\2\u013e"+
		"\u013f\7w\2\2\u013f\u0140\7p\2\2\u0140\u0141\7k\2\2\u0141\u0142\7s\2\2"+
		"\u0142\u0143\7w\2\2\u0143\u0144\7g\2\2\u0144\u0145\7a\2\2\u0145\u0146"+
		"\7e\2\2\u0146\u0147\7q\2\2\u0147\u0148\7w\2\2\u0148\u0149\7p\2\2\u0149"+
		"\u014a\7v\2\2\u014a8\3\2\2\2\u014b\u014c\7y\2\2\u014c\u014d\7k\2\2\u014d"+
		"\u014e\7p\2\2\u014e\u014f\7f\2\2\u014f\u0150\7q\2\2\u0150\u0151\7y\2\2"+
		"\u0151\u0152\7a\2\2\u0152\u0153\7e\2\2\u0153\u0154\7q\2\2\u0154\u0155"+
		"\7w\2\2\u0155\u0156\7p\2\2\u0156\u0157\7v\2\2\u0157:\3\2\2\2\u0158\u0159"+
		"\7y\2\2\u0159\u015a\7k\2\2\u015a\u015b\7p\2\2\u015b\u015c\7f\2\2\u015c"+
		"\u015d\7q\2\2\u015d\u015e\7y\2\2\u015e\u015f\7a\2\2\u015f\u0160\7v\2\2"+
		"\u0160\u0161\7q\2\2\u0161\u0162\7r\2\2\u0162\u0163\7\63\2\2\u0163\u0164"+
		"\7a\2\2\u0164\u0165\7t\2\2\u0165\u0166\7c\2\2\u0166\u0167\7v\2\2\u0167"+
		"\u0168\7k\2\2\u0168\u0169\7q\2\2\u0169<\3\2\2\2\u016a\u016e\t\2\2\2\u016b"+
		"\u016d\t\3\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f>\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0175"+
		"\t\2\2\2\u0172\u0174\t\3\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176@\3\2\2\2\u0177\u0175\3\2\2\2"+
		"\u0178\u0181\t\3\2\2\u0179\u017d\t\2\2\2\u017a\u017c\t\3\2\2\u017b\u017a"+
		"\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0178\3\2\2\2\u0180\u0179\3\2"+
		"\2\2\u0181B\3\2\2\2\u0182\u0183\7o\2\2\u0183\u0184\7w\2\2\u0184\u0185"+
		"\7n\2\2\u0185\u0186\7v\2\2\u0186\u0187\7k\2\2\u0187\u0188\7a\2\2\u0188"+
		"\u0189\7f\2\2\u0189\u018a\7k\2\2\u018a\u018b\7t\2\2\u018b\u018c\7g\2\2"+
		"\u018c\u018d\7e\2\2\u018d\u018e\7v\2\2\u018eD\3\2\2\2\u018f\u0190\7d\2"+
		"\2\u0190\u0191\7k\2\2\u0191\u0192\7p\2\2\u0192\u0193\7c\2\2\u0193\u0194"+
		"\7t\2\2\u0194\u0195\7{\2\2\u0195\u0196\7a\2\2\u0196\u0197\7n\2\2\u0197"+
		"\u0198\7c\2\2\u0198\u0199\7d\2\2\u0199\u019a\7g\2\2\u019a\u019b\7n\2\2"+
		"\u019bF\3\2\2\2\u019c\u019d\7q\2\2\u019d\u019e\7t\2\2\u019e\u019f\7k\2"+
		"\2\u019f\u01a0\7i\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a3"+
		"\7c\2\2\u01a3\u01a4\7n\2\2\u01a4H\3\2\2\2\u01a5\u01a6\7v\2\2\u01a6\u01a7"+
		"\7k\2\2\u01a7\u01a8\7o\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7f\2\2\u01aa"+
		"\u01ab\7k\2\2\u01ab\u01ac\7h\2\2\u01ac\u01ad\7h\2\2\u01adJ\3\2\2\2\u01ae"+
		"\u01af\7k\2\2\u01af\u01b0\7u\2\2\u01b0\u01b1\7k\2\2\u01b1\u01b2\7p\2\2"+
		"\u01b2L\3\2\2\2\u01b3\u01b4\7e\2\2\u01b4\u01b5\7q\2\2\u01b5\u01b6\7o\2"+
		"\2\u01b6\u01b7\7d\2\2\u01b7\u01b8\7k\2\2\u01b8\u01b9\7p\2\2\u01b9\u01ba"+
		"\7g\2\2\u01baN\3\2\2\2\u01bb\u01bc\7f\2\2\u01bc\u01bd\7c\2\2\u01bd\u01be"+
		"\7{\2\2\u01be\u01bf\7q\2\2\u01bf\u01c0\7h\2\2\u01c0\u01c1\7y\2\2\u01c1"+
		"\u01c2\7g\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7m\2\2\u01c4P\3\2\2\2\u01c5"+
		"\u01c6\7j\2\2\u01c6\u01c7\7q\2\2\u01c7\u01c8\7w\2\2\u01c8\u01c9\7t\2\2"+
		"\u01c9\u01ca\7q\2\2\u01ca\u01cb\7h\2\2\u01cb\u01cc\7f\2\2\u01cc\u01cd"+
		"\7c\2\2\u01cd\u01ce\7{\2\2\u01ceR\3\2\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1"+
		"\7u\2\2\u01d1\u01d2\7y\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4\7g\2\2\u01d4"+
		"\u01d5\7m\2\2\u01d5\u01d6\7f\2\2\u01d6\u01d7\7c\2\2\u01d7\u01d8\7{\2\2"+
		"\u01d8T\3\2\2\2\u01d9\u01da\7y\2\2\u01da\u01db\7k\2\2\u01db\u01dc\7p\2"+
		"\2\u01dc\u01dd\7f\2\2\u01dd\u01de\7q\2\2\u01de\u01df\7y\2\2\u01df\u01e0"+
		"\7a\2\2\u01e0\u01e1\7u\2\2\u01e1\u01e2\7w\2\2\u01e2\u01e3\7o\2\2\u01e3"+
		"V\3\2\2\2\u01e4\u01e8\t\4\2\2\u01e5\u01e7\t\5\2\2\u01e6\u01e5\3\2\2\2"+
		"\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9X\3"+
		"\2\2\2\u01ea\u01e8\3\2\2\2\b\2\u016e\u0175\u017d\u0180\u01e8\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}