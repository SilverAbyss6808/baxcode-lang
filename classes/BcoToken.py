
import re


class BcoToken:

    # define structures/statements. a structure is any number of words before braces.
    program = re.compile(r'program [a-z]\w*\(.*\) returns \w+\s?{.*};', re.S)  # re.S makes the dot take the newline as well
    recallfunct = re.compile(r'(?:\w+(?:\(\)))')
    definefunct = re.compile(r'')

    conditional = re.compile(r'')
    ifstatement = re.compile(r'')  # if ___ then {}
    ifelse = re.compile(r'')

    loop = re.compile(r'')
    forloop = re.compile(r'')  # loop()
    whileloop = re.compile(r'')  # loop_until()

    # define items
    datatype = re.compile(r'')
    integerliteral = re.compile(r'')
    floatliteral = re.compile(r'')
    charliteral = re.compile(r'')
    boolliteral = re.compile(r'')
    arrayliteral = re.compile(r'')
    stringliteral = re.compile(r'')

    varname = re.compile(r'')
    operator = re.compile(r'')

    # misc definitions
    comment = re.compile(r'//.*')
    semicolon = re.compile(r';')

    structures = []
    items = []
    datatypes = ['int', 'float', 'char', 'bool', 'arrayof', 'string']
    predef_functions = ['change_type', 'get_type', 'round', 'round_up', 'round_down', 'cprint', 'cread', 'fprint', 'fread', 'fopen', 'fclose', 'sort']

    def __init__(self, source_code):
        self.source_code = source_code
        self.line_num = 0

    def get_token_type(self):
        pass

    