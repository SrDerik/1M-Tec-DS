package nomesOrdenados.nomesOrdenados;
/*@Autor: Derik Soares Batinga */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class App 
{
	
    public static void main( String[] args ) {
    	
    	Scanner Leia = new Scanner (System.in);
    	
    	 /* Entrada de nomes */
        System.out.println("Digite os nomes separados por espaço:");
        String entrada = Leia.nextLine();

        /* Divide a string em um array de nomes */
        String[] nomes = entrada.split(" ");
   
    	/* Organizacao de A-Z, : serve para comparar */
        Arrays.sort(nomes);
       	System.out.println("Aqui vai em ordem de A-Z a lista de nomes:" );
         for (String nome : nomes) {
            System.out.println(nome);
         }
         
         /* Organizacao de Z-A, : serve para comparar */
           Arrays.sort(nomes, Collections.reverseOrder());
          	System.out.println("Aqui vai em ordem de Z-A a lista de nomes:" );
            for (String nomereverso : nomes) {
               System.out.println(nomereverso);
            }
    }
}