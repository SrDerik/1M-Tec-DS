package com.mycompany.matrizes1;
import java.util.Scanner;
/**
 *
 * @author d3
 */
public class Matrizes1 {

    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int somaPares = 0;
        int qtdPares = 0;

        System.out.println("Digite os 16 valores da matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    somaPares += matriz[i][j];
                    qtdPares++;
                }
            }
        }
        //
        double media = qtdPares > 0 ? (double) somaPares / qtdPares : 0;

        System.out.println("\nSoma dos números pares: " + somaPares);
        System.out.println("Média dos números pares: " + media);

        sc.close();
        }
    }

