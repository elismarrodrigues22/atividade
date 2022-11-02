package atividade3;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class joption {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        JOptionPane.showMessageDialog(null,"Olá");
        String nome = JOptionPane.showInputDialog("Digite Seu Nome");
        JOptionPane.showMessageDialog(null," Olá " + nome);
    }
}
