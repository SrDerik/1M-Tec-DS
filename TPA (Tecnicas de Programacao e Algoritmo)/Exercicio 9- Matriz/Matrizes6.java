
package com.mycompany.matrizes6;

/**
 *
 * @author d3
 */
public class Matrizes6 {

    public static void main(String[] args) {
         
        // Figura-A
    	System.out.println("\nFigura-A");
    	
    	for (int i = 0; i < 4; i++) {
    	    for (int j = 0; j < 4; j++) {
    	        System.out.print("* ");
    	    }
    	    System.out.println();
    	}


        // Figura-B
        System.out.println("\nFigura-B");
        
        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
  
               // Primeira ou última linha
                if (i == 0 || i == 2) {
                   System.out.print("* ");
                 }
        // Linha do meio
             else {
                 if (j == 0 || j == 2)
                System.out.print("* ");
            else
                System.out.print("  "); // meio vazio
              }
           }
            System.out.println();
        }


        // Figura-C
        System.out.println("\nFigura-C");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } 
      }
}
