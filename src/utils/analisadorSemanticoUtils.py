from antlr4.Token import Token
from antlr.minecraftCommandsParser import minecraftCommandsParser as parser
from .tabeladesimbolos import TipoSimbolo as Tipo
from .tabeladesimbolos import TabelaDeSimbolos as Tabela


class AnalisadorSemanticoUtils:
    errosSemanticos = []

    def adicionarErroSemantico(token: Token, msg: str):
        linha = token.line
        coluna = token.column
        AnalisadorSemanticoUtils.errosSemanticos.append(
            f"Linha {linha}-{coluna}: {msg}"
        )

    def verificaModCerto(ctx: parser.ModContext, tipoMod: Tipo):
        paiCtx = ctx.parentCtx

        if isinstance(paiCtx, parser.Cmd_dar_itemContext) and tipoMod == Tipo.MOD_MOB:
            return False
        elif (
            isinstance(paiCtx, parser.Cmd_criar_mobContext) and tipoMod == Tipo.MOD_ITEM
        ):
            return False

        return True

    def verificaVariavelExiste(nomeVar: str, tabela: Tabela, ctx):
        if not tabela.existe(nomeVar):
            AnalisadorSemanticoUtils.adicionarErroSemantico(
                ctx.start, "variável não declarada"
            )
            return False

        return True
