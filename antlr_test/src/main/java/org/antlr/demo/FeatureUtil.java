package org.antlr.demo;

import com.google.common.collect.Lists;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.List;
import java.util.Properties;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class FeatureUtil {

  private static Properties OP_MAP = new Properties();

  static {
    try {
      URLConnection con = FeatureUtil.class.getClassLoader().getResource("op.properties").openConnection();
      ResourceUtils.useCachesIfNecessary(con);
      InputStream is = con.getInputStream();
      OP_MAP.load(new InputStreamReader(is,StandardCharsets.UTF_8));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private FeatureParser.ParseContext parseContext;

  public FeatureUtil(FeatureParser.ParseContext parseContext){
    this.parseContext=parseContext;
  }

  public FeatureParser.Feature_expressContext getExpress(){
    return parseContext.feature_express();
  }

  public String parseFeatureExpress(FeatureParser.Feature_expressContext context){
    List<ParseTreeGroup> children=this.parseTreeGroupByType(context);
    String[] arguments=new String[children.size()];

    int expressCount=0;

    for(int i=0;i<arguments.length;i++){
      if(children.get(i).type==Type.Express){
        arguments[i]=parseFeatureExpress(context.feature_express(expressCount));
        expressCount++;
      }else if(children.get(i).type==Type.TimeExpress){
        arguments[i]=parseTimeExpress(context.time_express());
      }else{
        if("multi_direct".equals(context.key().getText())){
          arguments=new String[2];
          arguments[0]=((FeatureParser.Variable_nameContext)(children.get(i).child)).table_name().getText();
          arguments[1]=((FeatureParser.Variable_nameContext)(children.get(i).child)).field_name().getText();
          break;
        }else{
          arguments[i]=children.get(i).child.getText();
        }
      }
    }
    return MessageFormat.format(OP_MAP.getProperty(context.key().getText()),arguments);
  }

  private String parseTimeExpress(FeatureParser.Time_expressContext time_expressContext){
    return MessageFormat.format("最近{0}天到{1}秒内最多{2}条数据",time_expressContext.day().getText(),time_expressContext.second().getText(),time_expressContext.limit().getText());
  }

  private List<ParseTreeGroup> parseTreeGroupByType(FeatureParser.Feature_expressContext feature_expressContext){
    List<ParseTreeGroup> children= Lists.newArrayListWithCapacity(feature_expressContext.children.size());
    for(ParseTree child:feature_expressContext.children){
      if(child instanceof FeatureParser.Variable_nameContext){
        children.add(new ParseTreeGroup(Type.Other,child));
      }else if(child instanceof FeatureParser.Feature_expressContext){
        children.add(new ParseTreeGroup(Type.Express,child));
      }else if(child instanceof FeatureParser.Time_expressContext){
        children.add(new ParseTreeGroup(Type.TimeExpress,child));
      }
    }
    return children;
  }

  class ParseTreeGroup{
    Type type;
    ParseTree child;
    private ParseTreeGroup(Type type,ParseTree child){
      this.type=type;
      this.child=child;
    }
  }

  enum Type{
    TimeExpress,
    Express,
    Other
  }
}

class FeatureParser extends Parser {
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
          RULE_variable_name = 4, RULE_time_express = 5, RULE_day = 6, RULE_limit = 7,
          RULE_second = 8, RULE_table_name = 9, RULE_field_name = 10;
  private static String[] makeRuleNames() {
    return new String[] {
            "parse", "feature_express", "key", "single_window_express", "variable_name",
            "time_express", "day", "limit", "second", "table_name", "field_name"
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
        setState(22);
        feature_express();
        setState(23);
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
      setState(87);
      _errHandler.sync(this);
      switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(25);
          key();
          setState(26);
          match(T__0);
          setState(29);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case STRING:
            {
              setState(27);
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
              setState(28);
              feature_express();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(31);
          match(T__1);
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(33);
          key();
          setState(34);
          match(T__0);
          setState(37);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case STRING:
            {
              setState(35);
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
              setState(36);
              feature_express();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(39);
          match(T__2);
          setState(42);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case STRING:
            {
              setState(40);
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
              setState(41);
              feature_express();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(44);
          match(T__1);
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(46);
          match(T__0);
          setState(49);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case STRING:
            {
              setState(47);
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
              setState(48);
              feature_express();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(51);
          match(T__1);
          setState(52);
          key();
          setState(53);
          match(T__0);
          setState(56);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case STRING:
            {
              setState(54);
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
              setState(55);
              feature_express();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(58);
          match(T__1);
        }
        break;
        case 4:
          enterOuterAlt(_localctx, 4);
        {
          setState(60);
          key();
          setState(61);
          match(T__0);
          setState(64);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case STRING:
            {
              setState(62);
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
              setState(63);
              feature_express();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(66);
          match(T__2);
          setState(69);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case STRING:
            {
              setState(67);
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
              setState(68);
              feature_express();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(71);
          match(T__2);
          setState(72);
          time_express();
          setState(73);
          match(T__2);
          setState(76);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case STRING:
            {
              setState(74);
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
              setState(75);
              feature_express();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(78);
          match(T__1);
        }
        break;
        case 5:
          enterOuterAlt(_localctx, 5);
        {
          setState(80);
          key();
          setState(81);
          match(T__0);
          setState(82);
          table_name();
          setState(83);
          match(T__2);
          {
            setState(84);
            variable_name();
          }
          setState(85);
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
      setState(113);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case ORIGINAL:
          enterOuterAlt(_localctx, 1);
        {
          setState(89);
          match(ORIGINAL);
        }
        break;
        case BINARY_LABEL:
          enterOuterAlt(_localctx, 2);
        {
          setState(90);
          match(BINARY_LABEL);
        }
        break;
        case REGRESSION_LABEL:
          enterOuterAlt(_localctx, 3);
        {
          setState(91);
          match(REGRESSION_LABEL);
        }
        break;
        case SPLIT:
          enterOuterAlt(_localctx, 4);
        {
          setState(92);
          match(SPLIT);
        }
        break;
        case SPLIT_KEY:
          enterOuterAlt(_localctx, 5);
        {
          setState(93);
          match(SPLIT_KEY);
        }
        break;
        case WINDOW_SUM:
          enterOuterAlt(_localctx, 6);
        {
          setState(94);
          match(WINDOW_SUM);
        }
        break;
        case WINDOW_MAX:
          enterOuterAlt(_localctx, 7);
        {
          setState(95);
          match(WINDOW_MAX);
        }
        break;
        case WINDOW_MIN:
          enterOuterAlt(_localctx, 8);
        {
          setState(96);
          match(WINDOW_MIN);
        }
        break;
        case WINDOW_AVG:
          enterOuterAlt(_localctx, 9);
        {
          setState(97);
          match(WINDOW_AVG);
        }
        break;
        case WINDOW_UNIQUE_COUNT:
          enterOuterAlt(_localctx, 10);
        {
          setState(98);
          match(WINDOW_UNIQUE_COUNT);
        }
        break;
        case WINDOW_COUNT:
          enterOuterAlt(_localctx, 11);
        {
          setState(99);
          match(WINDOW_COUNT);
        }
        break;
        case WINDOW_TOP1_RATIO:
          enterOuterAlt(_localctx, 12);
        {
          setState(100);
          match(WINDOW_TOP1_RATIO);
        }
        break;
        case MULTI_DIRECT:
          enterOuterAlt(_localctx, 13);
        {
          setState(101);
          match(MULTI_DIRECT);
        }
        break;
        case ISIN:
          enterOuterAlt(_localctx, 14);
        {
          setState(102);
          match(ISIN);
        }
        break;
        case COMBINE:
          enterOuterAlt(_localctx, 15);
        {
          setState(103);
          match(COMBINE);
        }
        break;
        case TIMEDIFF:
          enterOuterAlt(_localctx, 16);
        {
          setState(104);
          match(TIMEDIFF);
          setState(105);
          match(LOG);
        }
        break;
        case DAYOFWEEK:
          enterOuterAlt(_localctx, 17);
        {
          setState(106);
          match(DAYOFWEEK);
        }
        break;
        case ISWEEKDAY:
          enterOuterAlt(_localctx, 18);
        {
          setState(107);
          match(ISWEEKDAY);
        }
        break;
        case HOUROFDAY:
          enterOuterAlt(_localctx, 19);
        {
          setState(108);
          match(HOUROFDAY);
        }
        break;
        case ADD:
          enterOuterAlt(_localctx, 20);
        {
          setState(109);
          match(ADD);
        }
        break;
        case DIVIDE:
          enterOuterAlt(_localctx, 21);
        {
          setState(110);
          match(DIVIDE);
        }
        break;
        case MULTIPLY:
          enterOuterAlt(_localctx, 22);
        {
          setState(111);
          match(MULTIPLY);
        }
        break;
        case SUBTRACT:
          enterOuterAlt(_localctx, 23);
        {
          setState(112);
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
        setState(115);
        key();
        setState(116);
        match(T__0);
        setState(117);
        variable_name();
        setState(118);
        match(T__2);
        setState(119);
        variable_name();
        setState(120);
        match(T__2);
        setState(121);
        time_express();
        setState(122);
        match(T__2);
        setState(123);
        variable_name();
        setState(124);
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
        setState(126);
        table_name();
        setState(127);
        match(T__3);
        setState(128);
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
        setState(130);
        day();
        setState(131);
        match(T__4);
        setState(132);
        limit();
        setState(133);
        match(T__5);
        setState(134);
        second();
        setState(135);
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
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitDay(this);
      else return visitor.visitChildren(this);
    }
  }

  public final DayContext day() throws RecognitionException {
    DayContext _localctx = new DayContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_day);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(137);
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
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitLimit(this);
      else return visitor.visitChildren(this);
    }
  }

  public final LimitContext limit() throws RecognitionException {
    LimitContext _localctx = new LimitContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_limit);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(139);
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
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitSecond(this);
      else return visitor.visitChildren(this);
    }
  }

  public final SecondContext second() throws RecognitionException {
    SecondContext _localctx = new SecondContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_second);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(141);
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
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof FeatureVisitor ) return ((FeatureVisitor<? extends T>)visitor).visitTable_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Table_nameContext table_name() throws RecognitionException {
    Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_table_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(143);
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
    enterRule(_localctx, 20, RULE_field_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(145);
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
          "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0096\4\2\t\2\4"+
                  "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
                  "\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3 \n\3\3\3\3\3\3\3\3\3\3\3\3"+
                  "\3\5\3(\n\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3\3\3\3"+
                  "\3\3\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3C\n\3\3\3\3\3\3\3\5"+
                  "\3H\n\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
                  "\3\5\3Z\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
                  "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4t\n\4\3\5\3\5\3\5\3\5\3\5\3"+
                  "\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
                  "\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22"+
                  "\24\26\2\2\2\u00ac\2\30\3\2\2\2\4Y\3\2\2\2\6s\3\2\2\2\bu\3\2\2\2\n\u0080"+
                  "\3\2\2\2\f\u0084\3\2\2\2\16\u008b\3\2\2\2\20\u008d\3\2\2\2\22\u008f\3"+
                  "\2\2\2\24\u0091\3\2\2\2\26\u0093\3\2\2\2\30\31\5\4\3\2\31\32\7\2\2\3\32"+
                  "\3\3\2\2\2\33\34\5\6\4\2\34\37\7\3\2\2\35 \5\n\6\2\36 \5\4\3\2\37\35\3"+
                  "\2\2\2\37\36\3\2\2\2 !\3\2\2\2!\"\7\4\2\2\"Z\3\2\2\2#$\5\6\4\2$\'\7\3"+
                  "\2\2%(\5\n\6\2&(\5\4\3\2\'%\3\2\2\2\'&\3\2\2\2()\3\2\2\2),\7\5\2\2*-\5"+
                  "\n\6\2+-\5\4\3\2,*\3\2\2\2,+\3\2\2\2-.\3\2\2\2./\7\4\2\2/Z\3\2\2\2\60"+
                  "\63\7\3\2\2\61\64\5\n\6\2\62\64\5\4\3\2\63\61\3\2\2\2\63\62\3\2\2\2\64"+
                  "\65\3\2\2\2\65\66\7\4\2\2\66\67\5\6\4\2\67:\7\3\2\28;\5\n\6\29;\5\4\3"+
                  "\2:8\3\2\2\2:9\3\2\2\2;<\3\2\2\2<=\7\4\2\2=Z\3\2\2\2>?\5\6\4\2?B\7\3\2"+
                  "\2@C\5\n\6\2AC\5\4\3\2B@\3\2\2\2BA\3\2\2\2CD\3\2\2\2DG\7\5\2\2EH\5\n\6"+
                  "\2FH\5\4\3\2GE\3\2\2\2GF\3\2\2\2HI\3\2\2\2IJ\7\5\2\2JK\5\f\7\2KN\7\5\2"+
                  "\2LO\5\n\6\2MO\5\4\3\2NL\3\2\2\2NM\3\2\2\2OP\3\2\2\2PQ\7\4\2\2QZ\3\2\2"+
                  "\2RS\5\6\4\2ST\7\3\2\2TU\5\24\13\2UV\7\5\2\2VW\5\n\6\2WX\7\4\2\2XZ\3\2"+
                  "\2\2Y\33\3\2\2\2Y#\3\2\2\2Y\60\3\2\2\2Y>\3\2\2\2YR\3\2\2\2Z\5\3\2\2\2"+
                  "[t\7\35\2\2\\t\7\34\2\2]t\7\17\2\2^t\7\20\2\2_t\7\21\2\2`t\7$\2\2at\7"+
                  "\22\2\2bt\7\23\2\2ct\7\24\2\2dt\7\25\2\2et\7\26\2\2ft\7\27\2\2gt\7\33"+
                  "\2\2ht\7\37\2\2it\7 \2\2jk\7\36\2\2kt\7\16\2\2lt\7!\2\2mt\7#\2\2nt\7\""+
                  "\2\2ot\7\r\2\2pt\7\f\2\2qt\7\13\2\2rt\7\n\2\2s[\3\2\2\2s\\\3\2\2\2s]\3"+
                  "\2\2\2s^\3\2\2\2s_\3\2\2\2s`\3\2\2\2sa\3\2\2\2sb\3\2\2\2sc\3\2\2\2sd\3"+
                  "\2\2\2se\3\2\2\2sf\3\2\2\2sg\3\2\2\2sh\3\2\2\2si\3\2\2\2sj\3\2\2\2sl\3"+
                  "\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\7"+
                  "\3\2\2\2uv\5\6\4\2vw\7\3\2\2wx\5\n\6\2xy\7\5\2\2yz\5\n\6\2z{\7\5\2\2{"+
                  "|\5\f\7\2|}\7\5\2\2}~\5\n\6\2~\177\7\4\2\2\177\t\3\2\2\2\u0080\u0081\5"+
                  "\24\13\2\u0081\u0082\7\6\2\2\u0082\u0083\5\26\f\2\u0083\13\3\2\2\2\u0084"+
                  "\u0085\5\16\b\2\u0085\u0086\7\7\2\2\u0086\u0087\5\20\t\2\u0087\u0088\7"+
                  "\b\2\2\u0088\u0089\5\22\n\2\u0089\u008a\7\t\2\2\u008a\r\3\2\2\2\u008b"+
                  "\u008c\7\30\2\2\u008c\17\3\2\2\2\u008d\u008e\7\31\2\2\u008e\21\3\2\2\2"+
                  "\u008f\u0090\7\32\2\2\u0090\23\3\2\2\2\u0091\u0092\7%\2\2\u0092\25\3\2"+
                  "\2\2\u0093\u0094\7%\2\2\u0094\27\3\2\2\2\f\37\',\63:BGNYs";
  public static final ATN _ATN =
          new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
interface FeatureListener extends ParseTreeListener {
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
   * Enter a parse tree produced by {@link FeatureParser#single_window_express}.
   * @param ctx the parse tree
   */
  void enterSingle_window_express(FeatureParser.Single_window_expressContext ctx);
  /**
   * Exit a parse tree produced by {@link FeatureParser#single_window_express}.
   * @param ctx the parse tree
   */
  void exitSingle_window_express(FeatureParser.Single_window_expressContext ctx);
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
interface FeatureVisitor<T> extends ParseTreeVisitor<T> {
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
   * Visit a parse tree produced by {@link FeatureParser#day}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDay(FeatureParser.DayContext ctx);
  /**
   * Visit a parse tree produced by {@link FeatureParser#limit}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitLimit(FeatureParser.LimitContext ctx);
  /**
   * Visit a parse tree produced by {@link FeatureParser#second}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSecond(FeatureParser.SecondContext ctx);
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
