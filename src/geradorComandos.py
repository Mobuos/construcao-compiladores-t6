from antlr.minecraftCommandsVisitor import minecraftCommandsVisitor
from antlr.minecraftCommandsParser import minecraftCommandsParser as Parser
from .dicts.conquistas import Conquistas
from .dicts.mobs import Mobs
from .dicts.itens import Itens
from .dicts.encantamentos import Encantamentos


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

    def formatarNomeMob(self, ctx: Parser.Mod_nome_mobContext):
        mod = 'CustomName:\'{"text":"'

        if ctx.texto().IDENT() != None:
            nome = self.variaveis[ctx.texto().IDENT().getText()]
        else:
            nome = self.formatarString(ctx.texto().STRING())

        mod += nome + '"'

        if ctx.cor() != None:
            if ctx.cor().IDENT():
                cor = self.variaveis[ctx.cor().IDENT().getText()]
            else:
                cor = ctx.cor().COR_HEX().getText()

            mod += ',"color":"' + cor + '"'

        mod += "}'"

        return mod

    def formatarVidaMob(self, ctx: Parser.Mod_vidaContext):
        if ctx.NUM_INT() != None:
            vida = ctx.NUM_INT().getText()
        else:
            vida = ctx.NUM_REAL().getText()

        return f'Attributes:[{{Name:"generic.max_health",Base:{vida}f}}],Health:{vida}f'

    def formatarExibicaoItemMod(self, ctx: Parser.Mod_exibicaoContext):
        mod = "display:{"
        temNome = False

        if ctx.nome_mod_item() != None:
            mod += "Name:'["
            temNome = True

            for idx, name in enumerate(ctx.nome_mod_item().exibicao_var()):
                mod += '{"text":"'

                if name.texto().IDENT() != None:
                    nome = self.variaveis[name.texto().IDENT().getText()]
                else:
                    nome = self.formatarString(name.texto().STRING())

                mod += nome + '"'

                if name.cor() != None:
                    if name.cor().IDENT():
                        cor = self.variaveis[name.cor().IDENT().getText()]
                    else:
                        cor = name.cor().COR_HEX().getText()

                    mod += ',"color":"' + cor + '"'

                mod += "}"

                if idx < len(ctx.nome_mod_item().exibicao_var()) - 1:
                    mod += ","
                else:
                    mod += "]'"

        if ctx.lore_mod_item() != None:
            if temNome:
                mod += ",Lore:["
            else:
                mod += "Lore:["

            for idx, lore in enumerate(ctx.lore_mod_item().exibicao_var()):
                mod += '\'{"text":"'

                if lore.texto().IDENT() != None:
                    nome = self.variaveis[lore.texto().IDENT().getText()]
                else:
                    nome = self.formatarString(lore.texto().STRING())

                mod += nome + '"'

                if lore.cor() != None:
                    if lore.cor().IDENT():
                        cor = self.variaveis[lore.cor().IDENT().getText()]
                    else:
                        cor = lore.cor().COR_HEX().getText()

                    mod += ',"color":"' + cor + '"'

                mod += "}'"

                if idx < len(ctx.lore_mod_item().exibicao_var()) - 1:
                    mod += ","

                else:
                    mod += "]"

        mod += "}"

        return mod

    def formatarEncantamentoMod(self, ctx: Parser.Mod_encantamentoContext):
        mod = "Enchantments:["

        for idx, encantamento in enumerate(ctx.encantamento_var()):
            mod += '{id:"'

            if encantamento.IDENT() != None:
                mod += Encantamentos[
                    self.variaveis.encantamento.IDENT().getText().lower()
                ]
            else:
                mod += Encantamentos[self.formatarString(encantamento.STRING()).lower()]

            mod += '",lvl:' + ctx.NUM_INT()[idx].getText() + "}"

            if idx < len(ctx.encantamento_var()) - 1:
                mod += ","

        mod += "]"

        return mod

    def formatarMod_Mob(self, ctx: Parser.Modificador_mobContext):
        if ctx.mod_nome_mob() != None:
            return self.formatarNomeMob(ctx.mod_nome_mob())
        elif ctx.mod_semIA() != None:
            return "NoAI:1"
        elif ctx.mod_invulneravel() != None:
            return "Invulnerable:1"
        else:
            return self.formatarVidaMob(ctx.mod_vida())

    def formatarMod_Item(self, ctx: Parser.Modificador_itemContext):
        if ctx.mod_encantamento() != None:
            return self.formatarEncantamentoMod(ctx.mod_encantamento())
        elif ctx.mod_exibicao() != None:
            return self.formatarExibicaoItemMod(ctx.mod_exibicao())
        else:
            return "Unbreakable:1"

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
        elif ctx.modificador_item() != None:
            variavel = self.formatarMod_Item(ctx.modificador_item())
        elif ctx.modificador_mob() != None:
            variavel = self.formatarMod_Mob(ctx.modificador_mob())
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
            self.comandos[idxComandoAtual] += " ~ ~ ~ "

        if len(ctx.mod()) != 0:
            self.comandos[idxComandoAtual] += "{"

            for idx, modCtx in enumerate(ctx.mod()):
                self.visitMod(modCtx)

                if idx < len(ctx.mod()) - 1:
                    self.comandos[idxComandoAtual] += ","

            self.comandos[idxComandoAtual] += "} "

    def visitCmd_dar_item(self, ctx: Parser.Cmd_dar_itemContext):
        self.comandos.append("/give")
        idxComandoAtual = len(self.comandos) - 1

        if ctx.player() != None:
            self.visitPlayer(ctx.player())
        else:
            self.comandos[idxComandoAtual] += " @s"

        self.visitItem(ctx.item())

        if len(ctx.mod()) != 0:
            self.comandos[idxComandoAtual] += "{"

            for idx, modCtx in enumerate(ctx.mod()):
                self.visitMod(modCtx)

                if idx < len(ctx.mod()) - 1:
                    self.comandos[idxComandoAtual] += ","

            self.comandos[idxComandoAtual] += "} "

        if ctx.NUM_INT() != None:
            self.comandos[idxComandoAtual] += " " + ctx.NUM_INT().getText()

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
        idxComandoAtual = len(self.comandos) - 1
        variavel = ""

        if ctx.modificador_item() != None:
            variavel = self.formatarMod_Item(ctx.modificador_item())

        elif ctx.modificador_mob() != None:
            variavel = self.formatarMod_Mob(ctx.modificador_mob())

        else:
            variavel = self.variaveis[ctx.IDENT().getText()]

        self.comandos[idxComandoAtual] += variavel

    def visitItem(self, ctx: Parser.ItemContext):
        idxComandoAtual = len(self.comandos) - 1

        if ctx.STRING() != None:
            variavel = self.formatarString(ctx.STRING())

        else:
            variavel = self.variaveis[ctx.IDENT().getText()]

        self.comandos[idxComandoAtual] += " " + Itens[variavel.lower()]
