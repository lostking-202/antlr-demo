grammar Feature;

parse
 : feature_express EOF
 ;


feature_express:
key'('(variable_name|feature_express)')'
|key'('(variable_name|feature_express)','(variable_name|feature_express)')'
|'('(variable_name|feature_express)')'key'('(variable_name|feature_express)')'
|key'('(variable_name|feature_express)','(variable_name|feature_express)','time_express','(variable_name|feature_express)')'
|key'('table_name','(variable_name)')';

key:ORIGINAL|
    BINARY_LABEL|
    REGRESSION_LABEL|SPLIT|
    SPLIT_KEY|WINDOW_SUM|WINDOW_MAX|WINDOW_MIN|WINDOW_AVG|WINDOW_UNIQUE_COUNT|WINDOW_COUNT|WINDOW_TOP1_RATIO|MULTI_DIRECT|ISIN|COMBINE|TIMEDIFF
    |LOG|DAYOFWEEK|ISWEEKDAY|HOUROFDAY|ADD|DIVIDE|MULTIPLY|SUBTRACT
;

SUBTRACT:'subtract';

MULTIPLY:'multiply';

DIVIDE:'divide';

ADD:'add';

LOG:'log';

REGRESSION_LABEL:'regression_label';

SPLIT:'split';

SPLIT_KEY:'split_key';

WINDOW_MAX:'window_max';

WINDOW_MIN:'window_min';

WINDOW_AVG:'window_avg';

WINDOW_UNIQUE_COUNT:'window_unique_count';

WINDOW_COUNT:'window_count';

WINDOW_TOP1_RATIO:'window_top1_ratio';

feature_express2:
    key1'('variable_name')'
    |key2'('inner_expression')'
    |key3'('table_name','variable_name')'
    |key4'('variable_name','variable_name')'
    |key5'('variable_name','inner_expression')'
    |key6'('table_name','variable_name')'
    |'('variable_name')'key7'('variable_name')'
    |key8'('variable_name','variable_name','time_express','variable_name')';

expression
    :key1'('variable_name')'
    |key2'('inner_expression')'
    |key4'('variable_name','variable_name')'
    |key5'('variable_name','inner_expression')'
    |'('variable_name')'key7'('variable_name')'
    |key8'('variable_name','variable_name','time_express','variable_name')';

inner_expression
  :key3'('table_name','variable_name')';//能作为嵌套的内部函数,也可单独作为外部函数

express1:key1'('variable_name')';//只能作为外部函数

express2:key2'('express3')';//嵌套

express3:key3'('table_name','variable_name')';//能作为嵌套的内部函数,也可单独作为外部函数

express4:key4'('variable_name','variable_name')';//只能作为外部函数

express5:key5'('variable_name','express6')';//嵌套

express6:key6'('table_name','variable_name')';//能作为嵌套的内部函数,也可单独作为外部函数

express7:'('variable_name')'key7'('variable_name')';

single_window_express:key8'('variable_name','variable_name','time_express','variable_name')';

//mutil_window_express:key9'('

variable_name:table_name'.'field_name;

key1:ORIGINAL;

key2:BINARY_LABEL|DAYOFWEEK|HOUROFDAY|ISWEEKDAY;

key3:MULTI_DIRECT;

key4:TIMEDIFF;

key5:COMBINE;

key6:MULTI_DIRECT;

key7:ISIN;

key8:WINDOW_SUM;

time_express:DAY'd:'LIMIT':'SECOND's';

DAY:[1-9][0-9]*;

LIMIT:[0-9]*;

SECOND:[1-9][0-9]*;

MULTI_DIRECT:'multi_direct';

BINARY_LABEL:'binary_label';

ORIGINAL:'original';

TIMEDIFF:'timediff';

ISIN:'isin';

COMBINE:'combine';

DAYOFWEEK:'dayofweek';

HOUROFDAY:'hourofday';

ISWEEKDAY:'isweekday';

WINDOW_SUM:'window_sum';

table_name:STRING;

field_name:STRING;

STRING:[a-zA-Z][a-zA-Z0-9_]*;

//+ *