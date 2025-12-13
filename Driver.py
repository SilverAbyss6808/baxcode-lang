import sys
from antlr4 import *
from BcodeLexer import BcodeLexer
from BcodeParser import BcodeParser
# from VisitorInterp import VisitorInterp

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = BcodeLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = BcodeParser(stream)
    tree = parser.start_()

if __name__ == '__main__':
    main(sys.argv)