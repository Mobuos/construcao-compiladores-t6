from enum import Enum


class TipoSimbolo(Enum):
    STRING = 0
    COORDENADA = 1
    MOD_ITEM = 2
    MOD_MOB = 3
    COR = 4


class TabelaDeSimbolos:
    tabela = {}

    def adicionar(self, nome: str, tipo: TipoSimbolo, valor):
        self.tabela[nome] = {"tipo": tipo, "valor": valor}

    def existe(self, nome: str) -> bool:
        return nome in self.tabela.keys()

    def recuperarTipo(self, nome: str):
        return self.tabela[nome]["tipo"]

    def recuperarValor(self, nome):
        return self.tabela[nome]["valor"]
