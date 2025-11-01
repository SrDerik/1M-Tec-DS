
package com.mycompany.temperatura;
//Import
 import java.util.Scanner;
/**
 *
 * @author D3
 */
   
public class Temperatura {
    public static void main(String[] args) {
        //Scanner
         Scanner scanner =new Scanner(System.in);
        //Leitura graus celsius
        System.out.print ("Digite o numero em graus celsius: ");
         double celsius=scanner.nextDouble();
         double kelvin=274.15;
         double fahrenheit=1.8+32;
        //Cálculos
         double kelvinResultado= celsius+kelvin;
         double fahrenheitResultado= celsius*fahrenheit;
        //Exibição do resultado
         System.out.println("Em fahrenheit isto e:" +fahrenheitResultado);
         System.out.println("Em kelvin isto e:"+ kelvinResultado);
         scanner.close();
    }
}
