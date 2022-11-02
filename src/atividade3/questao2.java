package atividade3;
import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mensagem = "";
        int numero;
        int i;
       // 2. Escreva um programa que vai ler uma mensagem e um número,
        // o sistema vai repetir a mensagem digitada x vezes o número digitado.

        System.out.println(" Escreva uma mensagem : ");
        mensagem = scan.nextLine();
        System.out.println(" Informe a quantidade de vezes que a mensagem vai repetir : ");
        numero = scan.nextInt();

        for(i=1; i<=numero; i++){
            System.out.println(mensagem);
        }


    }
}
