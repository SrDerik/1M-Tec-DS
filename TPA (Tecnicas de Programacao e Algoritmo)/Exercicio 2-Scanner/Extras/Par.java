package com.mycompany.ParOuImpar;

//Import
 import java.util.Scanner;
/**
 *
 * @author D3
 */
   
public class ParOuImpar {
    public static void main(String[] args) {
        //Scanner
         Scanner scanner =new Scanner(System.in);
        //Leitura do número
        System.out.print ("Digite o numero: ");
         int numero=scanner.nextInt();
        //Exibição de resultados
        if (numero%2 == 0){
             System.out.println("O "+numero+" e par!");
        }
        else {
              System.out.println("O "+numero+" e impar!");
            }
          scanner.close();
    }
}
