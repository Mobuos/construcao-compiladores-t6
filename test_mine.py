import subprocess
import os


# Roda run.sh e retorna stdout do programa
def run(file):
    return subprocess.check_output(["bash", "run.sh", "aux.in"]).decode("utf-8").strip()


def InEsp(input, esperado):
    # Cria arquivo aux.in
    faux = open("aux.in", "w")
    faux.write(input)
    faux.close()

    obtido = run("aux.in")

    resultado = esperado == obtido

    if not resultado:
        print(f"Esperado: {esperado}\nObtido: {obtido}")

    os.remove("aux.in")

    return resultado


##############
### TESTES ###
##############
def test_tp_var_one_target():
    input = """
    player = "dini"; 

    teleporte: player;
    """.strip()
    esperado = "/tp @s dini"
    assert InEsp(input, esperado)


# Votor roda com tipow pytest testador.py -k 'test_tp_var' é é


def test_tp_one_target():
    input = 'teleporte: "dini";'
    esperado = "/tp @s dini"
    assert InEsp(input, esperado)


def test_tp_normal():
    input = 'teleporte: "dini" -> "votor";'
    esperado = "/tp dini votor"
    assert InEsp(input, esperado)


def test_tp_var_normal():
    input = """
    dini = "dini"
    votor = "votor"
    teleporte: dini -> votor
    """.strip()
    esperado = "/tp dini votor"
    assert InEsp(input, esperado)


def test_erro_string_n_fechada():
    input = 'teleporte: "dini;'
    esperado = "Linha 1 11 - cadeia não fechada"
    assert InEsp(input, esperado)


def test_give_name_lore():
    input = """dar_item: "Netherite Sword", {nome: "Espadinha", #FF0000 } {lore: "super espada", #0000FF}"""
    esperado = """/give @p minecraft:netherite_sword{display:{Name:'[{"text":"Espadinha","color":"#FF0000"}]',Lore:['{"text":"super espada","color":"#0000FF"}']}}"""
    print(input)
    assert InEsp(input, esperado)
