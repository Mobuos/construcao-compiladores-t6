import unittest
import subprocess


class TestMC(unittest.TestCase):
    def test_1_comando_teleporte(self):
        file = "1.comando_teleporte.in"
        saida_esperada = open("testes/esperado/1.comando_teleporte.out")

        esperado = saida_esperada.read()
        recebido = subprocess.run(f"bash run.sh testes/{file}")

        self.assertEqual(esperado, recebido)


if __name__ == "__main__":
    unittest.main()
