grammar Bcode;

start_ : program;

// program structure
program                     : 'program' var SYMBOL_OPENPAR (var_def SYMBOL_COMMA?)* SYMBOL_CLOSEPAR 'returns' typ SYMBOL_OPENBRACE (statement)*? stm_return SYMBOL_CLOSEBRACE SYMBOL_SEMICOLON <EOF>;

// pretty much anything listed above plus a semicolon
statement                   :   ( expr_arith
                                | expr_cmp
                                | var_def
                                | var_asg
                                | var_reasg
                                | var
                                | fnc_cprint) SYMBOL_SEMICOLON;

// parser rules
expr_arith              : (lit | var) (opr_arith (lit | var))+;
expr_cmp                : (lit | var) opr_cmp (lit | var);
var_def                 : typ var;
var_asg                 : var_def OPERATOR_ASSIGN (lit | SYMBOL_OPENPAR? (expr_arith | expr_cmp) SYMBOL_CLOSEPAR?);
var_reasg               : var OPERATOR_ASSIGN (lit | SYMBOL_OPENPAR (expr_arith | expr_cmp) SYMBOL_CLOSEPAR | expr_arith | expr_cmp );
fnc_cprint              : FUNCTION_CPRINT SYMBOL_OPENPAR (lit | var)* SYMBOL_CLOSEPAR;

stm_return              : STRUCTURE_RETURN (lit | var | expr_arith | expr_cmp) SYMBOL_SEMICOLON;

// basic groups for parser rules
opr_arith               : ( OPERATOR_ADD | OPERATOR_SUBTR | OPERATOR_MULT | OPERATOR_DIV );
opr_cmp                 : ( OPERATOR_GTHAN | OPERATOR_LTHAN );
sym                     : ( SYMBOL_OPENPAR | SYMBOL_CLOSEPAR | SYMBOL_OPENBRACE | SYMBOL_CLOSEBRACE  | SYMBOL_SEMICOLON | SYMBOL_COMMA );
str                     : ( STRUCTURE_RETURNS | STRUCTURE_RETURN );
lit                     : ( LITERAL_BOOL | LITERAL_NONE | LITERAL_STRING | LITERAL_INTEGER );
var                     : ITEM_VARNAME;
typ                     : ( TYPE_INTEGER | TYPE_BOOL | TYPE_NONE | TYPE_STRING );


// lexer rules
ITEM_COMMENT            : '//' ~[\n]*       -> skip ;
ITEM_WHITESPACE         : (' ' | '\t')      -> skip ;
ITEM_NEWLINE            : [\r\n]            -> skip ;
LITERAL_STRING          : '"' ~[\n]* '"'            ;

OPERATOR_ADD            : '+'                       ;
OPERATOR_SUBTR          : '-'                       ;
OPERATOR_MULT           : '*'                       ;
OPERATOR_DIV            : '/'                       ;
OPERATOR_GTHAN          : '>'                       ;
OPERATOR_LTHAN          : '<'                       ;
OPERATOR_ASSIGN         : '='                       ;
                
SYMBOL_OPENPAR          : '('                       ;
SYMBOL_CLOSEPAR         : ')'                       ;
SYMBOL_OPENBRACE        : '{'                       ;
SYMBOL_CLOSEBRACE       : '}'                       ;
SYMBOL_SEMICOLON        : ';'                       ;
SYMBOL_COMMA            : ','                       ;

STRUCTURE_RETURNS       : 'returns'                 ;
STRUCTURE_RETURN        : 'return'                  ;

FUNCTION_CPRINT         : 'cprint'                  ;

LITERAL_BOOL            : 'TRUE' | 'FALSE'          ;
LITERAL_NONE            : 'NONE'                    ;

ITEM_VARNAME            : [A-Z] [a-zA-Z0-9_]*       ;


TYPE_INTEGER            : 'int'                     ;
TYPE_BOOL               : 'bool'                    ;
TYPE_NONE               : 'none'                    ;
TYPE_STRING             : 'string'                  ;

LITERAL_INTEGER         : [0-9]+                    ;


