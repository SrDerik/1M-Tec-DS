#__________________Explicacoes___________________
#-p no MKDIR serve para criar o diretorio caso o caminho nao exista, no read significa mostrar texto antes de declarar a variavel
#-p no read serve para mostrar um texto antes de declarar a variavel
#-o serve como "ou"

#fiz um while para poder criar varios diretorios, utilizei o material de apoio para realizar tal feito
#__________________Script___________________
#!/bin/bash
RESPOSTA="S"
while [ "$RESPOSTA" = "s" -o "$RESPOSTA" = "S" ]
do
read -p "Digite o nome do diretorio que deseja criar: " NOME_DIR
   mkdir -p "$NOME_DIR"
echo "Diretorio '$NOME_DIR' criado com sucesso!"

echo "Deseja criar mais um diretorio?"
read -p "S/N: " RESPOSTA
done

echo "Script terminado"

