
import sys

class Baxcode:
    def __init__(self, source_code):
        self.source_code = source_code
        self.line_num = 0

    def throw_err(self, error_message):
        raise ValueError(f'Line {self.line_num}: {error_message}')
    
    def iter_tokens(self):
        for line in self.source_code.strip().split(';'):
            self.line_num += 1
            print(line)

if __name__ == '__main__':
    with open(sys.argv[1], 'rt') as f:
        code = f.read()
    program = Baxcode(code)
    program.run()                                                                 
