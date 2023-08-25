from antlr.minecraftCommandsVisitor import minecraftCommandsVisitor
from analisadorSemanticoUtils import AnalisadorSemanticoUtils as SemanticoUtils
from antlr.minecraftCommandsParser import minecraftCommandsParser as parser
from tabeladesimbolos import TabelaDeSimbolos as Tabela
from tabeladesimbolos import TipoSimbolo as Tipo


class AnalisadorSemantico(minecraftCommandsVisitor):
    tabela = Tabela()

    def visitCmd_atribuicao(self, ctx: parser.Cmd_atribuicaoContext):
        nomeVar = ctx.IDENT().getText()

        if self.tabela.existe(nomeVar):
            SemanticoUtils.adicionarErroSemantico(
                token=ctx.start, msg="variável já declarada"
            )
        else:
            if ctx.coordenadas() != None:
                self.tabela.adicionar(nomeVar, Tipo.COORDENADA)
            if ctx.STRING() != None:
                self.tabela.adicionar(nomeVar, Tipo.STRING)
            if ctx.modificadores_item() != None:
                self.tabela.adicionar(nomeVar, Tipo.MOD_ITEM)
            if ctx.modificadores_monstro() != None:
                self.tabela.adicionar(nomeVar, Tipo.MOD_MONSTRO)
            if ctx.COR_HEX() != None:
                self.tabela.adicionar(nomeVar, Tipo.COR)

        super().visitCmd_atribuicao(ctx)
