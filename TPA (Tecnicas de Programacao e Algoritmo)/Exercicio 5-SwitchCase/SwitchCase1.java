package com.mycompany.switchcase1;
//Import scanner
import java.util.Scanner;
/**
 Author:Derik Soares Batinga
 */ 
public class SwitchCase1 {
      public static void main(String[] args) {
     //Criação do scanner
         Scanner scanner=new Scanner(System.in);
        //Variáveis
         System.out.println("Digite a sua idade: ");
         int idade=scanner.nextInt();
        //Código a executar
         switch(idade){
             case 1,2,3,4,5,6,7,8,9,10:
             System.out.print("Você tem uma idade abaixo ou igual a 10: ");
         break;
             case 11,12:
             System.out.print("Você tem uma idade de 11 ou 12: ");
         break;
              case 13,14:
              System.out.print("Você tem uma idade de 13 ou 14: ");
         break;
              case 15,16:
              System.out.print("Você tem uma idade de 15 ou 16: ");
         break;
              case 17,18:
                  System.out.print("Você tem uma idade de 17 ou 18: ");
              break;
              default: System.out.print("Você possui maior idade");
       }
    }
}