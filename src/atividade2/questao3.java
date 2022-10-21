package atividade2;
import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        System.out.println(" Digite a idade ");
        idade = scan.nextInt();
        String mensagem = ("você tem  " + idade + " de idade já pode votar " );
        if(idade >= 16){
            System.out.println(mensagem);
        }else{
            System.out.println("Não pode votar");
        }

    }
}
