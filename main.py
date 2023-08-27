import sys
from antlr4 import *
from antlr.minecraftCommandsLexer import minecraftCommandsLexer
from antlr.minecraftCommandsParser import minecraftCommandsParser
from antlr.minecraftCommandsListener import minecraftCommandsListener
from antlr.minecraftCommandsVisitor import minecraftCommandsVisitor
from src.utils.customErrorListener import CustomErrorListener
from src.analisadorSemantico import AnalisadorSemantico
from src.utils.analisadorSemanticoUtils import AnalisadorSemanticoUtils
from src.geradorComandos import GeradorComandos


def main(argv):
    input_stream = FileStream(argv[1])

    # Saída p/ arquivo
    if len(argv) > 2:
        fout = open(argv[2], "w")
        sys.stdout = fout

    lexer = minecraftCommandsLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = minecraftCommandsParser(stream)

    # *Análise Lexica*:
    erroLexico = False
    token = lexer.nextToken()

    while token.type != Token.EOF:
        nomeToken = lexer.ruleNames[token.type - 1]

        if nomeToken == "ERRO":
            erroLexico = True
            print(f'Linha {token.line}: "{token.text}" - simbolo não identificado')
        elif nomeToken == "CADEIA_N_FECHADA":
            erroLexico = True
            print(f"Linha {token.line} {token.column} - cadeia não fechada")

        token = lexer.nextToken()

    # *Análise Sintática*:
    if not erroLexico:
        input_stream = FileStream(argv[1])
        lexer = minecraftCommandsLexer(input_stream)
        tokens = CommonTokenStream(lexer)
        parser = minecraftCommandsParser(tokens)
        customErrorListener = CustomErrorListener()

        parser.removeErrorListeners()
        parser.addErrorListener(customErrorListener)
        parser.programa()

        if not customErrorListener.erroSintatico:
            # *Análise Semântica*:
            input_stream = FileStream(argv[1])
            lexer = minecraftCommandsLexer(input_stream)
            tokens = CommonTokenStream(lexer)
            parser = minecraftCommandsParser(tokens)

            parser.removeErrorListeners()

            arvore = parser.programa()
            semanticoUtils = AnalisadorSemanticoUtils()
            analisadorSemantico = AnalisadorSemantico()
            analisadorSemantico.visitPrograma(arvore)

            for erroSemantico in semanticoUtils.errosSemanticos:
                print(erroSemantico)

            # *Geração da saída*
            if len(semanticoUtils.errosSemanticos) == 0:
                geradorComando = GeradorComandos()
                geradorComando.visitPrograma(arvore)


if __name__ == "__main__":
    main(sys.argv)
