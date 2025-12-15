grammar Bcode;

start_ : program;

// program structure
program                     :   'program' ITEM_VARNAME SYMBOL_OPENPAR (expression SYMBOL_COMMA?)* SYMBOL_CLOSEPAR 'returns' typ SYMBOL_OPENBRACE 
                                    (line)*? 
                                SYMBOL_CLOSEBRACE SYMBOL_SEMICOLON <EOF>;

// pretty much anything listed below plus a semicolon
expression                  : expression opr_arith expression                                   #expr_arith
                            | typ ITEM_VARNAME OPERATOR_ASSIGN expression                       #var_asg
                            | typ ITEM_VARNAME                                                  #var_def
                            | ITEM_VARNAME                                                      #var     
                            | FUNCTION_CPRINT SYMBOL_OPENPAR expression SYMBOL_CLOSEPAR         #fnc_cprint
                            | STRUCTURE_RETURN expression                                       #stm_return
                            | (LITERAL_BOOL | LITERAL_NONE | LITERAL_STRING | LITERAL_INTEGER)  #lit
                            ;

line                        :   expression SYMBOL_SEMICOLON;


// basic groups for parser rules
opr_arith               : ( OPERATOR_ADD | OPERATOR_SUBTR | OPERATOR_MULT | OPERATOR_DIV );
opr_cmp                 : ( OPERATOR_GTHAN | OPERATOR_LTHAN );
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

