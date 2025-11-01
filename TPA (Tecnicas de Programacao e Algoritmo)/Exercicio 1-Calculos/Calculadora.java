package com.mycompany.calculadora;

/**
 *
 * @author d3
 */
public class Calculadora {

public static void main(String[] args) {
    
    
       //Definição das variáveis para cálculos básicos
          double alturaPessoa = 1.8;                                      //Altura de uma pessoa, foi utilizado para os calculos de subtração,dvisião, soma e etc
          double comprimentoPessoa = 0.9;                                 //Comprimento de uma pessoa, foi utilizado para os calculos de subtração,dvisião, soma e etc
         
       // Quadrado
         float alturaQuadrado = 6.5f;                                     //Altura do quadrado (é a mesma do comprimento já que é um quadrado)             
         float comprimentoQuadrado = 6.5f;                                //Comprimento do quadrado (é a mesma da altura já que é um quadrado)
         
       //Retângulo
         int alturaRetangulo = 7;                                         //Altura do retângulo
         int baseRetangulo = 5;                                           //Base do retângulo (Foi substituido pelo comprimento já que o calculo é feito usando a área)
        
       //Losango
         float diagonalMaiorLosango = 9.4f;                               //Diagonal maior (pode ser tanto o comprimento ou altura, depende da posição do losango, deitado ou em pé)
         float diagonalMenorLosango = 8.1f;                               //Diagonal menor (pode ser tanto o comprimento ou altura, depende da posição do losango, deitado ou em pé)
        
       //Triângulo
         int alturaTriangulo = 12;                                        //Altura do Triângulo
         int baseTriangulo = 10;                                          //Base do triângulo (Foi substituido pelo comprimento já que o cálculo é feito usando a base)
     
       //Circunferência
         float diametroCircunferencia = 10.55f;                           //Diametro da circunferência
         
       //Para cálculos
         float pi = 3.14159f;                                                  //Simplesmente PI
         double raio=diametroCircunferencia/2;                            //Formula do cálculo de uma circunferência

        //Operações matemáticas
               
         double Soma = alturaPessoa + comprimentoPessoa;                   //+ é soma
         double Subtracao = alturaPessoa - comprimentoPessoa;              //- subtração
         double Multiplicacao = alturaPessoa * comprimentoPessoa;          //* Multiplicação
         double Divisao = alturaPessoa/comprimentoPessoa;                  /// é Divisão
         double Media = (alturaPessoa + comprimentoPessoa)/2;              //Média, foi colocado em parenteses poís se resolve o parenteses primeiro, desta forma não terá erros
         double Quadrado = alturaQuadrado*comprimentoQuadrado;             //Cálculo do quadrado
         double Retangulo = alturaRetangulo*baseRetangulo;                 //Cálculo do retângulo
         double Losango = (diagonalMenorLosango*diagonalMaiorLosango)/2;   //Cálculo do losango, foi colocado em parenteses para ficar mais organizado
         double Triangulo = (alturaTriangulo*baseTriangulo)/2;             //Cálculo do triângulo, foi colocado em parenteses para ficar mais organizado
         double circunferencia = (raio*raio)*pi;                           //Cálculo da circunferência, foi colocado em parenteses para ficar mais organizado
    
        //Exibição de resultados
         System.out.println("Calculos:");
         System.out.println("Soma:" + Soma);
         System.out.println("Subtracao:"+ Subtracao);
         System.out.println("Multiplicacao:" + Multiplicacao);
         System.out.println("Divisao:" + Divisao);
         System.out.println("Media:" + Media);                             //Não foi colocado acentuação poís não identifica ao rodar o teste
         System.out.println("Quadrado:" + Quadrado);
         System.out.println("Retangulo:" + Retangulo);
         System.out.println("Losango:" + Losango);
         System.out.println("Triangulo:" + Triangulo);
         System.out.println("Circunferencia aproximada:" + circunferencia);
  
    }
    
} 
