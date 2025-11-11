############################################################
###########   GUIA RÁPIDO DE SINTAXE BASH (.sh)   ##########
########## Explicações de uso, exemplos e contexto #########
############################################################


# ----------------------------------------------------------
# [ ... ]  → Testes condicionais (if, while, etc)
# ----------------------------------------------------------
# Exemplo:
# if [ $x -gt 5 ]; then
#     echo "Maior que 5"
# fi


# ----------------------------------------------------------
# [[ ... ]] → Versão moderna de [ ], aceita &&, ||, regex
# ----------------------------------------------------------
# Exemplo:
# if [[ $nome == "admin" || $cargo =~ "root" ]]; then
#     echo "Acesso total"
# fi


# ----------------------------------------------------------
# $(( ... )) → Operações matemáticas
# ----------------------------------------------------------
# soma=$((3 + 7))


# ----------------------------------------------------------
# $variavel → Expansão simples de variável
# ----------------------------------------------------------
# echo "Nome: $nome"


# ----------------------------------------------------------
# ${variavel} → Usado para manipular variáveis ou evitar ambiguidade
# ----------------------------------------------------------
# echo "Tamanho: ${#nome}"
# echo "Primeiras 3 letras: ${nome:0:3}"


# ----------------------------------------------------------
# "texto" (aspas duplas) → Expande variáveis, com $
# ----------------------------------------------------------
# echo "Olá $USER"


# ----------------------------------------------------------
# 'texto' (aspas simples) → Sem expansão, literal, sem $
# ----------------------------------------------------------
# echo 'Valor de $USER não aparece'


# ----------------------------------------------------------
# $(comando) → Captura saída de comando
# ----------------------------------------------------------
# data=$(date)


# ----------------------------------------------------------
# `comando` → Forma antiga de $(...), menos recomendada
# ----------------------------------------------------------
# user=`whoami`


############################################################
# ESTRUTURAS DE CONTROLE
############################################################

# ----------------------------------------------------------
# IF / ELSE
# ----------------------------------------------------------
# if [ $idade -ge 18 ]; then
#     echo "Maior"
# else
#     echo "Menor"
# fi


# ----------------------------------------------------------
# CASE → Várias comparações
# ----------------------------------------------------------
# read -p "Sexo (M/F): " Sexo
# case $Sexo in
#     M) echo "Masculino" ;;
#     F) echo "Feminino" ;;
#     *) echo "Inválido" ;;
# esac


# ----------------------------------------------------------
# FOR → Loop em lista
# ----------------------------------------------------------
# for i in 1 2 3; do
#     echo $i
# done


# ----------------------------------------------------------
# WHILE → Repete enquanto a condição for verdadeira
# ----------------------------------------------------------
# i=1
# while [ $i -le 5 ]; do
#     echo $i
#     i=$((i+1))
# done


# ----------------------------------------------------------
# UNTIL → Repete até a condição ficar verdadeira
# ----------------------------------------------------------
# x=1
# until [ $x -gt 3 ]; do
#     echo $x
#     x=$((x+1))
# done


############################################################
# FUNÇÕES
############################################################

# ----------------------------------------------------------
# function nome() { comandos }
# ----------------------------------------------------------
# ola() {
#     echo "Olá, $1"
# }
# ola Ronildo


############################################################
# OPERADORES (NÚMEROS)
############################################################

# -eq  (igual)
# -ne  (diferente)
# -gt  (maior que)
# -lt  (menor que)
# -ge  (maior ou igual)
# -le  (menor ou igual)

# Exemplo:
# if [ $x -gt 10 ]; then echo "Maior que 10"; fi


############################################################
# OPERADORES (STRINGS)
############################################################

# =   (igual)
# !=  (diferente)
# -z  (string vazia)
# -n  (string não vazia)
# Exemplo:
# if [ -z "$nome" ]; then echo "Sem nome"; fi


############################################################
# OPERADORES LÓGICOS
############################################################

# && → AND
# || → OR
# !  → NOT

# Exemplo:
# if [ $x -gt 5 ] && [ $x -lt 10 ]; then echo "Entre 5 e 10"; fi


############################################################
# ENTRADA E SAÍDA
############################################################

# echo → imprime texto
# read → recebe entrada
# exit → finaliza script
# return → usado dentro de funções

# Exemplo:
# read -p "Digite seu nome: " nome
# echo "Olá $nome"
# exit 0


############################################################
# REDIRECIONAMENTOS & PIPE
############################################################

# >   sobrescreve arquivo
# >>  adiciona no final
# <   usa arquivo como entrada
# 2>  redireciona erros
# |   pipe (saída para outro comando)

# Exemplo:
# echo "Linha" >> arquivo.txt
# ls | grep ".txt"
# comandoInvalido 2> erro.log


############################################################
# ARRAYS E PARÂMETROS ESPECIAIS
############################################################

# Arrays:
# nums=(10 20 30)
# echo ${nums[1]}      # mostra 20
# echo ${#nums[@]}     # tamanho


# $@   → todos os argumentos passados ao script
# $#   → quantidade de argumentos
# $?   → retorno do último comando (0 = OK)
# $0   → nome do script

# Exemplo:
# echo "Argumentos: $@"
# echo "Qtd: $#" 
# ls arquivo.txt
# echo "Código de retorno: $?"


############################################################
# FIM DO GUIA
############################################################
