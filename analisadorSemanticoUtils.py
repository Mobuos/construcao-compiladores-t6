from antlr4.Token import Token


class AnalisadorSemanticoUtils:
    errosSemanticos = []

    def adicionarErroSemantico(token: Token, msg: str):
        linha = token.line
        AnalisadorSemanticoUtils.errosSemanticos.append(f"Linha {linha}: {msg}")
