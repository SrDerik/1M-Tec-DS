package com.mycompany.swingjavax;
/**
 *
 * @author D3
 */
   import javax.swing.JOptionPane;
public class Medias{
    public static void main(String[] args) {
        //Variáveis e informações
           JOptionPane.showMessageDialog(null, "Os números utilizados para o cálculo da média serão: 4, 5 e 6");
           int quatro=4, cinco=5, seis=6; //Para o cálculo da média
           JOptionPane.showMessageDialog(null, "Os números utilizados para o cálculo da média aritmética serão: 7, 8 e 9");
           int sete=7, oito=8, nove=9;   //Para o cálculo da média aritmética
        //Cálculos
        //Média Aritmética
         int MediaAritmetica=(sete+nove+oito)/3;
        //Média
         int Media=(quatro+cinco+seis)/3;
        //Soma das médias
         int SomaDasMedias=(Media+MediaAritmetica);
        //Médias das médias
         int MediaDasMedias=SomaDasMedias/2;
        //Imprimindo resultados
         JOptionPane.showMessageDialog(null, "Média:"+Media);
         JOptionPane.showMessageDialog(null, "Soma das médias:"+SomaDasMedias);
         JOptionPane.showMessageDialog(null, "Média das médias:"+MediaDasMedias);
    }
}
