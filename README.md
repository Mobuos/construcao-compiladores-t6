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

Para execução do programa é necessário um arquivo de entrada, que conterá instruções para geração do comando, utilizando os comandos abaixo:

```Bash
# Para utilizar a ferramenta, é possível utilizar os seguintes comandos:

  # COMANDO ATRIBUIÇÃO
    # Uma variável pode ser:
      # Uma coordenada
      {nomeVar} = ( 10, ~, ~20);
      # Uma string
      {nomeVar} = "STRING";
      # Um modificador de item
      {nomeVar} = {<modificador_item>};
      # Um modificador de mob
      {nomeVar} = {<modificador_mob>};
      # Uma cor
      {nomeVar} = #FFFF00;

  # COMANDO TELEPORTE
    teleporte: {origem} -> {destino};
    # ou
    tp: {origem} -> {destino};

      # OBS: A origem é opcional, caso não utilizada, a origem é o próprio player.

      # Sendo que a origem pode ser:
        # Uma string
        {origem} = "nome usuario"
        # Uma variável que seja string
        {origem} = varUsuario => "nome usuario"

      # E destino pode ser:
        # Uma string
        {destino} = "nome usuario"
        # Uma coordenada
        {destino} = ( ~, 64, ~20)
        # Uma variável que seja string ou coordenada
        {destino} = varDestino => ( ~, 64, ~20) || "nome usuario"

  # COMANDO CONQUISTA
    # Dar uma conquista.
    conquista: {conquista} -> {player};
    # Remover conquista.
    conquista: -{conquista} -> {player};

      # OBS: O player é opcional, caso não utilizado, a conquista é dada ou removida do próprio player.

      # Sendo que conquista pode ser:
        # Uma string
        {conquista} = "nome conquista"
        # Uma variável que seja string
        {conquista} = varConquista => "nome conquista"

      # E player pode ser:
        # Uma string
        {player} = "nome player"
        # Uma variável que seja string
        {player} = varPlayer => "nome player"

  # COMANDO CRIAR MOB
    criar_mob: {mob}, {coordenada}, {<modificador>};

      # OBS: A coordenada é opcional, caso não utilizada, o mob será criado na localização atual do player.
      # OBS: O modificador é opcional e pode ser mais do que um, apenas adicionar mais modificadores sem nenhum separador entre eles, por exemplo: {<modificador1>} {<modificador2>} ...

      # Sendo que mob pode ser:
        # Uma string
        {mob} = "nome do mob"
        # Uma variável que é uma string
        {mob} = varMob => "nome do mob"

      # E coordenada pode ser:
        # Uma string
        {coordenada} = "nome usuario"
        # Uma variável que seja string
        {coordenada} = varUsuario => "nome usuario"

      # E modificador pode ser:
        # Um modificador de mob:
        {<modificador>} = { <modificador_mob> }
        # Uma variável que seja um modificador de mob
        {<modificador>} = varModMob => { <modificador_mob> }

  # COMANDO DAR ITEM
    dar_item: {item}, 10, {<modificador>} -> {player};

      # OBS: O player é opcional, caso não utilizado, o item será dado ao próprio player.
      # OBS: O modificador é opcional e pode ser mais do que um, apenas adicionar mais modificadores sem nenhum separador entre eles, por exemplo: {<modificador1>} {<modificador2>} ...
      # OBS: A quantidade é opcional, caso não utilizada, será dado apenas uma unidade do item.

      # Sendo que item pode ser:
        # Uma string
        {item} = "nome do item"
        # Uma variável que é uma string
        {item} = varitem => "nome do item"

      # E modificador pode ser:
        # Um modificador de item:
        {<modificador>} = { <modificador_item> }
        # Uma variável que seja um modificador de item
        {<modificador>} = varModItem => { <modificador_item> }

      # E o player pode ser:
        # Uma string
        {player} = "nome player"
        # Uma variável que seja string
        {player} = varPlayer => "nome player"

  # MODIFICADOR DE MOB
    # Os modificadores de mobs possíveis são:

      # Modificador de nome e sua cor
      nome_mob {mob}, {cor}

        # OBS: A cor é opcional, caso não utilizada, o mob terá um nome com a cor padrão do Minecraft.

        # Sendo que mob pode ser:
          # Uma string
          {mob} = "nome do mob"
          # Uma variável que seja uma string
          {mob} = varMob => "nome do mob"

        # E cor pode ser:
          # Uma cor
          {cor} = #FF00FF
          # Uma variável que seja uma cor
          {cor} = varCor => #FF00FF

      # Modificador de inteligência
      semIA

      # Modificador de invulnerabilidade
      invulneravel

      # Modificador de vida com número inteiro
      vida: 10
      # Modificador de vida com número real
      vida: 12.5

  # MODIFICADOR DE ITEM
    # Os modificadores de itens possíveis são:

      # Modificador de inquebrável
      inquebravel

      # Modificador de nome e descrição do item
      nome: {nome}, {cor} lore: {descricao}, {cor}

        # OBS: O nome é opcional e pode ser utilizado mais do que um, apenas adicionar mais nomes separados por um "+" entre eles, por exemplo: {nome1}, {cor1} + {nome2} + ...
        # OBS: A lore é opcional e pode ser utilizado mais do que um, apenas adicionar mais lores separadas por um "+" entre elas, por exemplo: {lore1}, {cor1} + {lore2} + ...
        # OBS: A cor é opcional, mas deve ser sempre acompanhada por {nome} ou {lore}.

        # Sendo que nome pode ser:
          # Uma string
          {nome} = "nomeItemCustomizado"
          # Uma variável que é uma string
          {nome} = varNomeCustomizado => "nomeItemCustomizado"

        # E a lore pode ser:
          # Uma string
          {lore} = "descricaoItemCustomizada"
          # Uma variável que é uma string
          {lore} = varDescricaoCustomizada => "nomeDescricaoCustomizada"

        # E a cor pode ser:
          # Uma cor
          {cor} = #FF00FF
          # Uma variável que seja uma cor
          {cor} = varCor => #FF00FF

      # Modificador de encantamento do item
      encantamento: {encantamento}, {lvl}

        # OBS: É possível atribuir mais de um encantamento no item, apenas adicionar mais encantamentos separados por um "+" entre eles, por exemplo: {encantamento1}, {lvl1} + {encantamento2}, {lvl} + ...

        # Sendo que o encantamento pode ser:
          # Uma string
          {encantamento} = "nomeEncantamento"
          # Uma variável que é uma string
          {encantamento} = varNomeEncantamento => "nomeEncantamento"

        # E o lvl pode ser:
          # Um número inteiro
          {lvl} = 10
          # Uma variável que é um número inteiro
          {lvl} = varLvl => 10

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
