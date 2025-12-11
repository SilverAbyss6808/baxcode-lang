
# hugemassive shoutout krypticmouse https://krypticmouse.hashnode.dev/writing-a-compiler-lexical-analysis
# like actually. my goat


import re


class BcoToken:

    # the order that tokens are looked for in
    ttypes = [  'item_comment',
                'item_varname',
              
                'type_integer',         
                'type_float',           
                'type_char',            
                'type_bool',           
                'type_none',            
                'type_array',           
                'type_string',

                # operators with two characters (search for these first)
                'operator_assadd',      
                'operator_asssubtr',    
                'operator_assmult',     
                'operator_assdiv',      
                'operator_assmod',
                'operator_equal',       
                'operator_notequal',
                'operator_gequal',      
                'operator_lequal',    
                'operator_and',         
                'operator_or',

                # operators with one character
                'operator_add',         
                'operator_subtr',       
                'operator_mult',        
                'operator_div',         
                'operator_mod',              
                'operator_not',
                'operator_gthan',       
                'operator_lthan',      
                'operator_assign',

                'symbol_openpar',       
                'symbol_closepar',      
                'symbol_openbrk',       
                'symbol_closebrk',      
                'symbol_openbrace',     
                'symbol_closebrace',    
                'symbol_semicolon',
                     
                'structure_program',    
                'structure_function',

                'statement_if',         
                'statement_then',       
                'statement_else',       
                'statement_for',        
                'statement_while',

                'function_typecast',    
                'function_gettype',     
                'function_baseround',   
                'function_roundup',     
                'function_rounddown',   
                'function_consoleprint',
                'function_consoleread', 
                'function_fileprint',   
                'function_fileread',    
                'function_fileopen',    
                'function_fileclose',   
                'function_arraysort',

                'literal_integer',      
                'literal_float',        
                'literal_char',         
                'literal_bool',         
                'literal_none',         
                'literal_string' 
            ]

    def __init__(self, ttype, value, start_location, end_location):
        self.ttype = ttype
        self.value = value
        self.start_location = start_location
        self.end_location = end_location

    def __str__(self):
        return f'ttype: {self.ttype}, value: {self.value}, spans: {self.start_location}-{self.end_location}'

    def get_by_regex(token):
        match token:
            # define items
            case 'item_varname'         : return re.compile(r'([a-z]\w*)\s?[+\-*/=]')  # variable itself is in group 1

            case 'type_integer'         : return re.compile(r'int')
            case 'type_float'           : return re.compile(r'float')
            case 'type_char'            : return re.compile(r'char')
            case 'type_bool'            : return re.compile(r'bool')
            case 'type_none'            : return re.compile(r'none')  # this is a special type
            case 'type_array'           : return re.compile(r'arrayof')
            case 'type_string'          : return re.compile(r'string')

            case 'literal_integer'      : return re.compile(r'\d+')
            case 'literal_float'        : return re.compile(r'\d+\.\d+')
            case 'literal_char'         : return re.compile(r'\'[a-zA-Z]\'')
            case 'literal_bool'         : return re.compile(r'TRUE|FALSE')
            case 'literal_none'         : return re.compile(r'NONE')
            # array will need to be defined as an open bracket, some items OR one integer, and a closing bracket
            case 'literal_string'       : return re.compile(r'".*"')
            
            # define operators
            case 'operator_add'         : return re.compile(r'\+')
            case 'operator_subtr'       : return re.compile(r'-')
            case 'operator_mult'        : return re.compile(r'\*')
            case 'operator_div'         : return re.compile(r'/')    
            case 'operator_mod'         : return re.compile(r'%')
            case 'operator_assadd'      : return re.compile(r'\+=')
            case 'operator_asssubtr'    : return re.compile(r'-=')
            case 'operator_assmult'     : return re.compile(r'\*=')
            case 'operator_assdiv'      : return re.compile(r'/=')
            case 'operator_assmod'      : return re.compile(r'%=')
            case 'operator_not'         : return re.compile(r'!')
            case 'operator_equal'       : return re.compile(r'==')
            case 'operator_notequal'    : return re.compile(r'!=')
            case 'operator_and'         : return re.compile(r'&&')
            case 'operator_or'          : return re.compile(r'\|\|')
            case 'operator_gthan'       : return re.compile(r'>')
            case 'operator_lthan'       : return re.compile(r'<')
            case 'operator_gequal'      : return re.compile(r'>=')
            case 'operator_lequal'      : return re.compile(r'<=')
            case 'operator_assign'      : return re.compile(r'=')

            # define symbols
            case 'symbol_openpar'       : return re.compile(r'\(')
            case 'symbol_closepar'      : return re.compile(r'\)')
            case 'symbol_openbrk'       : return re.compile(r'\[')
            case 'symbol_closebrk'      : return re.compile(r'\]')
            case 'symbol_openbrace'     : return re.compile(r'{')
            case 'symbol_closebrace'    : return re.compile(r'}')
            case 'symbol_semicolon'     : return re.compile(r';')

            # define structures/statements. a structure is any number of words before braces.
            case 'structure_program'    : return re.compile(r'program')
            case 'structure_function'   : return re.compile(r'function')

            case 'statement_if'         : return re.compile(r'if')
            case 'statement_then'       : return re.compile(r'then')
            case 'statement_else'       : return re.compile(r'else')
            case 'statement_for'        : return re.compile(r'loop')  # loop()
            case 'statement_while'      : return re.compile(r'loop_until')  # loop_until()

            # define prerecognized functions
            case 'function_typecast'    : return re.compile(r'change_type')
            case 'function_gettype'     : return re.compile(r'get_type')
            case 'function_baseround'   : return re.compile(r'round')
            case 'function_roundup'     : return re.compile(r'round_up')
            case 'function_rounddown'   : return re.compile(r'round_down')
            case 'function_consoleprint': return re.compile(r'cprint')
            case 'function_consoleread' : return re.compile(r'cread')
            case 'function_fileprint'   : return re.compile(r'fprint')
            case 'function_fileread'    : return re.compile(r'fread')
            case 'function_fileopen'    : return re.compile(r'fopen')
            case 'function_fileclose'   : return re.compile(r'fclose')
            case 'function_arraysort'   : return re.compile(r'sort')

            # misc definitions
            case 'item_comment'              : return re.compile(r'//.*')

            case _                      : raise Exception('get_by_regex error')


    # return BcoToken object
    def get_token(token, value=None):
        match token:
            # things w/ no user-entered values
            case 'type_integer'         : return BcoToken(token, 'int')
            case 'type_float'           : return BcoToken(token, 'float')
            case 'type_char'            : return BcoToken(token, 'char')
            case 'type_bool'            : return BcoToken(token, 'bool')
            case 'type_none'            : return BcoToken(token, 'none')
            case 'type_array'           : return BcoToken(token, 'arrayof')
            case 'type_string'          : return BcoToken(token, 'string')
                        
            case 'operator_add'         : return BcoToken(token, '+')
            case 'operator_subtr'       : return BcoToken(token, '-')
            case 'operator_mult'        : return BcoToken(token, '*')
            case 'operator_div'         : return BcoToken(token, '/')
            case 'operator_mod'         : return BcoToken(token, '%')
            case 'operator_assadd'      : return BcoToken(token, '+=')
            case 'operator_asssubtr'    : return BcoToken(token, '-=')
            case 'operator_assmult'     : return BcoToken(token, '*=')
            case 'operator_assdiv'      : return BcoToken(token, '/=')
            case 'operator_assmod'      : return BcoToken(token, '%=')
            case 'operator_not'         : return BcoToken(token, '!')
            case 'operator_equal'       : return BcoToken(token, '==')
            case 'operator_notequal'    : return BcoToken(token, '!=')
            case 'operator_and'         : return BcoToken(token, '&&')
            case 'operator_or'          : return BcoToken(token, '||')
            case 'operator_gthan'       : return BcoToken(token, '>')
            case 'operator_lthan'       : return BcoToken(token, '<')
            case 'operator_gequal'      : return BcoToken(token, '>=')
            case 'operator_lequal'      : return BcoToken(token, '<=')
            case 'operator_assign'      : return BcoToken(token, '=')

            case 'symbol_openpar'       : return BcoToken(token, '(')
            case 'symbol_closepar'      : return BcoToken(token, ')')
            case 'symbol_openbrk'       : return BcoToken(token, '[')
            case 'symbol_closebrk'      : return BcoToken(token, ']')
            case 'symbol_openbrace'     : return BcoToken(token, '{')
            case 'symbol_closebrace'    : return BcoToken(token, '}')
            case 'symbol_semicolon'     : return BcoToken(token, ';')
 
            case 'structure_program'    : return BcoToken(token, 'program')
            case 'structure_function'   : return BcoToken(token, 'function')

            case 'statement_if'         : return BcoToken(token, 'if')
            case 'statement_then'       : return BcoToken(token, 'then')
            case 'statement_else'       : return BcoToken(token, 'else')
            case 'statement_for'        : return BcoToken(token, 'for')
            case 'statement_while'      : return BcoToken(token, 'while')

            case 'function_typecast'    : return BcoToken(token, 'change_type')
            case 'function_gettype'     : return BcoToken(token, 'get_type')
            case 'function_baseround'   : return BcoToken(token, 'round')
            case 'function_roundup'     : return BcoToken(token, 'round_up')
            case 'function_rounddown'   : return BcoToken(token, 'round_down')
            case 'function_consoleprint': return BcoToken(token, 'cprint')
            case 'function_consoleread' : return BcoToken(token, 'cread')
            case 'function_fileprint'   : return BcoToken(token, 'fprint')
            case 'function_fileread'    : return BcoToken(token, 'fread')
            case 'function_fileopen'    : return BcoToken(token, 'fopen')
            case 'function_fileclose'   : return BcoToken(token, 'fclose')
            case 'function_arraysort'   : return BcoToken(token, 'sort')

            # things WITH associated values
            # ok listen. i know this is not the most efficient way of doing this but im running out of time. 
            # ill make it better if i can actually finish this with more than ten seconds to spare
            case 'literal_integer'      : return BcoToken(token, int(value))
            case 'literal_float'        : return BcoToken(token, float(value))
            case 'literal_char'         : return BcoToken(token, value[0])
            case 'literal_bool'         : return BcoToken(token, bool(value))
            case 'literal_none'         : return BcoToken(token, 'NONE')
            case 'literal_string'       : return BcoToken(token, str(value))

            case 'item_comment'         : return BcoToken(token, str(value))
            case 'item_varname'         : return BcoToken(token, str(value))

            case _                      : raise ValueError('Token value not of correct type.')

    