#/bin/bash

# É necessário mais um parametro de entrada.
if [ $# -lt 1 ]; then
    echo "Para executar o programa é necessário um argumento, que seja o arquivo de entrada"
else
    antlr4 "-Dlanguage=Python3" "-visitor" "antlr/minecraftCommands.g4"

    if [ $# -eq 1 ]; then
        python main.py $1
    else
        python main.py $1 $2
    fi
fi

