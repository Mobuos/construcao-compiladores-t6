import sys
from antlr4 import *
from antlr.helloLexer import helloLexer
from antlr.helloParser import helloParser
 
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = helloLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = helloParser(stream)
    tree = parser.r();
 
if __name__ == '__main__':
    main(sys.argv)