import sys
from antlr4 import *
from antlr.minecraftCommandsLexer import minecraftCommandsLexer
from antlr.minecraftCommandsParser import minecraftCommandsParser
from antlr.minecraftCommandsListener import minecraftCommandsListener
from antlr.minecraftCommandsVisitor import minecraftCommandsVisitor
from dicts.conquistas import conquistas
from dicts.mobs import mobs
from customErrorListener import CustomErrorListener


def main(argv):
    input_stream = FileStream(argv[1])

    # Saída p/ arquivo
    if len(argv) > 2:
        fout = open(argv[2], "w")
        sys.stdout = fout

    lexer = minecraftCommandsLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = minecraftCommandsParser(stream)

    # Análise Lexica:
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

    # Análise Sintática:
    # if (!erroLexico) {
    #         cs = CharStreams.fromFileName(args[0]);
    #         lexer = new LALexer(cs);

    #         CommonTokenStream tokens = new CommonTokenStream(lexer);
    #         LAParser parser = new LAParser(tokens);

    #         // Adicionando nosso ErrorListener customizado
    #         parser.removeErrorListeners();
    #         MyCustomErrorListener mcel = new MyCustomErrorListener(writer);
    #         parser.addErrorListener(mcel);

    #         parser.programa();
    #     }
    if not erroLexico:
        input_stream = FileStream(argv[1])
        lexer = minecraftCommandsLexer(input_stream)
        tokens = CommonTokenStream(lexer)
        parser = minecraftCommandsParser(tokens)

        parser.removeErrorListeners()
        parser.addErrorListener(CustomErrorListener())
        parser.programa()


if __name__ == "__main__":
    main(sys.argv)
