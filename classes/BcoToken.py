
# hugemassive shoutout krypticmouse https://krypticmouse.hashnode.dev/writing-a-compiler-lexical-analysis
# like actually. my goat


import re


class BcoToken:

    def __init__(self, ttype, value):
        self.ttype = ttype
        self.value = value

    def get_by_regex(token):
        match token:
            # define items
            case 'varname'              : return re.compile(r'[a-z]\w+')

            case 'type_integer'         : return re.compile(r'int')
            case 'type_float'           : return re.compile(r'float')
            case 'type_char'            : return re.compile(r'char')
            case 'type_bool'            : return re.compile(r'bool')
            case 'type_none'            : return re.compile(r'none')  # this is a special type
            case 'type_array'           : return re.compile(r'arrayof')
            case 'type_string'          : return re.compile(r'string')

            case 'literal_integer'      : return re.compile(r'\d+')
            case 'literal_float'        : return re.compile(r'\d+\.\d+')
            case 'literal_char'         : return re.compile(r'[a-zA-Z]')
            case 'literal_bool'         : return re.compile(r'TRUE|FALSE')
            case 'literal_none'         : return re.compile(r'none')
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
            case 'comment'              : return re.compile(r'//.*')

            case _                      : raise 


# return BcoToken object
    def get_token(token, value=None):
        match token:
            case 'varname'              : return BcoToken()

            case 'type_integer'         : return
            case 'type_float'           : return
            case 'type_char'            : return
            case 'type_bool'            : return
            case 'type_none'            : return
            case 'type_array'           : return
            case 'type_string'          : return

            case 'literal_integer'      : return
            case 'literal_float'        : return
            case 'literal_char'         : return
            case 'literal_bool'         : return
            case 'literal_none'         : return
            case 'literal_string'       : return
                        
            case 'operator_add'         : return
            case 'operator_subtr'       : return
            case 'operator_mult'        : return
            case 'operator_div'         : return
            case 'operator_mod'         : return
            case 'operator_assadd'      : return
            case 'operator_asssubtr'    : return
            case 'operator_assmult'     : return
            case 'operator_assdiv'      : return
            case 'operator_assmod'      : return
            case 'operator_not'         : return
            case 'operator_equal'       : return
            case 'operator_notequal'    : return
            case 'operator_and'         : return
            case 'operator_or'          : return
            case 'operator_gthan'       : return
            case 'operator_lthan'       : return
            case 'operator_gequal'      : return
            case 'operator_lequal'      : return
            case 'operator_assign'      : return

            case 'symbol_openpar'       : return
            case 'symbol_closepar'      : return
            case 'symbol_openbrk'       : return
            case 'symbol_closebrk'      : return
            case 'symbol_openbrace'     : return
            case 'symbol_closebrace'    : return
            case 'symbol_semicolon'     : return

            case 'structure_program'    : return
            case 'structure_function'   : return

            case 'statement_if'         : return
            case 'statement_then'       : return
            case 'statement_else'       : return
            case 'statement_for'        : return
            case 'statement_while'      : return

            case 'function_typecast'    : return
            case 'function_gettype'     : return
            case 'function_baseround'   : return
            case 'function_roundup'     : return
            case 'function_rounddown'   : return
            case 'function_consoleprint': return
            case 'function_consoleread' : return
            case 'function_fileprint'   : return
            case 'function_fileread'    : return
            case 'function_fileopen'    : return
            case 'function_fileclose'   : return
            case 'function_arraysort'   : return

            case 'comment'              : return

    