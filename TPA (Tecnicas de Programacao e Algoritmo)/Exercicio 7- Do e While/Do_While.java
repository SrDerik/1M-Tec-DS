package com.mycompany.do_while;
import java.util.Scanner;
/**
 *
 * @author d3
 */
public class Do_While {
    public static void main(String[] args) {
        //Chamada do scanner
        Scanner scanner=new Scanner(System.in);
        //Primeiro algoritmo
          //Variaveis e dialogo
             System.out.println("Os aqui vai os pares de 1 a 20:");
             int pares=0;
             //Do e While
              do {
                  System.out.println(pares);
                 pares+=2;
              } while (pares<=20);
              
         //Segundo algoritmo
             //Variaveis
            System.out.println("Insira o numero que voce quer a tabuada");
            int numero=scanner.nextInt();
            int numerosemmudanca=numero;
             System.out.println("Insira ate qual numero voce quer multiplicar");
            int multiplos=scanner.nextInt();
            //Variaveis para o calculo
            int dois=2;
            int resultado=numero;
            //Do e while
            do {
             resultado=numero*dois;
              System.out.println(numerosemmudanca+"X"+dois+"="+resultado);
             dois++;
           
            }
            while (dois<=multiplos);
    
             //Terceiro algoritmo
             //Variaveis
            int pa1=100;
            int pa25=125;
             //Variavel para calculo
          int numeromostrar=pa1;
            //Do e while
            do {
             System.out.println("Sao eles:"+numeromostrar);
             numeromostrar=numeromostrar+1;
            }
            while (numeromostrar<=pa25);
    
       //Quarto algoritmo (e mais chato)
             //Variaveis
            System.out.println("Digite um valor inicial");
            int inicial=scanner.nextInt();
             System.out.println("Digite o valor final");
            int ifinal=scanner.nextInt();
            //Variaveis para o calculos
            int inicialcalculo=inicial;
            int somaimpares=0;
             System.out.println("Aqui vai a lista dos numeros impares:");
            //Do e while
            do {
                if (inicialcalculo%2!=0){
              System.out.println(inicialcalculo);
              somaimpares+=inicialcalculo;
              }
             inicialcalculo++;
            }
            while (inicialcalculo<=ifinal);
             System.out.println("A soma deles e:"+somaimpares);
    }  
}