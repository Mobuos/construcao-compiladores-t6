import subprocess
import os
import pytest


# Roda run.sh e retorna stdout do programa
def run(file):
    return subprocess.check_output(["bash", "run.sh", "aux.in"]).decode("utf-8").strip()


# Roda main.py e retorna stdout do programa
def run_main(file):
    return subprocess.check_output(["python", "main.py", file]).decode("utf-8").strip()


# Função auxiliar para retirar
def clean(input):
    return input.replace("    ", "").strip()


def InEsp(input, esperado):
    input = clean(input)
    esperado = clean(esperado)
    # Cria arquivo aux.in
    faux = open("aux.in", "w")
    faux.write(input)
    faux.close()

    # Remove a primeira linha do retorno
    obtido = run_main("aux.in")
    if "Linha" not in obtido:
        obtido = "\n".join(obtido.split("\n")[1:])

    resultado = esperado == obtido

    if not resultado:
        print(f"Esperado: {esperado}\nObtido:   {obtido}")

    return resultado


@pytest.fixture(scope="session", autouse=True)
def gera_antlr(request):
    faux = open("aux.in", "w")
    faux.write("")
    faux.close()
    run("aux.in")
    # request.addfinalizer(destroi_aux)


# def destroi_aux():
# os.remove("aux.in")


############################
########## TESTES ##########
############################


######### Teleport #########


def test_tp_var_one_target():
    input = """
    player = "Mobuos"; 

    teleporte: player;
    """
    esperado = "/tp @s Mobuos"
    assert InEsp(input, esperado)


def test_tp_one_target():
    input = 'teleporte: "Mobuos";'
    esperado = "/tp @s Mobuos"
    assert InEsp(input, esperado)


def test_tp_relative_one_target():
    input = "teleporte: (0, 10, 0);"
    esperado = "/tp @s 0 10 0"
    assert InEsp(input, esperado)


def test_tp_normal():
    input = 'teleporte: "dini" -> "votor";'
    esperado = "/tp dini votor"
    assert InEsp(input, esperado)


def test_tp_var_normal():
    input = """
    dini = "dini";
    votor = "votor";
    teleporte: dini -> votor;
    """
    esperado = "/tp dini votor"
    assert InEsp(input, esperado)


def test_tp_coord():
    input = 'teleporte: "dini" -> (0, 0, 0);'
    esperado = "/tp dini 0 0 0"
    assert InEsp(input, esperado)


def test_tp_var_coord_relative():
    input = """
    cima = (~, ~10, ~);
    teleporte: "dini" -> cima;
    """
    esperado = "/tp dini ~ ~10 ~"
    assert InEsp(input, esperado)


def test_tp_var_coord():
    input = """
    zero = (0, 0, 0);
    teleporte: "dini" -> zero;
    """
    esperado = "/tp dini 0 0 0"
    assert InEsp(input, esperado)


def test_tp_coord_relative():
    input = 'teleporte: "dini" -> (~, ~10, ~);'
    esperado = "/tp dini ~ ~10 ~"
    assert InEsp(input, esperado)


######### Errors #########


def test_erro_string_n_fechada():
    input = 'teleporte: "dini;'
    esperado = "Linha 1 11 - cadeia não fechada"
    assert InEsp(input, esperado)


######### Give #########


def test_give_normal():
    input = 'dar_item: "Ender Pearl";'
    esperado = "/give @s ender_pearl"
    assert InEsp(input, esperado)


def test_give_enchantment():
    input = """dar_item: "Ender Pearl", {encantamento: "unbreaking", 2 + "power", 3};"""
    esperado = """/give @s ender_pearl{Enchantments:[{id:"unbreaking",lvl:2},{id:"power",lvl:3}]}"""
    assert InEsp(input, esperado)


def test_give_target():
    input = """dar_item: "Ender Pearl" -> "Mobuos";"""
    esperado = """/give Mobuos ender_pearl"""
    assert InEsp(input, esperado)


def test_give_var_target():
    input = """
    dini = "Mobuos";

    dar_item: "Eye of Ender" -> dini;
    """
    esperado = "/give Mobuos ender_eye"
    assert InEsp(input, esperado)


def test_give_qtd():
    input = 'dar_item: "Ender Pearl", 12;'
    esperado = "/give @s ender_pearl 12"
    assert InEsp(input, esperado)


def test_give_name():
    input = 'dar_item: "Ender Pearl", {nome: "Circulo"};'
    esperado = """/give @s ender_pearl{display:{Name:'[{"text":"Circulo"}]'}}"""
    assert InEsp(input, esperado)


def test_give_name_color():
    input = 'dar_item: "Ender Pearl", {nome: "Circulo", #FF0000};'
    esperado = """/give @s ender_pearl{display:{Name:'[{"text":"Circulo","color":"#FF0000"}]'}}"""
    assert InEsp(input, esperado)


def test_give_lore():
    input = """dar_item: "Netherite Sword", {lore: "super espada"};"""
    esperado = (
        """/give @s netherite_sword{display:{Lore:['{"text":"super espada"}']}}"""
    )
    assert InEsp(input, esperado)


def test_give_lore_color():
    input = """dar_item: "Netherite Sword", {lore: "super espada", #0000FF};"""
    esperado = """/give @s netherite_sword{display:{Lore:['{"text":"super espada","color":"#0000FF"}']}}"""
    assert InEsp(input, esperado)


def test_give_multiple_lore():
    input = """dar_item: "Netherite Sword", {lore: "super espada" + "espada bacana"};"""
    esperado = """/give @s netherite_sword{display:{Lore:['{"text":"super espada"}','{"text":"espada bacana"}']}}"""
    assert InEsp(input, esperado)


def test_give_multiple_lore_color():
    input = """dar_item: "Netherite Sword", {lore: "super espada", #FF0000 + "espada bacana", #00FF00};"""
    esperado = """/give @s netherite_sword{display:{Lore:['{"text":"super espada","color":"#FF0000"}','{"text":"espada bacana","color":"#00FF00"}']}}"""
    assert InEsp(input, esperado)


def test_give_multiple_lore_color_2():
    input = """dar_item: "Netherite Sword", {lore: "super espada" + "espada bacana", #00FF00};"""
    esperado = """/give @s netherite_sword{display:{Lore:['{"text":"super espada"}','{"text":"espada bacana","color":"#00FF00"}']}}"""
    assert InEsp(input, esperado)


def test_give_multiple_lore_color_3():
    input = """dar_item: "Netherite Sword", {lore: "super espada", #FF0000 + "espada bacana"};"""
    esperado = """/give @s netherite_sword{display:{Lore:['{"text":"super espada","color":"#FF0000"}','{"text":"espada bacana"}']}}"""
    assert InEsp(input, esperado)


def test_give_multiple_lore_color_4():
    input = """dar_item: "Netherite Sword", {lore: "super espada", #FF0000 + 
                                            "espada bacana", #00FF00 + 
                                            "yes", #0000FF};"""
    esperado = """/give @s netherite_sword{display:{Lore:['{"text":"super espada","color":"#FF0000"}','{"text":"espada bacana","color":"#00FF00"}','{"text":"yes","color":"#0000FF"}']}}"""
    assert InEsp(input, esperado)


def test_give_multiple_lore_color_5():
    input = """dar_item: "Netherite Sword", {lore: "super espada" + 
                                            "espada bacana", #00FF00 + 
                                            "yes"};"""
    esperado = """/give @s netherite_sword{display:{Lore:['{"text":"super espada"}','{"text":"espada bacana","color":"#00FF00"}','{"text":"yes"}']}}"""
    assert InEsp(input, esperado)


def test_give_var_multiple_lore_color():
    input = """
    super = {lore: "super espada", #FF0000 + "espada bacana", #00FF00};
    ns = "Netherite Sword";
    dar_item: ns, super;"""
    esperado = """/give @s netherite_sword{display:{Lore:['{"text":"super espada","color":"#FF0000"}','{"text":"espada bacana","color":"#00FF00"}']}}"""
    assert InEsp(input, esperado)


def test_give_name_lore_color():
    input = """dar_item: "Netherite Sword", {nome: "Espadinha", #FF0000 lore: "super espada", #0000FF};"""
    esperado = """/give @s netherite_sword{display:{Name:'[{"text":"Espadinha","color":"#FF0000"}]',Lore:['{"text":"super espada","color":"#0000FF"}']}}"""
    assert InEsp(input, esperado)


def test_give_var_name_lore_color():
    input = """
    vermelho = #FF0000;
    dar_item: "Netherite Sword", {nome: "Espadinha", #FF0000 lore: "super espada", #FF0000};
    """
    esperado = """/give @s netherite_sword{display:{Name:'[{"text":"Espadinha","color":"#FF0000"}]',Lore:['{"text":"super espada","color":"#FF0000"}']}}"""
    assert InEsp(input, esperado)


def test_give_var_name_lore_color_enchantment():
    input = """
    vermelho = #FF0000;
    espadinha = {nome: "Espadinha", vermelho lore: "super espada", vermelho};
    enc = {encantamento: "unbreaking", 2 + "power", 3};
    dar_item: "Netherite Sword", espadinha enc;
    """
    esperado = """/give @s netherite_sword{display:{Name:'[{"text":"Espadinha","color":"#FF0000"}]',Lore:['{"text":"super espada","color":"#FF0000"}']},Enchantments:[{id:"unbreaking",lvl:2},{id:"power",lvl:3}]}"""
    assert InEsp(input, esperado)


######### Achievement #########


def test_achievement_grant():
    input = """conquista: "a furious cocktail";"""
    esperado = """/advancement grant @s only nether/all_potions """
    assert InEsp(input, esperado)


def test_achievement_grant_target():
    input = """conquista: "a furious cocktail" -> "Mobuos";"""
    esperado = """/advancement grant Mobuos only nether/all_potions"""
    assert InEsp(input, esperado)


def test_achievement_grant_var_target():
    input = """
    furious = "a furious cocktail";
    dini = "Mobuos";
    conquista: furious -> dini;
    """
    esperado = """/advancement grant Mobuos only nether/all_potions"""
    assert InEsp(input, esperado)


def test_achievement_revoke():
    input = """conquista: -"a furious cocktail";"""
    esperado = """/advancement revoke @s only nether/all_potions"""
    assert InEsp(input, esperado)


def test_achievement_revoke_target():
    input = """conquista: -"a furious cocktail" -> "Mobuos";"""
    esperado = """/advancement revoke Mobuos only nether/all_potions"""
    assert InEsp(input, esperado)


def test_achievement_grant_everything():
    input = """conquista: "everything";"""
    esperado = """/advancement grant @s everything """
    assert InEsp(input, esperado)


def test_achievement_revoke_everything():
    input = """conquista: -"everything";"""
    esperado = """/advancement revoke @s everything """
    assert InEsp(input, esperado)


def test_achievement_grant_everything():
    input = """conquista: "everything" -> "Mobuos";"""
    esperado = """/advancement grant Mobuos everything """
    assert InEsp(input, esperado)


def test_achievement_grant_var_everything():
    input = """
    tudo = "everything";
    conquista: tudo -> "Mobuos";"""
    esperado = """/advancement grant Mobuos everything """
    assert InEsp(input, esperado)


######### Summon #########


def test_summon_normal():
    input = """criar_mob: "creeper";"""
    esperado = """/summon creeper ~ ~ ~ """
    assert InEsp(input, esperado)


def test_summon_coord():
    input = """criar_mob: "creeper", (~10, ~10, ~10);"""
    esperado = """/summon creeper ~10 ~10 ~10 """
    assert InEsp(input, esperado)


def test_summon_var_coord():
    input = """
    spawn = (0, 75, 0);
    criar_mob: "creeper", spawn;"""
    esperado = """/summon creeper 0 75 0 """
    assert InEsp(input, esperado)


def test_summon_coord_health():
    input = """criar_mob: "creeper", (~10, ~10, ~10), {vida: 100};"""
    esperado = """/summon creeper ~10 ~10 ~10 {Attributes:[{Name:"generic.max_health",Base:100f}],Health:100f}"""
    assert InEsp(input, esperado)


def test_summon_coord_name():
    input = """criar_mob: "cow", (~, ~, ~), {nome_mob: "Betsy"};"""
    esperado = """/summon cow ~ ~ ~ {CustomName:'{\"text\":\"Betsy\"}'}"""
    assert InEsp(input, esperado)


def test_summon_coord_noAI():
    input = """criar_mob: "creeper", (~, ~, ~), {semIA};"""
    esperado = """/summon creeper ~ ~ ~ {NoAI:1}"""
    assert InEsp(input, esperado)


def test_summon_coord_invulnerable():
    input = """criar_mob: "creeper", (~, ~, ~), {invulneravel};"""
    esperado = """/summon creeper ~ ~ ~ {Invulnerable:1}"""
    assert InEsp(input, esperado)


def test_summon_coord_health_noAI():
    input = """criar_mob: "creeper", (~, ~, ~), {vida: 100} {semIA};"""
    esperado = """/summon creeper ~ ~ ~ {Attributes:[{Name:"generic.max_health",Base:100f}],Health:100f,NoAI:1}"""
    assert InEsp(input, esperado)


def test_summon_coord_health_noAI_name():
    input = (
        """criar_mob: "creeper", (~, ~, ~), {vida: 100} {semIA} {nome_mob: "boom"};"""
    )
    esperado = """/summon creeper ~ ~ ~ {Attributes:[{Name:"generic.max_health",Base:100f}],Health:100f,NoAI:1,CustomName:'{"text":"boom"}'}"""
    assert InEsp(input, esperado)


def test_summon_coord_health_noAI_name_color():
    input = """criar_mob: "creeper", (~, ~, ~), {vida: 100} {semIA} {nome_mob: "boom", #FF0000};"""
    esperado = """/summon creeper ~ ~ ~ {Attributes:[{Name:"generic.max_health",Base:100f}],Health:100f,NoAI:1,CustomName:'{"text":"boom","color":"#FF0000"}'}"""
    assert InEsp(input, esperado)


def test_summon_coord_health_noAI_name_color_multiline():
    input = """criar_mob: "creeper", (~, ~, ~), 
                          {vida: 100} 
                          {semIA} 
                          {nome_mob: "boom", #FF0000};"""
    esperado = """/summon creeper ~ ~ ~ {Attributes:[{Name:"generic.max_health",Base:100f}],Health:100f,NoAI:1,CustomName:'{"text":"boom","color":"#FF0000"}'}"""
    assert InEsp(input, esperado)


def test_summon_var_coord_health_noAI_name():
    input = """
    aqui = (~, ~, ~);
    cem = {vida: 100};
    boom = {nome_mob: "boom"};
    criar_mob: "creeper", aqui, cem {semIA} boom;
    """
    esperado = """/summon creeper ~ ~ ~ {Attributes:[{Name:"generic.max_health",Base:100f}],Health:100f,NoAI:1,CustomName:'{"text":"boom"}'}"""
    assert InEsp(input, esperado)


def test_super():
    input = """
    """
    esperado = """
    """
    assert InEsp(input, esperado)
