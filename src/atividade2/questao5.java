package atividade2;
import java.util.Scanner;
public class questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

   int idade;     
   System.out.println(" Digite a idade ");
   idade = scan.nextInt();

   if(idade < 16){
        System.out.println(" Não pode nem votar e nem dirigir ");
    }else if(idade >=16 && idade < 18){
        System.out.println(" Pode votar mas não pode dirigir");
    }
    else if(idade >=18 ){
        System.out.println(" Pode votar e pode dirigir ");
    }



    }
    

}
