import unittest
import subprocess


class TestMC(unittest.TestCase):
    def test_1_comando_teleporte(self):
        file = "1.comando_teleporte.in"
        recebido = subprocess.run("")
        self.assertEqual(esperado, recebido)


if __name__ == "__main__":
    unittest.main()
