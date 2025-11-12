package numerosParesImpares.numerosParesImpares;
import java.util.Scanner;
/* @Autor: Derik Soares Batinga */
public class App 
{
    public static void main( String[] args )
    {
    	  /* Declarações das variaveis*/
       Scanner input=new Scanner(System.in);
             int [] numeros = new int [10];
             int [] pares = new int [10];
             int contadoresPares=0;
             int [] impares = new int [10];
             int contadoresImpares=0;
          /* Pegando os 10 numeros, */
       System.out.println("Digite 10 numeros:");
             for (int i=0; i< numeros.length ; i++){
                  System.out.println("Numero "+(i+1)+ ": ");
                     numeros[i]= input.nextInt();
          /* Vendo pares */    
              if (numeros[i]%2==0){
                  pares[contadoresPares]=numeros[i];
                  contadoresPares++;
                 } 
           /* Vendo impares */
              if (numeros[i]%2 !=0) {
                  impares[contadoresImpares]=numeros[i];
                  contadoresImpares++;
                 }
              }
           /* Printando pares */
              System.out.println("\nNúmeros pares: ");
                   for (int i = 0; i < contadoresPares; i++) {
                   System.out.println(pares[i]);
              }
           /* Printando impares */
              System.out.println("\nNúmeros impares: ");
                   for (int i =  0; i < contadoresImpares; i++) {
                   System.out.println(impares[i]);       
        }
    }
}
