package com.mycompany.matrizes3;
import java.util.Scanner;
/**
 *
 * @author d3
 */
public class Matrizes3 {

    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int somaImpares = 0;

        int[] somaLinhas = new int[5];
        int[] somaColunas = new int[5];

        System.out.println("Digite os 25 valores da matriz 5x5:");

        //Matriz e cálculos para ver se são pares
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                matriz[i][j] = sc.nextInt();

                // Soma dos ímpares
                if (matriz[i][j] % 2 != 0) {
                    somaImpares++;
                }

                // Soma da linha
                somaLinhas[i] += matriz[i][j];

                // Soma da coluna
                somaColunas[j] += matriz[i][j];
            }
        } 

        // Resultados
        System.out.println("\nRESULTADOS");

        System.out.println("Soma dos números ímpares: " + somaImpares);

        System.out.println("\nSoma das linhas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
        }

        System.out.println("\nSoma das colunas:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }

        sc.close();
    }
}
