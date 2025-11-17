package com.mycompany.swingjavax;
/**
 *
 * @author D3
 */
   import javax.swing.JOptionPane;
public class Pecas{
    public static void main(String[] args) {
         //Entrada do ipi
         double ipi=Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a porcentagem do imposto sobre produto industializado:"));
        //Entrada das informações da peça 1
        String codigoProduto=JOptionPane.showInputDialog("Código da peça 1:"); //Não é feito a leitura
        double valorProduto=Double.parseDouble(JOptionPane.showInputDialog("Valor unitário da peça :"));
        int quantiaProduto=Integer.parseInt(JOptionPane.showInputDialog("Quantidade de peças:"));
        //Entrada das informações da peça 2
        String codigoProduto2=JOptionPane.showInputDialog("Código da peça 2:"); //Não é feito a leitura
        double valorProduto2=Double.parseDouble(JOptionPane.showInputDialog("Valor unitário da peça (2):"));
        int quantiaProduto2=Integer.parseInt(JOptionPane.showInputDialog("Quantidade de peças (2):"));
        //Cálculo
        double total=(valorProduto*quantiaProduto)+(valorProduto2*quantiaProduto2) * (1+ipi/100);
        //Saída do resultado
        JOptionPane.showMessageDialog(null, String.format("Valor total a pagar: R$" +total));
    }
}
