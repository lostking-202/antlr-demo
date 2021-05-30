grammar Feature;

parse
 : feature_express EOF
 ;

feature_express
    :key'('(variable_name|feature_express)(','(variable_name|feature_express))*')'  #combineExpression
    |'('(variable_name|feature_express)')'key'('(variable_name|feature_express)')'  #judgeExpression
    |key'('table_name','variable_name')'                                            #mutilDirectExpression
    |key'('(variable_name)','(variable_name)','time_express','(variable_name)')'    #singleWindowExpression
    |key'('table_name','variable_name','time_express')'                             #mutilWindowExpression
    ;

DOT:                                 '.';
LR_BRACKET:                          '(';
RR_BRACKET:                          ')';
COMMA:                               ',';

key:ORIGINAL|
    BINARY_LABEL|
    REGRESSION_LABEL|
    SPLIT|
    SPLIT_KEY|
    WINDOW_SUM|
    WINDOW_MAX|
    WINDOW_MIN|
    WINDOW_AVG|
    WINDOW_UNIQUE_COUNT|
    WINDOW_COUNT|
    WINDOW_TOP1_RATIO|
    MULTI_DIRECT|
    ISIN|
    COMBINE|
    TIMEDIFF
    LOG|
    DAYOFWEEK|
    ISWEEKDAY|
    HOUROFDAY|
    ADD|
    DIVIDE|
    MULTIPLY|
    SUBTRACT|
    MULTI_SUM|
    MULTI_MAX|
    MULTI_MIN|
    MULTI_AVG|
    MULTI_UNIQUE_COUNT|
    MULTI_COUNT|
    MULTI_TOP3FREQUENCY|
    MULTI_LAST_VALUE
;

MULTI_SUM:'multi_sum';

MULTI_MAX:'multi_max';

MULTI_MIN:'multi_min';

MULTI_AVG:'multi_avg';

MULTI_UNIQUE_COUNT:'multi_unique_count';

MULTI_COUNT:'multi_count';

MULTI_TOP3FREQUENCY:'multi_top3frequency';

MULTI_LAST_VALUE:'multi_last_value';

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

//single_window_express:key'('variable_name','variable_name','time_express','variable_name')';

//mutil_window_express:key9'('

variable_name:table_name'.'field_name;

time_express:day'd:'limit':'second's';

day:DAY;

limit:LIMIT;

second:SECOND;

DAY:[1-9][0-9]*;

LIMIT:[1-9][0-9]*;

SECOND:[0-9]|[1-9][0-9]*;

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