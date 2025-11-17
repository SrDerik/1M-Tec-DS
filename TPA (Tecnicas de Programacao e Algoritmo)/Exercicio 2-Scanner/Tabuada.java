package com.mycompany.tabuada;
//Import
 import java.util.Scanner;
/**
 *
 * @author D3
 */
   
public class Tabuada {
    public static void main(String[] args) {
        //Scanner
   Scanner scanner =new Scanner(System.in);
        //Leitura notas
        System.out.print("Digite o numero: ");
         int numero= scanner.nextInt();
         //Cálculos números
         int numeroXdois=numero*2;
         int numeroXtres=numero*3;
         int numeroXquatro=numero*4;
         int numeroXcinco=numero*5;
         int numeroXseis=numero*6;
         int numeroXsete=numero*7;
         int numeroXoito=numero*8;
         int numeroXnove=numero*9;
         int numeroXdez=numero*10;
       //Exibição de resultados
         System.out.println(numero+ "X=:" +numero);
         System.out.println(numero+ "X2=" +numeroXdois);
         System.out.println(numero+ "X3=" +numeroXtres);
         System.out.println(numero+ "X4=" +numeroXquatro);
         System.out.println(numero+ "X5=" +numeroXcinco);
         System.out.println(numero+ "X6=" +numeroXseis);
         System.out.println(numero+ "X7=" +numeroXsete);
         System.out.println(numero+ "X8=" +numeroXoito);
         System.out.println(numero+ "X9=:" +numeroXnove);
         System.out.println(numero+ "X10=" +numeroXdez);
                                                                                
        scanner.close();
    }
}