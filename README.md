```bash
antlr4 -Dlanguage=Python3 antlr/hello.g4
```

# Gerador de comandos de Minecraft

Sexto trabalho da disciplina de Construção de Compiladores, lecionada pelo professor Daniel Lucrédio.

<h3 align="center">
  Feito por:
</h3>

<div align="center">
  <table>
    <tr>
      <td>João Dini de Miranda</td>
      <td><code>790716</code></td>
    </tr>
    <tr>
      <td>Miguel Henrique Chinellato</td>
      <td><code>791964</code></td>
    </tr>
    <tr>
      <td>Vitor de Almeida Recoaro</td>
      <td><code>790035</code></td>
    </tr>
  </table>
</div>

---

## Compilação e Execução

### Compilação

Para compilação do programa é necessária ter instalado no sistema o [Python 3](https://www.python.org/) e instalar `antlr4-python3-runtime`, recomendamos usar o gerenciador de pacotes do python pip.

```bash
  pip install antlr4-python3-runtime
```

### Execução

Para execução do programa é necessário um arquivo de entrada, que conterá instruções para geração do comando, por exemplo:

```Rust
  // Atribuição de variáveis para utilização nos comandos abaixo.
  nomeVar = "String" | (x, y, z) | modificador;

  // Exemplos de modificadores possíveis p/ mobs
  nome = {nome: "String", #0000FF}
  semIA = {semIA}

  // Número de meio-corações
  vida = {vida: 60}
  invulneravel = {invulneravel}

  // Exemplos de modificadores possíveis p/ itens
  encantamento = {encantamento: "unbreaking", 2 + "power", 3}
  exibicao = {nome: "String", #0000FF + "outraString", #FF0000 lore: "String", #0000FF + "outraString", #FF0000}

  // Dá determinado item para um player.
  // Modificadores disponíveis: Display, Enchantments, Unbreakable
  dar_item: nome_item, quantidade?, modificadores? ->? player?;

  // Teleporta determinada origem para determinado destino, caso não haja origem, a origem será o próprio player.
  teleporte: origem? ->? destino;

  // Cria um mob.
  criar_mob: nome_do_mob, posicao?, modificadores?;
  // Modificadores disponíveis: health, noAI, customName, invulnerable

  // Gerencia conquistas para determinado jogador.
  conquista: -? nome_conquista ->? player?;
```

Depois disso execute o script bash de dentro da pasta do projeto:

```bash
  bash ./run.sh
```

O script vai gerar os arquivos do antlr e executar o programa.

### Testes

Para rodar os testes utilizamos o pytest (`pip install pytest`):

```bash
  pytest
```

ou para rodar testes específicos (e.g apenas de tp, erro, give, etc.)

```bash
  pytest -k 'tp'
```
