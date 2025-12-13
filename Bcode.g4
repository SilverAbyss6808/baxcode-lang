grammar Bcode;

// lexer rules
ITEM_COMMENT            : '//' ~[\n] -> skip    ;
LITERAL_STRING          : '"' ~[\n] '"'              ;

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

STRUCTURE_PROGRAM       : 'program'                 ;
STRUCTURE_RETURNS       : 'returns'                 ;
STRUCTURE_RETURN        : 'return'                  ;

FUNCTION_CPRINT         : 'cprint'                  ;

LITERAL_BOOL            : 'TRUE' | 'FALSE'          ;
LITERAL_NONE            : 'NONE'                    ;

ITEM_VARNAME            : [A-Z] [a-zA-Z0-9_]*       ;
ITEM_WHITESPACE         : (' ' | '\t') -> skip      ;
ITEM_NEWLINE            : [\r\n] -> skip          ;

TYPE_INTEGER            : 'int'                     ;
TYPE_BOOL               : 'bool'                    ;
TYPE_NONE               : 'none'                    ;
TYPE_STRING             : 'string'                  ;

LITERAL_INTEGER         : [0-9]+                    ;


// basic groups for parser rules
opr_arith               : ( OPERATOR_ADD | OPERATOR_SUBTR | OPERATOR_MULT | OPERATOR_DIV );
opr_cmp                 : ( OPERATOR_GTHAN | OPERATOR_LTHAN );
sym                     : ( SYMBOL_OPENPAR | SYMBOL_CLOSEPAR | SYMBOL_OPENBRACE | SYMBOL_CLOSEBRACE  | SYMBOL_SEMICOLON | SYMBOL_COMMA );
str                     : ( STRUCTURE_PROGRAM | STRUCTURE_RETURNS | STRUCTURE_RETURN );
lit                     : ( LITERAL_BOOL | LITERAL_NONE | LITERAL_STRING | LITERAL_INTEGER );
itm                     : ( ITEM_VARNAME | ITEM_COMMENT | ITEM_WHITESPACE | ITEM_NEWLINE );
typ                     : ( TYPE_INTEGER | TYPE_BOOL | TYPE_NONE | TYPE_STRING );

// parser rules
expr_arith              : (lit | ITEM_VARNAME) (opr_arith (lit | ITEM_VARNAME))+;
expr_cmp                : (lit | ITEM_VARNAME) opr_cmp (lit | ITEM_VARNAME);
var_def                 : typ ITEM_VARNAME;
var_asg                 : var_def OPERATOR_ASSIGN (lit | SYMBOL_OPENPAR (expr_arith | expr_cmp) SYMBOL_CLOSEPAR | expr_arith | expr_cmp);
var_reasg               : ITEM_VARNAME OPERATOR_ASSIGN (lit | SYMBOL_OPENPAR (expr_arith | expr_cmp) SYMBOL_CLOSEPAR | expr_arith | expr_cmp );
fnc_cprint              : FUNCTION_CPRINT SYMBOL_OPENPAR (lit | ITEM_VARNAME)* SYMBOL_CLOSEPAR;
stm_return              : STRUCTURE_RETURN (lit | ITEM_VARNAME | expr_arith | expr_cmp);

// pretty much anything listed above plus a semicolon
statement                   :   expr_arith
                                | expr_cmp
                                | var_def
                                | var_asg
                                | var_reasg
                                | fnc_cprint
                                | stm_return SYMBOL_SEMICOLON;

// program structure
program                     : 'program' ITEM_VARNAME SYMBOL_OPENPAR (var_def SYMBOL_COMMA?)* SYMBOL_CLOSEPAR 'returns' typ SYMBOL_OPENBRACE (statement)* stm_return SYMBOL_CLOSEBRACE SYMBOL_SEMICOLON EOF;

start_ : program;
