import sys
from antlr4 import *
from BcodeLexer import BcodeLexer
from BcodeParser import BcodeParser
from BcodeExec import BcodeExec

def main(argv):
    # input_stream = FileStream(argv[1])
    input_stream = FileStream('bco_examples/TestImplemented.bco')
    lexer = BcodeLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = BcodeParser(stream)
    tree = parser.start_()

    bcode_exec = BcodeExec()
    walker = ParseTreeWalker()
    walker.walk(bcode_exec, tree)

if __name__ == '__main__':
    main(sys.argv)

 