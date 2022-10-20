package atividade2;
import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        System.out.println(" Digite a idade ");
        idade = scan.nextInt();

        if(idade >= 16){
            System.out.println("Pode votar ");
        }else{
            System.out.println("Não pode votar");
        }

    }
}
