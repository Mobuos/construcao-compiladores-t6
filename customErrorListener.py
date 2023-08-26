from antlr4.error.ErrorListener import ErrorListener


class CustomErrorListener(ErrorListener):
    erroSintatico = False

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        if not self.erroSintatico:
            tokenText = offendingSymbol.text
            self.erroSintatico = True

            print(f"Linha {line} coluna {column}: Erro sintático próximo a {tokenText}")
