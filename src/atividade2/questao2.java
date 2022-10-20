package atividade2;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println(" Digite o primeiro numeo ");
        num1 = scan.nextInt();
        System.out.println(" Digite o segundo numeo ");
        num2 = scan.nextInt();
        System.out.println(" Digite o terceiro numeo ");
        num3 = scan.nextInt();

        if((num1 > num2) && (num1 > num3)){
            System.out.println(" O número " + num1 + " é maior");
        }else if((num2 > num1) && (num2 > num3)){
            System.out.println(" o numero " + num2 + " é maior");
        }else{
            System.out.println(" o numero " + num3 + " é maior ");
        }
        //COMPARAÇÃO NUMERO MENOR

        if((num1 < num2) && (num1 < num3)){
            System.out.println(" O número " + num1 + " é menor");
        }else if((num2 < num1) && (num2 < num3)){
            System.out.println(" o numero " + num2 + " é menor");
        }else{
            System.out.println(" o numero " + num3 + " é menor");
        }

    }
}
