package com.mycompany.switchcompany;
//Imports
import java.util.Scanner;
/**
 Author:Derik Soares Batinga
 */ 
public class SwitchCompany {
      public static void main(String[] args) {
     //Criação do scanner
         Scanner scanner=new Scanner(System.in);
        //Variáveis
         System.out.println("Digite um valor de 1 a 3 para receber uma fruta: ");
         int fruta=scanner.nextInt();
        //Código a executar (Fruta
         switch(fruta){
             case 1://Se for 1
             System.out.print("Você recebeu uma maçã!\n");
         break;
             case 2://Se for 2
             System.out.print("Você recebeu uma banana!\n");
         break;
              case 3://Se for 3
              System.out.print("Você recebeu uma laranja!\n");
         break;//Se for qualquer outro
              default: System.out.print("Fruta inválida\n");
         break;
       }
          //Variáveis
         System.out.println("Digite um número de 1 a 5 para receber um jogo misterioso");
         int jogo=scanner.nextInt();
        //Código a executar (jogo)
         switch(jogo){
             case 1://Se for 1
             System.out.print("Você rececebeu o Minecraft!\n");
         break;
             case 2://Se for 2
             System.out.print("Você recebeu o Fifa!\n");
         break;
              case 3://Se for 3
              System.out.print("Você recebeu o Fortnite\n");
         break;
           case 4://Se for 4
             System.out.print("Você recebeu o Call Of Duty!\n");
         break;
              case 5://Se for 5
              System.out.print("Você recebeu o The Sims!\n");
         break;//Se for qualquer outro
              default: System.out.print("Jogo inválido\n");
         break;
         }
             //Variáveis
         System.out.println("Digite um número de 1 a 7 para ver que dia é hoje");
         int semana=scanner.nextInt();
        //Código a executar
         switch(semana){
             case 1://Se for 1
             System.out.print("Hoje é segunda, de volta ao trabalho!");
         break;
             case 2://Se for 2
             System.out.print("Hoje é terça-feira, apenas 4 dias até o seu descanço");
         break;
              case 3://Se for 3
              System.out.print("Hoje é quarta-feira, apenas 3 dias até o seu descanço");
         break;
           case 4://Se for 4
             System.out.print("Hoje é quinta-feira, apenas 2 dias até o seu descanço");
         break;
              case 5://Se for 5
              System.out.print("SEXTOU, hoje é sexta-feira!");
         break;//Se for 6
           case 6:
              System.out.print("Hoje é sábado, que tal um lanche");
         break;//Se for 7
           case 7:
              System.out.print("Hoje é domingo. Descance bem, amanhã você recomeça");
         break;//Se for qualquer outro
              default: System.out.print("Dia inválido");
         break;
         }
     }
}
