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

```bash
  # Dá determinado item para um player.
  dar_item: nome_item, quantidade?, modificadores? ->? player?;

  # Teleporta determinada origem para determinado destino, caso não haja origem, a origem será o próprio player.
  teleporte: origem? ->? destino;

  # Encanta o item que está na mão do determinado player.
  encantar: encantamento, level? ->? player?

  # Cria um monstro.
  criar_monstro: nome_do_monstro, posicao?, modificadores?;

  # Gerencia conquistas para determinado jogador.
  conquista: -? nome_conquista ->? player?
```

Depois disso execute o script bash de dentro da pasta do projeto:

```bash
  bash ./run.sh
```

O script vai gerar os arquivos do antlr e executar o programa.

TODO: Testes automatizados
