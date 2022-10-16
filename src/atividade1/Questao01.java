package atividade1;
import java.util.Scanner;
public class Questao01 {
    public static void main(String[] args) {
        float nota1, nota2,media;

        System.out.println(" PROGRAMA PARA LER DUAS NOTAS ");

        Scanner scan = new Scanner(System.in);

        System.out.println(" Informe a primeira Nota ");
        nota1 = scan.nextFloat();
        System.out.println(" Informe a segunda Nota ");
        nota2 = scan.nextFloat();

        media = (nota1 + nota2) /2;

        if(media > 7){
           System.out.println(" Aprovado ! ");
        }else{
            System.out.println(" Reprovado ");
        }

        System.out.println(" Média "+ media);
          scan.close();
    }
}
