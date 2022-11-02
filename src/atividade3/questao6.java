package atividade3;
import java.util.Scanner;
import java.util.ArrayList;
public class questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // 6. Escreva um programa que vai ler 5 números o sistema vai mostrar
       //  o maior o menor a soma e a média dos números digitados.
       
       int i;
       int num;
       int soma=0;
       float media=0;
       int maior=0;
       int  menor=1000;
       for(i =1; i<=5; i++){
        System.out.println("Digite um número");
        num = scan.nextInt();

            if(num >= maior){
                
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
            soma = soma + num;
       }
       System.out.println(" maior = " + maior);
       System.out.println(" menor = " + menor);
       System.out.println(" soma = " + soma);
       System.out.println(" média = " + (soma/5));
    }
}
