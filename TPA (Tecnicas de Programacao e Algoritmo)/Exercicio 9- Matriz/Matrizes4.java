package com.mycompany.matrizes4;
import java.util.Scanner;
/**
 *
 * @author d3
 */
public class Matrizes4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        int pares = 0;
        int impares = 0;

        boolean repetido = false;

        System.out.println("Digite os 15 valores da matriz 3x5:");

        // Preencher a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Contar pares/ímpares
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                if (matriz[i][j] % 2 == 0)
                    pares++;
                else
                    impares++;

            }
        }

        // Verificar repetidos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                int atual = matriz[i][j];

                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 5; y++) {

                        if (!(x == i && y == j)) {

                            if (matriz[x][y] == atual) {
                                repetido = true;
                                break;
                            }
                        }
                    }
                }
            }
        }

        // Resultados
        System.out.println("\nRESULTADOS");
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);

        if (repetido)
            System.out.println("A matriz possui números repetidos.");
        else
            System.out.println("A matriz NÃO possui números repetidos.");

        sc.close();
    }
}
