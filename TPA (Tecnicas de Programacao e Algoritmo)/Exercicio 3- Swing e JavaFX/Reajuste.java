package com.mycompany.swingjavax;
/**
 *
 * @author D3
 */
   import javax.swing.JOptionPane;
public class Reajuste{
    public static void main(String[] args) {
        //Entrada do salário
         double salario=Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o seu salário em reais (apenas os números)"));
        //Cálculos
         double Reajuste=salario*1.01;
        //Imprimindo resultado
         JOptionPane.showMessageDialog(null, "O seu salário com reajuste seria:R$"+Reajuste);
    }
}
