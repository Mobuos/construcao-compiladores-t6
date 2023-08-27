from antlr.minecraftCommandsVisitor import minecraftCommandsVisitor
from .utils.analisadorSemanticoUtils import AnalisadorSemanticoUtils as SemanticoUtils
from antlr.minecraftCommandsParser import minecraftCommandsParser as parser
from .utils.tabeladesimbolos import TabelaDeSimbolos as Tabela
from .utils.tabeladesimbolos import TipoSimbolo as Tipo
from .dicts.itens import Itens as Itens
from .dicts.encantamentos import Encantamentos
from .dicts.conquistas import Conquistas


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
                self.tabela.adicionar(
                    nomeVar, Tipo.COORDENADA, ctx.coordenadas().getText()
                )

            if ctx.STRING() != None:
                self.tabela.adicionar(nomeVar, Tipo.STRING, ctx.STRING().getText())

            if ctx.modificadores_item() != None:
                self.tabela.adicionar(
                    nomeVar, Tipo.MOD_ITEM, ctx.modificadores_item().getText()
                )

            if ctx.modificadores_mob() != None:
                self.tabela.adicionar(
                    nomeVar, Tipo.MOD_MOB, ctx.modificadores_mob().getText()
                )

            if ctx.COR_HEX() != None:
                self.tabela.adicionar(nomeVar, Tipo.COR, ctx.COR_HEX().getText())

        super().visitCmd_atribuicao(ctx)

    def visitItem(self, ctx: parser.ItemContext):
        nomeItem = ctx.getText().replace('"', "")
        erroItem = False

        if ctx.IDENT() != None:
            erroItem = not SemanticoUtils.verificaVariavelExiste(
                nomeItem, self.tabela, ctx
            )
            if not erroItem:
                tipoVar = self.tabela.recuperarTipo(nomeItem)

                if tipoVar != Tipo.STRING:
                    SemanticoUtils.adicionarErroSemantico(
                        ctx.start, "incompatibilidade de tipo de variável"
                    )
                    erroItem = True

                else:
                    nomeItem = self.tabela.recuperarValor(nomeItem).replace('"', "")

        if not erroItem:
            if not (nomeItem.lower() in Itens.keys()):
                SemanticoUtils.adicionarErroSemantico(
                    ctx.start, f"{nomeItem} item não encontrado"
                )

        super().visitItem(ctx)

    def visitMod(self, ctx: parser.ModContext):
        tipoMod = Tipo.MOD_ITEM
        msgErro = "incompatibilidade de modificadores"

        if ctx.modificadores_mob() != None:
            tipoMod = Tipo.MOD_MOB

        if ctx.IDENT() != None:
            nomeVarMod = ctx.IDENT().getText()

            if SemanticoUtils.verificaVariavelExiste(nomeVarMod, self.tabela, ctx):
                tipoMod = self.tabela.recuperarTipo(nomeVarMod)
                msg = "incompatibilidade de tipo de variável"

        if not SemanticoUtils.verificaModCerto(ctx, tipoMod):
            SemanticoUtils.adicionarErroSemantico(
                ctx.start, "incompatibilidade de modificadores"
            )

        super().visitMod(ctx)

    def visitCoordenada_var(self, ctx: parser.Coordenada_varContext):
        if ctx.IDENT() != None:
            nomeVar = ctx.IDENT().getText()

            if SemanticoUtils.verificaVariavelExiste(nomeVar, self.tabela, ctx):
                tipoVar = self.tabela.recuperarTipo(nomeVar)

                if tipoVar != Tipo.COORDENADA:
                    SemanticoUtils.adicionarErroSemantico(
                        ctx.start, "incompatibilidade de tipo de variável"
                    )

        super().visitCoordenada_var(ctx)

    def visitPlayer(self, ctx: parser.PlayerContext):
        if ctx.IDENT() != None:
            nomeVar = ctx.IDENT().getText()

            if SemanticoUtils.verificaVariavelExiste(nomeVar, self.tabela, ctx):
                tipoVar = self.tabela.recuperarTipo(nomeVar)

                if tipoVar != Tipo.STRING:
                    SemanticoUtils.adicionarErroSemantico(
                        ctx.start, "incompatibilidade de tipo de variável"
                    )

        super().visitPlayer(ctx)

    def visitOrigem_tp(self, ctx: parser.Origem_tpContext):
        if ctx.IDENT() != None:
            nomeVar = ctx.IDENT().getText()

            if SemanticoUtils.verificaVariavelExiste(nomeVar, self.tabela, ctx):
                tipoVar = self.tabela.recuperarTipo(nomeVar)

                if tipoVar != Tipo.STRING:
                    SemanticoUtils.adicionarErroSemantico(
                        ctx.start, "incompatibilidade de tipo de variável"
                    )

        super().visitOrigem_tp(ctx)

    def visitDestino_tp(self, ctx: parser.Destino_tpContext):
        if ctx.IDENT() != None:
            nomeVar = ctx.IDENT().getText()

            if SemanticoUtils.verificaVariavelExiste(nomeVar, self.tabela, ctx):
                tipoVar = self.tabela.recuperarTipo(nomeVar)

                if tipoVar != Tipo.STRING and tipoVar != Tipo.COORDENADA:
                    SemanticoUtils.adicionarErroSemantico(
                        ctx.start, "incompatibilidade de tipo de variável"
                    )

        super().visitDestino_tp(ctx)

    def visitEncantamento_var(self, ctx: parser.Encantamento_varContext):
        nomeEnc = ctx.getText().replace('"', "")
        erroEnc = False

        if ctx.IDENT() != None:
            erroEnc = not SemanticoUtils.verificaVariavelExiste(
                nomeEnc, self.tabela, ctx
            )

            if not erroEnc:
                tipoVar = self.tabela.recuperarTipo(nomeEnc)

                if tipoVar != Tipo.STRING:
                    SemanticoUtils.adicionarErroSemantico(
                        ctx.start, "incompatibilidade de tipo de variável"
                    )
                    erroEnc = True

                else:
                    nomeEnc = self.tabela.recuperarValor(nomeEnc).replace('"', "")

        if not erroEnc:
            if not (nomeEnc.lower() in Encantamentos.keys()):
                SemanticoUtils.adicionarErroSemantico(
                    ctx.start, f"{nomeEnc} encantamento não encontrado"
                )

        super().visitEncantamento_var(ctx)

    def visitMob(self, ctx: parser.MobContext):
        if ctx.IDENT() != None:
            nomeVar = ctx.IDENT().getText()

            if SemanticoUtils.verificaVariavelExiste(nomeVar, self.tabela, ctx):
                tipoVar = self.tabela.recuperarTipo(nomeVar)

                if tipoVar != Tipo.STRING:
                    SemanticoUtils.adicionarErroSemantico(
                        ctx.start, "incompatibilidade de tipo de variável"
                    )

        super().visitMob(ctx)

    def visitConquista_var(self, ctx: parser.Conquista_varContext):
        nomeConquista = ctx.getText().replace('"', "")
        erroConq = False

        if ctx.IDENT() != None:
            erroConq = not SemanticoUtils.verificaVariavelExiste(
                nomeConquista, self.tabela, ctx
            )

            if not erroConq:
                tipoVar = self.tabela.recuperarTipo(nomeConquista)

                if tipoVar != Tipo.STRING:
                    SemanticoUtils.adicionarErroSemantico(
                        ctx.start, "incompatibilidade de tipo de variável"
                    )
                    erroConq = True

                else:
                    nomeConquista = self.tabela.recuperarValor(nomeConquista).replace(
                        '"', ""
                    )

        if not erroConq:
            if not (nomeConquista.lower() in Conquistas.keys()):
                SemanticoUtils.adicionarErroSemantico(
                    ctx.start, f"{nomeConquista} conquista não encontrada"
                )

        super().visitConquista_var(ctx)

    def visitCor(self, ctx: parser.CorContext):
        if ctx.IDENT() != None:
            nomeVar = ctx.IDENT().getText()

            if SemanticoUtils.verificaVariavelExiste(nomeVar, self.tabela, ctx):
                tipoVar = self.tabela.recuperarTipo(nomeVar)

                if tipoVar != Tipo.COR:
                    SemanticoUtils.adicionarErroSemantico(
                        ctx.start, "incompatibilidade de tipo de variável"
                    )

        super().visitCor(ctx)

    def visitTexto(self, ctx: parser.TextoContext):
        if ctx.IDENT() != None:
            nomeVar = ctx.IDENT().getText()

            if SemanticoUtils.verificaVariavelExiste(nomeVar, self.tabela, ctx):
                tipoVar = self.tabela.recuperarTipo(nomeVar)

                if tipoVar != Tipo.STRING:
                    SemanticoUtils.adicionarErroSemantico(
                        ctx.start, "incompatibilidade de tipo de variável"
                    )

        super().visitTexto(ctx)
