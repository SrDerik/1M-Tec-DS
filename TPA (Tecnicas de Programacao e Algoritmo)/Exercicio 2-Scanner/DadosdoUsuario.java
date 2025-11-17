package com.mycompany.dadosdousuario;
//Import
 import java.util.Scanner;
/**
 *
 * @author D3
 */
   
public class DadosdoUsuario {
    public static void main(String[] args) {
        //Scanner
   Scanner scanner =new Scanner(System.in);
        //Leitura notas
         System.out.print("Insira seus nome completo: ");
             String nome= scanner.nextLine();
         System.out.print("Insira sua data de nascimento: ");
             String nascimento= scanner.nextLine();
         System.out.print("Insira seu curso: ");
             String curso= scanner.nextLine();
         System.out.print("Insira sua serie: ");
             String serie= scanner.nextLine();
         System.out.print("Insira seu altura: ");
             String altura= scanner.nextLine();
         System.out.print("Insira seu peso: ");
             String peso= scanner.nextLine();
         
       //Exibição de resultados
         System.out.println (nome+ ", nasceu em " +nascimento+ ", esta cursando " +curso+ ", atualmente no " +serie+ ", tem " +altura+ " e " +peso);
      
   scanner.close();
    }
}
