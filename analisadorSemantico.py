from antlr.minecraftCommandsVisitor import minecraftCommandsVisitor
from analisadorSemanticoUtils import AnalisadorSemanticoUtils


class AnalisadorSemantico(minecraftCommandsVisitor):
    def __init__(self, semanticoUtils: AnalisadorSemanticoUtils):
        self.analisadorSemanticoUtils = semanticoUtils
