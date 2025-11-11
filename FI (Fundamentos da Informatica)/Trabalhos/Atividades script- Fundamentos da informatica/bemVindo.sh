#Bom, acredito que o mais complexo aqui seja o -p, -o e sintaxe (explicarei em um documento resumo): 
#-p (no read)=mostrar texto antes de declarar a variavel
#-p (no mkdir)=cria o caminho caso nao exista
#-o=or, ou seja, ou
#__________________Script___________________
echo "root:usuario Derik Soares Batinga se registrou tendo 16 anos, nasceu em Sao Paulo e e do sexo masculino. Permitir entrada?"
read -p "S/N: " PERMITIR
if [ "$PERMITIR" = "S" -o "$PERMITIR" = s ]; then
echo "Derik, Bem-vindo ao sistema!"
else
echo "Acesso negado!"
fi
