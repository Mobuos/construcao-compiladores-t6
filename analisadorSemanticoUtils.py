from antlr4.Token import Token


class AnalisadorSemanticoUtils:
    errosSemanticos = []

    def adicionarErroSemantico(self, token: Token, msg: str):
        linha = token.line
        self.errosSemanticos.append(f"Linha {linha}: {msg}")
