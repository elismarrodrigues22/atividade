package atividade1;
import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        System.out.println(" Digite um Nome ");
        nome = scan.nextLine();

        System.out.println(" Olá " + nome + " Seja Bem Vindo ");

        scan.close();
        }
}
