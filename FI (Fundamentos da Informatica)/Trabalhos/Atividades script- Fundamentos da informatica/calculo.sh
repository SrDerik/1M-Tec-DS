#!/bin/bash
#__________________Explicacoes___________________
#Bom, acredito que o mais complexo de entender neste script seja o calculo da raiz, veja a explicacao a baixo:
#scale=numeros de casas decimais depois do .
#sqrt=raiz quadrada
#|=pipe, pega o que saiu do echo pra mandar para outro comando
#bq=calculadora do linux (Basic calculator),util para alguns calculos que o bash nao consegue fazer, como por exemplo uma raiz quadrada
#__________________Solicita os dois números___________________
read -p "Digite o primeiro numero: " num1
read -p "Digite o segundo numero: " num2
#__________________Calcula a soma e a multiplicação___________________
soma=$((num1 + num2))
subtracao=$((num1 - num2))
multiplicacao=$((num1 * num2))
divisao=$((num1 / num2))
raiz25=$(echo "scale=2; sqrt(25)" | bc -l)
#__________________Exibe os resultados___________________
echo "A soma de $num1 e $num2 e: $soma"
echo "A subtracao de $num1 e $num2 e: $subtracao"
echo "A multiplicação de $num1 e $num2 e: $multiplicacao"
echo "A divisao de $num1 e $num2 e: $divisao"
echo "E se lembre, a raiz de 25 e: $raiz25"
