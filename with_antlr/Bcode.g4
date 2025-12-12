grammar Bcode;

// lexer rules
fragment UPPERCHAR      : [A-Z] ;
fragment LOWERCHAR      : [a-z] ;
fragment DIGIT          : [0-9] ;
// fragment SPECCHAR       : [~!@#$%^&*()`-={}[\]|\\:;"<,>.?/'];

// OPERATOR_ASSADD         : '+='                      ;
// OPERATOR_ASSSUBTR       : '-='                      ;
// OPERATOR_ASSMULT        : '*='                      ;
// OPERATOR_ASSDIV         : '/='                      ;
// OPERATOR_ASSMOD         : '%='                      ;
// OPERATOR_EQUAL          : '=='                      ;
// OPERATOR_NOTEQUAL       : '!='                      ;
// OPERATOR_GEQUAL         : '>='                      ;
// OPERATOR_LEQUAL         : '<='                      ;
// OPERATOR_AND            : '&&'                      ;
// OPERATOR_OR             : '||'                      ;
OPERATOR_ADD            : '+'                       ;
OPERATOR_SUBTR          : '-'                       ;
OPERATOR_MULT           : '*'                       ;
OPERATOR_DIV            : '/'                       ;
// OPERATOR_MOD            : '%'                       ;
// OPERATOR_NOT            : '!'                       ;
OPERATOR_GTHAN          : '>'                       ;
OPERATOR_LTHAN          : '<'                       ;
OPERATOR_ASSIGN         : '='                       ;
                
SYMBOL_OPENPAR          : '('                       ;
SYMBOL_CLOSEPAR         : ')'                       ;
// SYMBOL_OPENBRK          : '['                       ;
// SYMBOL_CLOSEBRK         : ']'                       ;
SYMBOL_OPENBRACE        : '{'                       ;
SYMBOL_CLOSEBRACE       : '}'                       ;
SYMBOL_SEMICOLON        : ';'                       ;
SYMBOL_COMMA            : ','                       ;

STRUCTURE_PROGRAM       : 'program'                 ;
// STRUCTURE_FUNCTION      : 'function'                ;
STRUCTURE_RETURNS       : 'returns'                 ;
STRUCTURE_RETURN        : 'return'                  ;

// STATEMENT_IF            : 'if'                      ;
// STATEMENT_THEN          : 'then'                    ;
// STATEMENT_ELSE          : 'else'                    ;
// STATEMENT_WHILE         : 'loop'                    ;
// STATEMENT_FOR           : 'loop_until'              ;

// FUNCTION_TYPECAST       : 'change_type'             ;
// FUNCTION_GETTYPE        : 'get_type'                ;
// FUNCTION_ROUNDUP        : 'round_up'                ;
// FUNCTION_ROUNDDOWN      : 'round_down'              ;
FUNCTION_BASEROUND      : 'round'                   ;
// FUNCTION_CONSOLEPRINT   : 'cprint'                  ;
// FUNCTION_CONSOLEREAD    : 'cread'                   ;
// FUNCTION_FILEPRINT      : 'fprint'                  ;
// FUNCTION_FILEREAD       : 'fread'                   ;
// FUNCTION_FILEOPEN       : 'fopen'                   ;
// FUNCTION_FILECLOSE      : 'fclose'                  ;
// FUNCTION_ARRAYSORT      : 'sort'                    ;

// LITERAL_CHAR            : '\'' '\''                 ;
LITERAL_BOOL            : ('TRUE' | 'FALSE')        ;
LITERAL_NONE            : 'NONE'                    ;
LITERAL_STRING          : '"' '"'                   ;
// LITERAL_FLOAT           : DIGIT+ . DIGIT+           ;
LITERAL_INTEGER         : DIGIT+                    ;

ITEM_VARNAME            : [A-Z] [a-zA-Z0-9_]*       ;
ITEM_COMMENT            : '//' -> skip              ;
ITEM_WHITESPACE         : (' ' | '\t') -> skip      ;
ITEM_NEWLINE            : '\n'                      ;

TYPE_INTEGER            : 'int'                     ;
// TYPE_FLOAT              : 'float'                   ;
// TYPE_CHAR               : 'char'                    ;
TYPE_BOOL               : 'bool'                    ;
TYPE_NONE               : 'none'                    ;
// TYPE_ARRAY              : 'arrayof'                 ;
TYPE_STRING             : 'string'                  ;

// basic groups for parser rules
OPERATOR                : ( // OPERATOR_ASSADD | OPERATOR_ASSSUBTR | OPERATOR_ASSMULT | OPERATOR_ASSDIV | OPERATOR_ASSMOD 
                            // | OPERATOR_EQUAL | OPERATOR_NOTEQUAL | OPERATOR_GEQUAL | OPERATOR_LEQUAL | OPERATOR_AND | OPERATOR_OR | OPERATOR_MOD | OPERATOR_NOT
                            OPERATOR_ADD | OPERATOR_SUBTR | OPERATOR_MULT | OPERATOR_DIV 
                            | OPERATOR_GTHAN | OPERATOR_LTHAN | OPERATOR_ASSIGN );
SYMBOL                  : ( SYMBOL_OPENPAR | SYMBOL_CLOSEPAR | SYMBOL_SEMICOLON | SYMBOL_COMMA | SYMBOL_OPENBRACE | SYMBOL_CLOSEBRACE 
                            // | SYMBOL_OPENBRK | SYMBOL_CLOSEBRK
                            );
STRUCTURE               : ( STRUCTURE_PROGRAM | STRUCTURE_RETURNS | STRUCTURE_RETURN 
                            // | STRUCTURE_FUNCTION
                            );
// STATEMENT               : ( STATEMENT_IF | STATEMENT_THEN | STATEMENT_ELSE | STATEMENT_WHILE | STATEMENT_FOR );
FUNCTION                : ( FUNCTION_BASEROUND
                            // | FUNCTION_TYPECAST | FUNCTION_GETTYPE | FUNCTION_ROUNDUP | FUNCTION_ROUNDDOWN 
                            // | FUNCTION_CONSOLEPRINT | FUNCTION_CONSOLEREAD | FUNCTION_FILEPRINT | FUNCTION_FILEREAD
                            // | FUNCTION_FILEOPEN | FUNCTION_FILECLOSE | FUNCTION_ARRAYSORT 
                            );
LITERAL                 : ( LITERAL_BOOL | LITERAL_NONE | LITERAL_STRING | LITERAL_INTEGER 
                            // | LITERAL_CHAR | LITERAL_FLOAT 
                            );
ITEM                    : ( ITEM_VARNAME | ITEM_COMMENT | ITEM_WHITESPACE | ITEM_NEWLINE );
TYPE                    : ( TYPE_INTEGER | TYPE_BOOL | TYPE_NONE | TYPE_STRING
                            // | TYPE_FLOAT | TYPE_CHAR | TYPE_ARRAY 
                            );

// parser rules
act_operator                : (LITERAL | ITEM_VARNAME) OPERATOR (LITERAL | ITEM_VARNAME);
act_var_definition_noassign : TYPE ITEM_VARNAME;
act_var_definition_assign   : act_var_definition_noassign OPERATOR_ASSIGN (LITERAL | SYMBOL_OPENPAR act_operator SYMBOL_CLOSEPAR);
act_structure_def           : ITEM_VARNAME SYMBOL_OPENPAR (act_var_definition_noassign SYMBOL_COMMA?)* SYMBOL_CLOSEPAR SYMBOL_OPENBRACE statement* SYMBOL_CLOSEBRACE;
act_function_def            : STRUCTURE_FUNCTION act_structure_def;
act_program_def             : STRUCTURE_PROGRAM  act_structure_def;

action                      : ;  // pretty much anything listed with act_ above, minus the semicolon
statement                   : action SYMBOL_SEMICOLON;
