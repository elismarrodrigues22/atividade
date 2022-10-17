package atividade1;
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int numero,antecessor,sucessor;

    System.out.println(" Informe um número ");
    numero = scan.nextInt();

    antecessor = numero - 1;
    sucessor = numero + 1;

    System.out.println(" O número informado foi : " + numero);
    System.out.println(" O antecessor é : " + antecessor);
    System.out.println(" O Sucessor é " + sucessor);

    scan.close();
    }

    
}
