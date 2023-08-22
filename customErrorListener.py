from antlr4.error.ErrorListener import ErrorListener


class CustomErrorListener(ErrorListener):
    erroSintatico = False

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        if not self.erroSintatico:
            token = offendingSymbol
            tokenText = token.text

            print(f"Linha {line}: Erro sintático próximo a {tokenText}")
