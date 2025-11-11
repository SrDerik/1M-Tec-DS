#Bom, acredito que o mais complexo aqui seja o -z e -f: 
#-z=se for vazia
#-n=se nao for vazia
#-f=existe e e arquivo comum
#-d=existe e e diretorio (pasta)
#-e=existe e e qualquer coisa
#__________________Script___________________
#!/bin/bash
#__________________Verifica se o nome do arquivo foi passado como argumento___________________
if [ -z "$1" ]; then
 echo "Uso: $0 nome_do_arquivo"
 exit 1
fi
#__________________Verifica se o arquivo existe___________________
if [ -f "$1" ]; then
 echo "O arquivo '$1' existe."
else
 echo "O arquivo '$1' não existe."
fi
