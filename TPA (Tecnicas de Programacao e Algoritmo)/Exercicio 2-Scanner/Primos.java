
package com.mycompany.primos;
     //import
import java.util.Scanner;
/**
 *
 * @author D3
 */

public class Primos {
    public static void main(String[] args) {
         //Scanner
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
              //Leitura números
            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();
             //Foi criado um boolean para verificar se é falso ou verdadeiro 
            boolean Primo = true;
             //Número 1 não pode ser primo
            if (numero <= 1) {
                Primo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        Primo = false;
                        break;
                    }
                }
            }

            if (Primo) {
                System.out.println(numero + " e primo!");
            } else {
                System.out.println(numero + " não e primo!");
            }

            System.out.print("Deseja verificar outro numero? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }
}