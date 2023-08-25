# Generated from antlr/minecraftCommands.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .minecraftCommandsParser import minecraftCommandsParser
else:
    from minecraftCommandsParser import minecraftCommandsParser

# This class defines a complete listener for a parse tree produced by minecraftCommandsParser.
class minecraftCommandsListener(ParseTreeListener):

    # Enter a parse tree produced by minecraftCommandsParser#programa.
    def enterPrograma(self, ctx:minecraftCommandsParser.ProgramaContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#programa.
    def exitPrograma(self, ctx:minecraftCommandsParser.ProgramaContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#coordenadas.
    def enterCoordenadas(self, ctx:minecraftCommandsParser.CoordenadasContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#coordenadas.
    def exitCoordenadas(self, ctx:minecraftCommandsParser.CoordenadasContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#coordenada_termo.
    def enterCoordenada_termo(self, ctx:minecraftCommandsParser.Coordenada_termoContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#coordenada_termo.
    def exitCoordenada_termo(self, ctx:minecraftCommandsParser.Coordenada_termoContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#origem_tp.
    def enterOrigem_tp(self, ctx:minecraftCommandsParser.Origem_tpContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#origem_tp.
    def exitOrigem_tp(self, ctx:minecraftCommandsParser.Origem_tpContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#destino_tp.
    def enterDestino_tp(self, ctx:minecraftCommandsParser.Destino_tpContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#destino_tp.
    def exitDestino_tp(self, ctx:minecraftCommandsParser.Destino_tpContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#cmd.
    def enterCmd(self, ctx:minecraftCommandsParser.CmdContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#cmd.
    def exitCmd(self, ctx:minecraftCommandsParser.CmdContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#cmd_dar_item.
    def enterCmd_dar_item(self, ctx:minecraftCommandsParser.Cmd_dar_itemContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#cmd_dar_item.
    def exitCmd_dar_item(self, ctx:minecraftCommandsParser.Cmd_dar_itemContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#cmd_teleporte.
    def enterCmd_teleporte(self, ctx:minecraftCommandsParser.Cmd_teleporteContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#cmd_teleporte.
    def exitCmd_teleporte(self, ctx:minecraftCommandsParser.Cmd_teleporteContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#cmd_encantar.
    def enterCmd_encantar(self, ctx:minecraftCommandsParser.Cmd_encantarContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#cmd_encantar.
    def exitCmd_encantar(self, ctx:minecraftCommandsParser.Cmd_encantarContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#cmd_criar_monstro.
    def enterCmd_criar_monstro(self, ctx:minecraftCommandsParser.Cmd_criar_monstroContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#cmd_criar_monstro.
    def exitCmd_criar_monstro(self, ctx:minecraftCommandsParser.Cmd_criar_monstroContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#cmd_conquista.
    def enterCmd_conquista(self, ctx:minecraftCommandsParser.Cmd_conquistaContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#cmd_conquista.
    def exitCmd_conquista(self, ctx:minecraftCommandsParser.Cmd_conquistaContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#cmd_atribuicao.
    def enterCmd_atribuicao(self, ctx:minecraftCommandsParser.Cmd_atribuicaoContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#cmd_atribuicao.
    def exitCmd_atribuicao(self, ctx:minecraftCommandsParser.Cmd_atribuicaoContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#mod_encantamento.
    def enterMod_encantamento(self, ctx:minecraftCommandsParser.Mod_encantamentoContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#mod_encantamento.
    def exitMod_encantamento(self, ctx:minecraftCommandsParser.Mod_encantamentoContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#mod_exibicao.
    def enterMod_exibicao(self, ctx:minecraftCommandsParser.Mod_exibicaoContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#mod_exibicao.
    def exitMod_exibicao(self, ctx:minecraftCommandsParser.Mod_exibicaoContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#mod_inquebravel.
    def enterMod_inquebravel(self, ctx:minecraftCommandsParser.Mod_inquebravelContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#mod_inquebravel.
    def exitMod_inquebravel(self, ctx:minecraftCommandsParser.Mod_inquebravelContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#mod_nome.
    def enterMod_nome(self, ctx:minecraftCommandsParser.Mod_nomeContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#mod_nome.
    def exitMod_nome(self, ctx:minecraftCommandsParser.Mod_nomeContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#mod_semIA.
    def enterMod_semIA(self, ctx:minecraftCommandsParser.Mod_semIAContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#mod_semIA.
    def exitMod_semIA(self, ctx:minecraftCommandsParser.Mod_semIAContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#mod_invulneravel.
    def enterMod_invulneravel(self, ctx:minecraftCommandsParser.Mod_invulneravelContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#mod_invulneravel.
    def exitMod_invulneravel(self, ctx:minecraftCommandsParser.Mod_invulneravelContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#mod_vida.
    def enterMod_vida(self, ctx:minecraftCommandsParser.Mod_vidaContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#mod_vida.
    def exitMod_vida(self, ctx:minecraftCommandsParser.Mod_vidaContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#modificadores_monstro.
    def enterModificadores_monstro(self, ctx:minecraftCommandsParser.Modificadores_monstroContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#modificadores_monstro.
    def exitModificadores_monstro(self, ctx:minecraftCommandsParser.Modificadores_monstroContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#modificador_monstro.
    def enterModificador_monstro(self, ctx:minecraftCommandsParser.Modificador_monstroContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#modificador_monstro.
    def exitModificador_monstro(self, ctx:minecraftCommandsParser.Modificador_monstroContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#modificadores_item.
    def enterModificadores_item(self, ctx:minecraftCommandsParser.Modificadores_itemContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#modificadores_item.
    def exitModificadores_item(self, ctx:minecraftCommandsParser.Modificadores_itemContext):
        pass


    # Enter a parse tree produced by minecraftCommandsParser#modificador_item.
    def enterModificador_item(self, ctx:minecraftCommandsParser.Modificador_itemContext):
        pass

    # Exit a parse tree produced by minecraftCommandsParser#modificador_item.
    def exitModificador_item(self, ctx:minecraftCommandsParser.Modificador_itemContext):
        pass



del minecraftCommandsParser