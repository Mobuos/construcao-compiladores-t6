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


    # Visit a parse tree produced by minecraftCommandsParser#cmd_dar_item.
    def visitCmd_dar_item(self, ctx:minecraftCommandsParser.Cmd_dar_itemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#cmd_teleporte.
    def visitCmd_teleporte(self, ctx:minecraftCommandsParser.Cmd_teleporteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#cmd_encantar.
    def visitCmd_encantar(self, ctx:minecraftCommandsParser.Cmd_encantarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#cmd_criar_monstro.
    def visitCmd_criar_monstro(self, ctx:minecraftCommandsParser.Cmd_criar_monstroContext):
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


    # Visit a parse tree produced by minecraftCommandsParser#modificadores_monstro.
    def visitModificadores_monstro(self, ctx:minecraftCommandsParser.Modificadores_monstroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#modificador_monstro.
    def visitModificador_monstro(self, ctx:minecraftCommandsParser.Modificador_monstroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#modificadores_item.
    def visitModificadores_item(self, ctx:minecraftCommandsParser.Modificadores_itemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by minecraftCommandsParser#modificador_item.
    def visitModificador_item(self, ctx:minecraftCommandsParser.Modificador_itemContext):
        return self.visitChildren(ctx)



del minecraftCommandsParser