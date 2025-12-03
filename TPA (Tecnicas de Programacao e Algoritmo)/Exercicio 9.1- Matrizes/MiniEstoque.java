package com.mycompany.miniestoque;
import java.util.Scanner;
/**
 *
 * @author d3
 */
public class MiniEstoque {

    public static void main(String[] args) {
           Scanner leia = new Scanner(System.in);
        // Criando a string e fazendo o "header"
             String [][] estoque= new String[3][4];
                 estoque[0][0] = "Produto:";          
                 estoque[0][1] = "Quantidade:";
                 estoque[0][2] = "Preço:";
                 estoque[0][3] = "Valor total:";
               //for pra pegar os items
            for (int i = 1; i < estoque.length; i++) {
             System.out.println("Qual produto você gostaria de comprar?");
                 estoque[i][0]= leia.nextLine();
        
             System.out.println("Quantidade:");
                 estoque[i][1]= leia.nextLine();
             
             System.out.println("Preço");
                 estoque[i][2]= leia.nextLine();
                 //Calculo para conseguir o valor total
               double quantidade= Double.valueOf(estoque[i][1]);
               double preco= Double.valueOf(estoque[i][2]);
             
               double valorTotal = quantidade * preco;
                 estoque[i][3] = String.valueOf(valorTotal);
        }
            
            //Estrutura for para sair com o resultado
        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
             
               System.out.printf("| %-12s ", estoque[i][j]);
            }
               System.out.println(" ");
      }
    }
}
