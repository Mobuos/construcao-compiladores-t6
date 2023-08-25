from enum import Enum


class TipoSimbolo(Enum):
    STRING = 0
    COORDENADA = 1
    MOD_ITEM = 2
    MOD_MONSTRO = 3
    COR = 4


class TabelaDeSimbolos:
    tabela = {}

    def adicionar(self, nome: str, tipo: TipoSimbolo):
        self.tabela[nome] = tipo

    def existe(self, nome: str) -> bool:
        return nome in self.tabela.keys()
