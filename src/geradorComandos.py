from antlr.minecraftCommandsVisitor import minecraftCommandsVisitor
from antlr.minecraftCommandsParser import minecraftCommandsParser as Parser
from .dicts.conquistas import Conquistas
from .dicts.mobs import Mobs


class GeradorComandos(minecraftCommandsVisitor):
    comandos = []
    variaveis = {}

    def formatarString(self, ctx: Parser.STRING):
        return ctx.getText().replace('"', "")

    def formatarCoordenada(self, ctx: Parser.CoordenadasContext):
        coordenada = ""

        for termo in ctx.coordenada_termo():
            coordenada += termo.getText() + " "

        return coordenada

    def visitPrograma(self, ctx: Parser.ProgramaContext):
        for comando in ctx.cmd():
            self.visitCmd(comando)

        if len(self.comandos) == 0:
            print("Nenhum comando gerado.")
        elif len(self.comandos) == 1:
            print(
                f"Copie o comando abaixo e cole no chat do seu minecraft:\n{self.comandos[0]}"
            )
        else:
            print(
                f"Copie os comandos abaixo e cole um de cada vez no chat do seu minecraft:"
            )

            for comando in self.comandos:
                print(comando)

    def visitCmd_atribuicao(self, ctx: Parser.Cmd_atribuicaoContext):
        nomeVar = ctx.IDENT().getText()
        variavel = ""

        if ctx.coordenadas() != None:
            variavel = self.formatarCoordenada(ctx.coordenadas())
        elif ctx.STRING() != None:
            variavel = self.formatarString(ctx.STRING())
        elif ctx.modificadores_item() != None:
            pass
        elif ctx.modificadores_mob() != None:
            pass
        elif ctx.COR_HEX() != None:
            variavel = ctx.COR_HEX().getText()

        self.variaveis[nomeVar] = variavel

    def visitCmd_teleporte(self, ctx: Parser.Cmd_teleporteContext):
        self.comandos.append("/tp")
        idxComandoAtual = len(self.comandos) - 1

        if ctx.origem_tp() != None:
            self.visitOrigem_tp(ctx.origem_tp())
        else:
            self.comandos[idxComandoAtual] += " @s"

        self.visitDestino_tp(ctx.destino_tp())

    def visitCmd_conquista(self, ctx: Parser.Cmd_conquistaContext):
        self.comandos.append("/advancement")
        idxComandoAtual = len(self.comandos) - 1

        if ctx.NEGACAO() != None:
            self.comandos[idxComandoAtual] += " revoke"
        else:
            self.comandos[idxComandoAtual] += " grant"

        if ctx.player() != None:
            self.visitPlayer(ctx.player())
        else:
            self.comandos[idxComandoAtual] += " @s"

        self.comandos[idxComandoAtual] += " only"

        self.visitConquista_var(ctx.conquista_var())

    def visitCmd_criar_mob(self, ctx: Parser.Cmd_criar_mobContext):
        self.comandos.append("/summon")
        idxComandoAtual = len(self.comandos) - 1

        self.visitMob(ctx.mob())

        if ctx.coordenada_var() != None:
            self.visitCoordenada_var(ctx.coordenada_var())
        else:
            self.comandos[idxComandoAtual] += " ~ ~ ~"

        if len(ctx.mod()) != 0:
            self.comandos[idxComandoAtual] += "{ "

            for modCtx in ctx.mod():
                self.visitMod(modCtx)

            self.comandos[idxComandoAtual] += "} "

    def visitOrigem_tp(self, ctx: Parser.Origem_tpContext):
        idxComandoAtual = len(self.comandos) - 1

        if ctx.STRING() != None:
            self.comandos[idxComandoAtual] += " " + self.formatarString(ctx.STRING())
        else:
            self.comandos[idxComandoAtual] += (
                " " + self.variaveis[ctx.IDENT().getText()]
            )

    def visitDestino_tp(self, ctx: Parser.Destino_tpContext):
        idxComandoAtual = len(self.comandos) - 1

        if ctx.STRING() != None:
            self.comandos[idxComandoAtual] += " " + self.formatarString(ctx.STRING())
        elif ctx.IDENT() != None:
            self.comandos[idxComandoAtual] += (
                " " + self.variaveis[ctx.IDENT().getText()]
            )
        else:
            self.comandos[idxComandoAtual] += " " + self.formatarCoordenada(
                ctx.coordenadas()
            )

    def visitPlayer(self, ctx: Parser.PlayerContext):
        idxComandoAtual = len(self.comandos) - 1

        if ctx.STRING() != None:
            self.comandos[idxComandoAtual] += " " + self.formatarString(ctx.STRING())
        elif ctx.IDENT() != None:
            self.comandos[idxComandoAtual] += (
                " " + self.variaveis[ctx.IDENT().getText()]
            )

    def visitConquista_var(self, ctx: Parser.Conquista_varContext):
        idxComandoAtual = len(self.comandos) - 1
        nomeConquista = ""

        if ctx.IDENT() != None:
            nomeConquista = self.variaveis[ctx.IDENT().getText()]
        else:
            nomeConquista = self.formatarString(ctx.STRING())

        # Remove o "only" se a conquista for "everything".
        if nomeConquista.lower() == "everything":
            self.comandos[idxComandoAtual] = self.comandos[idxComandoAtual][:-5]

        self.comandos[idxComandoAtual] += " " + Conquistas[nomeConquista.lower()]

    def visitMob(self, ctx: Parser.MobContext):
        idxComandoAtual = len(self.comandos) - 1
        nomeMob = ""

        if ctx.IDENT() != None:
            nomeMob = self.variaveis[ctx.IDENT().getText()]
        else:
            nomeMob = self.formatarString(ctx.STRING())

        self.comandos[idxComandoAtual] += " " + Mobs[nomeMob.lower()]

    def visitCoordenada_var(self, ctx: Parser.Coordenada_varContext):
        idxComandoAtual = len(self.comandos) - 1

        if ctx.IDENT() != None:
            self.comandos[idxComandoAtual] += (
                " " + self.variaveis[ctx.IDENT().getText()]
            )
        else:
            self.comandos[idxComandoAtual] += " " + self.formatarCoordenada(
                ctx.coordenadas()
            )

    def visitMod(self, ctx: Parser.ModContext):
        if ctx.modificadores_item() != None:
            self.visitModificadores_item(ctx.modificadores_item())

        elif ctx.modificadores_mob() != None:
            self.visitModificadores_mob(ctx.modificadores_mob())

        else:
            idxComandoAtual = len(self.comandos) - 1
            self.comandos[idxComandoAtual] += (
                " " + self.variaveis[ctx.IDENT().getText()]
            )
