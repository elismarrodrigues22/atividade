package atividade2;
import java.util.Scanner;
public class questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    float peso;
    float altura;
    float imc;
     System.out.println(" Digite a o peso ");
    peso = scan.nextFloat();
    System.out.println(" Digite a altura ");
    altura = scan.nextFloat();

    imc = peso /(altura * altura);

    if(imc < 20){
        System.out.println(" abaixao do normal ");
    }else if((imc >20) && (imc <=25)){
        System.out.println(" Normal ");
    }else if((imc >25) && (imc <=30)){
        System.out.println(" Sobrepeso ");
    }else if((imc >30) && (imc <= 35)){
        System.out.println(" obesidade leve ");
    }else if((imc >35) && (imc <=40)){
        System.out.println(" obesidade moderada ");
    }else if(imc > 40 ){
        System.out.println(" obesidade morbida");
    }

    }

    
}
