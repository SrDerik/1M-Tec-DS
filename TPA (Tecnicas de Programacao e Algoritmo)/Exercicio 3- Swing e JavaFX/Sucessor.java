package com.mycompany.votacao;
import javax.swing.*;
import java.util.Random;
/**
 *
 * @author D3
 */
public class Votacao {

    public static void main(String[] args) {
        //Iniciação do randomizador
     Random gerador =new Random();
        int votacao=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma de tres portas..."));
        int dado=gerador.nextInt(10)+1;
          
        if (votacao==1) {
         JOptionPane.showMessageDialog(null, "Parabens, você passou!");
         JOptionPane.showMessageDialog(null, "Agora vamos jogar o dado...");
             if (dado==10) {
                 JOptionPane.showMessageDialog(null,"Quanta sorte!Você tirou"+dado);
             }else (dado=>7){
              JOptionPane.showMessageDialog(null,"Você tirou"+dado);
             } else if (dado=<6){
          }
        } 
        else {     
         JOptionPane.showMessageDialog(null, "Escolha errada...");
         JOptionPane.showMessageDialog(null, "Fim de jogo");
        }
        
    }
}