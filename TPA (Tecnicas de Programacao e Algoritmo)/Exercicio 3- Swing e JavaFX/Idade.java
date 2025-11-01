package com.mycompany.swingjavax;
/**
 *
 * @author D3
 */
   import javax.swing.JOptionPane;
public class Idade{
    public static void main(String[] args) {
    
    //Entrada de informações e variáveis
        int ano=Integer.parseInt(JOptionPane.showInputDialog ("Digite sua idade:"));
        int mes=Integer.parseInt(JOptionPane.showInputDialog ("Digite os meses de sua idade:"));
        int dia=Integer.parseInt(JOptionPane.showInputDialog ("Digite os dias de sua idade:"));
        int aniversarioEmDias=(ano*365)+(mes*30)+dia;
    //Imprimindo resultado
        JOptionPane.showMessageDialog(null, "O resultado e:" +aniversarioEmDias);
    }
}