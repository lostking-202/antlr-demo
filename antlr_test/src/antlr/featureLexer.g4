lexer grammar featureLexer;

channels { MYSQLCOMMENT, ERRORCHANNEL }

SPEC_MYSQL_COMMENT:                  '/*!' .+? '*/' -> channel(MYSQLCOMMENT);
ERROR_RECONGNIGION:                  .    -> channel(ERRORCHANNEL);

LR_BRACKET:                          '(';
RR_BRACKET:                          ')';