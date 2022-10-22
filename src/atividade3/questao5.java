package atividade3;
import java.util.Scanner;
public class questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int idade;
    int maior =0;
    int menor=0;
     
    for(int i=1; i<=5; i++){
        System.out.println(" Informe a idade");
        idade = scan.nextInt();

        if(idade>=18){
            maior++;
        }else{
            menor++;
        }
        
    }
    System.out.println( " quantidade maiores : " + maior + " menores : " + menor);

    }

    
}
