
import re
import sys
import traceback

# goal of this file is to return a token stream to the caller

class BcoToken:

    program = re.compile(r'program [A-Z]\w*\(.*\)\s?{.*};', re.S)  # re.S makes the dot take the newline as well
    comment = re.compile(r'/\/\/.*/')
    string = re.compile(r'')

    def __init__(self, source_code):
        self.source_code = source_code
        self.line_num = 0

    def get_token_type(self):
        


# def handle_program(code):
    

def throw_err(error_type):
    match error_type:
        case 'no_main':
            raise Exception(f'No runnable program found.')


def get_tokens(code):
    # find program code in file
    if re.match(BcoToken.program, code):
        program = re.match(BcoToken.program, code).group()
    else: throw_err('no_main')

    print('hi')

# try:

# with open(sys.argv[1], 'rt') as f:
f = open('bco_examples/HelloWorld.bco')
code = f.read().strip()
tokens = get_tokens(code)
    
# except ValueError as v: print(v)
# except Exception: traceback.print_exc()

