import subprocess
import os


# Roda run.sh e retorna stdout do programa
def run(file):
    return subprocess.check_output(["bash", "run.sh", "aux.in"]).decode("utf-8").strip()


# Função auxiliar para retirar
def clean(input):
    return input.replace("    ", "").strip()


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


### Teleporte ###
def test_tp_var_one_target():
    input = clean(
        """
    player = "Mobuos"; 

    teleporte: player;
    """
    )
    esperado = "/tp @s Mobuos"
    assert InEsp(input, esperado)


def test_tp_one_target():
    input = 'teleporte: "Mobuos";'
    esperado = "/tp Mobuos"
    assert InEsp(input, esperado)


def test_tp_relative_one_target():
    input = "teleporte: (0, 10, 0);"
    esperado = "/tp 0 10 0"
    assert InEsp(input, esperado)


def test_tp_normal():
    input = 'teleporte: "dini" -> "votor";'
    esperado = "/tp dini votor"
    assert InEsp(input, esperado)


def test_tp_var_normal():
    input = clean(
        """
    dini = "dini";
    votor = "votor";
    teleporte: dini -> votor;
    """
    )
    esperado = "/tp dini votor"
    assert InEsp(input, esperado)


def test_tp_coord():
    input = 'teleporte: "dini" -> (0, 0, 0);'
    esperado = "/tp dini 0 0 0"
    assert InEsp(input, esperado)


def test_tp_var_coord_relative():
    input = clean(
        """
    cima = (~, ~10, ~);
    teleporte: "dini" -> cima;
    """
    )
    esperado = "/tp dini ~ ~10 ~"
    assert InEsp(input, esperado)


def test_tp_var_coord():
    input = clean(
        """
    zero = (0, 0, 0);
    teleporte: "dini" -> zero;
    """
    )
    esperado = "/tp dini 0 0 0"
    assert InEsp(input, esperado)


def test_tp_coord_relative():
    input = 'teleporte: "dini" -> (~, ~10, ~);'
    esperado = "/tp dini ~ ~10 ~"
    assert InEsp(input, esperado)


### Erros ###
def test_erro_string_n_fechada():
    input = 'teleporte: "dini;'
    esperado = "Linha 1 11 - cadeia não fechada"
    assert InEsp(input, esperado)


### Dar Item ###
def test_give_normal():
    input = 'dar_item: "Ender Pearl";'
    esperado = "/give @s minecraft:ender_pearl"
    assert InEsp(input, esperado)


def test_give_target():
    input = 'dar_item: "Ender Pearl" -> "Mobuos";'
    esperado = "/give Mobuos minecraft:ender_pearl"
    assert InEsp(input, esperado)


def test_give_var_target():
    input = clean(
        """
    dini = "Mobuos";

    dar_item: "Eye of Ender" -> dini;
    """
    )
    esperado = "/give dini minecraft:ender_eye"
    assert InEsp(input, esperado)


def test_give_qtd():
    input = 'dar_item: "Ender Pearl", 12;'
    esperado = "/give dini minecraft:ender_pearl 12"
    assert InEsp(input, esperado)


def test_give_name():
    input = 'dar_item: "Ender Pearl", {nome: "Circulo"};'
    esperado = (
        """/give @s minecraft:ender_pearl{display:{Name:'[{"text":"Circulo"}]'}}"""
    )
    assert InEsp(input, esperado)


def test_give_name_color():
    input = 'dar_item: "Ender Pearl", {nome: "Circulo", #FF0000};'
    esperado = """/give @s minecraft:ender_pearl{display:{Name:'[{"text":"Circulo","color":"#FF0000"}]'}}"""
    assert InEsp(input, esperado)


def test_give_lore():
    input = """dar_item: "Netherite Sword", {lore: "super espada"};"""
    esperado = """/give @s minecraft:netherite_sword{display:{Lore:['{"text":"super espada"}']}}"""
    assert InEsp(input, esperado)


def test_give_lore_color():
    input = """dar_item: "Netherite Sword", {lore: "super espada", #0000FF};"""
    esperado = """/give @s minecraft:netherite_sword{display:{Lore:['{"text":"super espada","color":"#0000FF"}']}}"""
    assert InEsp(input, esperado)


def test_give_multiple_lore():
    input = """dar_item: "Netherite Sword", {lore: "super espada"} {lore: "espada bacana"};"""
    esperado = """/give @s minecraft:netherite_sword{display:{Lore:['{"text":"super espada"}','{"text":"espada bacana"}']}}"""
    assert InEsp(input, esperado)


def test_give_multiple_lore_color():
    input = """dar_item: "Netherite Sword", {lore: "super espada", #FF0000} {lore: "espada bacana", #00FF00};"""
    esperado = """/give @s minecraft:netherite_sword{display:{Lore:['{"text":"super espada","color":"#FF0000"}','{"text":"espada bacana","color":"#00FF00"}']}}"""
    assert InEsp(input, esperado)


def test_give_var_multiple_lore_color():
    input = clean(
        """
    super = {lore: "super espada", #FF0000};
    bacana = {lore: "espada bacana", #00FF00};
    ns = "Netherite Sword";
    dar_item: ns, super bacana;"""
    )
    esperado = """/give @s minecraft:netherite_sword{display:{Lore:['{"text":"super espada","color":"#FF0000"}','{"text":"espada bacana","color":"#00FF00"}']}}"""
    assert InEsp(input, esperado)


def test_give_name_lore_color():
    input = """dar_item: "Netherite Sword", {nome: "Espadinha", #FF0000 } {lore: "super espada", #0000FF};"""
    esperado = """/give @s minecraft:netherite_sword{display:{Name:'[{"text":"Espadinha","color":"#FF0000"}]',Lore:['{"text":"super espada","color":"#0000FF"}']}}"""
    assert InEsp(input, esperado)


def test_give_name_lore_color():
    input = clean(
        """
    vermelho = #FF0000;
    espadinha = {nome: "Espadinha", #FF0000};
    dar_item: "Netherite Sword", espadinha {lore: "super espada", #FF0000};"""
    )
    esperado = """/give @s minecraft:netherite_sword{display:{Name:'[{"text":"Espadinha","color":"#FF0000"}]',Lore:['{"text":"super espada","color":"#FF0000"}']}}"""
    assert InEsp(input, esperado)
