package atividade2;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número");
        numero = scan.nextInt();
        if(numero < 0){
            System.out.println("O número é menor que zero ");
        }        
        else if(numero == 0){
            System.out.println(" O número é igual a zero ");
        }
        else{
            System.out.println("O número é maior que zero ");
        }
    }
}
