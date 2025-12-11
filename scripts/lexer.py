
# goal of this file is to return a token stream to the caller

from BcoToken import BcoToken as btk

import re
import sys
import traceback

    
def throw_err(error_type):
    match error_type:
        case 'no_main': raise Exception(f'No runnable program found.')
        case _: print('Default error case. Look into this')


def get_tokens(code):
    matches = []
    for token in btk.ttypes:
        token_regex = btk.get_by_regex(token)
        match_iter = re.finditer(token_regex, code)

        for match in match_iter:
            matches.append(match)

            # this stuff removes tokens weve already found while not messing with locations of other tokens, if that makes sense
            # match_len = match.end() - match.start()
            # match_repl = '' * match_len
            # code = code.replace(code[match.start():match.end()], match_repl)
            

    for match in matches:
        print(match)  # make return


# try:
# with open(sys.argv[1], 'rt') as f:

f = open('bco_examples/EvenDivide.bco')
code = f.read().strip()
tokens = get_tokens(code)
    
# except ValueError as v: print(v)
# except Exception: traceback.print_exc()

