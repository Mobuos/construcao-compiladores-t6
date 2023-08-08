# Generated from antlr/hello.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .helloParser import helloParser
else:
    from helloParser import helloParser

# This class defines a complete generic visitor for a parse tree produced by helloParser.

class helloVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by helloParser#r.
    def visitR(self, ctx:helloParser.RContext):
        return self.visitChildren(ctx)



del helloParser