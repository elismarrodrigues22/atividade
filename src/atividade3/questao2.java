package atividade3;
import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mensagem = "";
        int numero;
        int i;

        System.out.println(" Escreva uma mensagem : ");
        mensagem = scan.nextLine();
        System.out.println(" Informe a quantidade de vezes que a mensagem vai repetir : ");
        numero = scan.nextInt();

        for(i=0; i<=numero-1; i++){
            System.out.println(mensagem);
        }


    }
}
