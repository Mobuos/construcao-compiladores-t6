# Generated from antlr/hello.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .helloParser import helloParser
else:
    from helloParser import helloParser

# This class defines a complete listener for a parse tree produced by helloParser.
class helloListener(ParseTreeListener):

    # Enter a parse tree produced by helloParser#r.
    def enterR(self, ctx:helloParser.RContext):
        pass

    # Exit a parse tree produced by helloParser#r.
    def exitR(self, ctx:helloParser.RContext):
        pass



del helloParser