package com.mycompany.matrizes5;
import java.util.Scanner;
/**
 *
 * @author d3
 */
public class Matrizes5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[4][4];

        System.out.println("Digite os 16 valores decimais da matriz 4x4:");

        // Preencher matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        // Diagonal principal
        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i]);
        }

        // Diagonal secundária
        System.out.println("\nDiagonal Secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][3 - i]);
        }

        sc.close();
    }
}
