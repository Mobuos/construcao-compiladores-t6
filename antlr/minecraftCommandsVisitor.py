# Generated from antlr/minecraftCommands.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .minecraftCommandsParser import minecraftCommandsParser
else:
    from minecraftCommandsParser import minecraftCommandsParser

# This class defines a complete generic visitor for a parse tree produced by minecraftCommandsParser.

class minecraftCommandsVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by minecraftCommandsParser#coordenadas.
    def visitCoordenadas(self, ctx:minecraftCommandsParser.CoordenadasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#coordenada_termo.
    def visitCoordenada_termo(self, ctx:minecraftCommandsParser.Coordenada_termoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#coordenada_termo.
    def visitCoordenada_termo(self, ctx:minecraftCommandsParser.Coordenada_termoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#origem_tp.
    def visitOrigem_tp(self, ctx:minecraftCommandsParser.Origem_tpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#destino_tp.
    def visitDestino_tp(self, ctx:minecraftCommandsParser.Destino_tpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#player.
    def visitPlayer(self, ctx:minecraftCommandsParser.PlayerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#item.
    def visitItem(self, ctx:minecraftCommandsParser.ItemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#mod.
    def visitMod(self, ctx:minecraftCommandsParser.ModContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#encantamento_var.
    def visitEncantamento_var(self, ctx:minecraftCommandsParser.Encantamento_varContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#mob.
    def visitMob(self, ctx:minecraftCommandsParser.MobContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#coordenada_var.
    def visitCoordenada_var(self, ctx:minecraftCommandsParser.Coordenada_varContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#conquista_var.
    def visitConquista_var(self, ctx:minecraftCommandsParser.Conquista_varContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#texto.
    def visitTexto(self, ctx:minecraftCommandsParser.TextoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#cor.
    def visitCor(self, ctx:minecraftCommandsParser.CorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#programa.
    def visitPrograma(self, ctx:minecraftCommandsParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#cmd.
    def visitCmd(self, ctx:minecraftCommandsParser.CmdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#cmd_dar_item.
    def visitCmd_dar_item(self, ctx:minecraftCommandsParser.Cmd_dar_itemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#cmd_teleporte.
    def visitCmd_teleporte(self, ctx:minecraftCommandsParser.Cmd_teleporteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#cmd_encantar.
    def visitCmd_encantar(self, ctx:minecraftCommandsParser.Cmd_encantarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#cmd_criar_mob.
    def visitCmd_criar_mob(self, ctx:minecraftCommandsParser.Cmd_criar_mobContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#cmd_conquista.
    def visitCmd_conquista(self, ctx:minecraftCommandsParser.Cmd_conquistaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#cmd_atribuicao.
    def visitCmd_atribuicao(self, ctx:minecraftCommandsParser.Cmd_atribuicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#mod_encantamento.
    def visitMod_encantamento(self, ctx:minecraftCommandsParser.Mod_encantamentoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#mod_exibicao.
    def visitMod_exibicao(self, ctx:minecraftCommandsParser.Mod_exibicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#mod_inquebravel.
    def visitMod_inquebravel(self, ctx:minecraftCommandsParser.Mod_inquebravelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#mod_nome_mob.
    def visitMod_nome_mob(self, ctx:minecraftCommandsParser.Mod_nome_mobContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#mod_semIA.
    def visitMod_semIA(self, ctx:minecraftCommandsParser.Mod_semIAContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#mod_invulneravel.
    def visitMod_invulneravel(self, ctx:minecraftCommandsParser.Mod_invulneravelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#mod_vida.
    def visitMod_vida(self, ctx:minecraftCommandsParser.Mod_vidaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#modificadores_mob.
    def visitModificadores_mob(self, ctx:minecraftCommandsParser.Modificadores_mobContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#modificador_mob.
    def visitModificador_mob(self, ctx:minecraftCommandsParser.Modificador_mobContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#modificadores_item.
    def visitModificadores_item(self, ctx:minecraftCommandsParser.Modificadores_itemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#modificador_item.
    def visitModificador_item(self, ctx:minecraftCommandsParser.Modificador_itemContext):
        return self.visitChildren(ctx)



del minecraftCommandsParser