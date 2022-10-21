package atividade2;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite um número");
        num = scan.nextInt();
        if(num < 0){
            System.out.println("O número é menor que zero ");
        }        
        else if(num == 0){
            System.out.println(" O número é igual a zero ");
        }
        else{
            System.out.println("O número é maior que zero ");
        }
    }
}
