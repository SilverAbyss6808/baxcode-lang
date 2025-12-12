
# goal of this file is to return a token stream to the caller

from cls_BcoError import BcoError as berr
from cls_BcoToken import BcoToken as btk

import re
import sys
import traceback


def get_tokens(code):
    matches = []

    for token in btk.ttypes:
        token_regex = btk.get_by_regex(token)
        match_iter = re.finditer(token_regex, code)

        for match in match_iter:
            token_already_known = False
            for known_token in matches:
                # TODO make sure you handle cases where variable is referenced inside string correctly
                if (match.start() >= known_token.start_location and match.end() <= known_token.end_location):  # or, if it starts and ends inside another token
                    token_already_known = True
                    continue

            if token_already_known == False:
                matches.append(btk(token, match.group(), match.start(), match.end()))    

    sorted_matches = btk.sort_tokens(matches)

    # TODO: fix the {}{}; that prints after strings, for some reason
    for match in sorted_matches: print(f'{match.ttype}\t\t\t {match.value}')  # make return
    # return matches


# try:
# with open(sys.argv[1], 'rt') as f:

f = open('bco_examples/TryEverything.bco')
code = f.read()
tokens = get_tokens(code)
    
# except ValueError as v: print(v)
# except Exception: traceback.print_exc()

