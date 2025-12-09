
import classes.BcoToken as btk

import re
import sys
import traceback


# goal of this file is to return a token stream to the caller

# def handle_program(code):
    
def throw_err(error_type):
    match error_type:
        case 'no_main': raise Exception(f'No runnable program found.')
        case _: print('Default error case. Look into this')

def get_tokens(code):
    # find program code in file
    if re.match(btk.program, code):
        program = re.match(btk.program, code).group()
    else: throw_err('no_main')

    print('hi')

# try:
# with open(sys.argv[1], 'rt') as f:

f = open('bco_examples/EvenDivide.bco')
code = f.read().strip()
tokens = get_tokens(code)
    
# except ValueError as v: print(v)
# except Exception: traceback.print_exc()

