
import re
import sys
import traceback

# goal of this file is to return a token stream to the caller

class BcoToken:

    program = re.compile(r'program [A-Z]\w*\(.*\)\s?{.*};')
    # comment = 

    def __init__(self, source_code):
        self.source_code = source_code
        self.line_num = 0

    def iter_tokens(self):
        for token in self:
            pass
    
    def iter_lines(self):
        for line in self.source_code.split('\n'):
            self.line_num += 1
            print(f'{self.line_num}     {line}')

    def throw_err(self, error_message):
        raise ValueError(f'Line {self.line_num}: {error_message}')

    def tokenerize(self):
        pass


try:

    with open(sys.argv[1], 'rt') as f:
        code = f.read()
    codefile = BcoLex(code)
    codefile.tokenerize()

except ValueError as v: print(v)
except Exception: traceback.print_exc()

