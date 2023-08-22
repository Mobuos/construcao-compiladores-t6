import sys
from antlr4 import *
from antlr.minecraftCommandsLexer import minecraftCommandsLexer
from antlr.minecraftCommandsParser import minecraftCommandsParser
from antlr.minecraftCommandsListener import minecraftCommandsListener
from antlr.minecraftCommandsVisitor import minecraftCommandsVisitor
from dictConquistas import dictConquistas


def main(argv):
    dc = dictConquistas

    input_stream = FileStream(argv[1])
    lexer = minecraftCommandsLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = minecraftCommandsParser(stream)
    tree = parser()

    print(dc.conquista2mc("The Healing Power of Friendship!"))


if __name__ == "__main__":
    main(sys.argv)
