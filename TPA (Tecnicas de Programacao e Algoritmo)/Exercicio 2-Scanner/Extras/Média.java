package com.mycompany.primos;
//Import
 import java.util.Scanner;
/**
 *
 * @author D3
 */
   
public class Primos {
    public static void main(String[] args) {
        //Scanner
   Scanner scanner =new Scanner(System.in);
        //Leitura notas
        System.out.print("Digite sua primeira nota: ");
         double notaUm= scanner.nextDouble();
            System.out.print("Digite sua segunda nota: ");
         double notaDois= scanner.nextDouble();
            System.out.print("Digite sua terceira nota: ");
         double notaTres= scanner.nextDouble();
            System.out.print("Digite sua quarta nota: ");
         double notaQuatro= scanner.nextDouble();
         //Cálculos notas
         double notaSomada= notaUm+notaDois+notaTres+notaQuatro;
         double notaFinal= notaSomada / 4;
         //imprimindo resultados
        if (notaFinal >=7) {
           System.out.println("Sua media e " +notaFinal+ ", logo voce passou!");
        }
        else {
           System.out.println("Sua media e "+notaFinal+ ", logo nao passou...");            
        }
        scanner.close();
    }
}

