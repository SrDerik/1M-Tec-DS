package com.mycompany.swingjavax;
/**
 *
 * @author D3
 */
   import javax.swing.JOptionPane;
public class SalarioMinimo{
    public static void main(String[] args) {
        //Entrada do salário
        double salario=Double.parseDouble(JOptionPane.showInputDialog("Insira o seu salário (apenas use números):"));
        //Cálculo do salário
        double salarioMinimo=salario/1518;
        // Saída do resultado
        JOptionPane.showMessageDialog(null, "Total de salários minimos:" +salarioMinimo);
    }
}
