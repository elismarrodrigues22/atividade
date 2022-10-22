package atividade3;
import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.println(" Informe o primeiro número : ");
        num1 = scan.nextInt();
        System.out.println(" Informe o segundo número : ");
        num2 = scan.nextInt();
        if(num1 > num2 ){
            resultado = num1-num2;
        for(int i=0; i<=resultado; i++){
            int mostrar = 0;
            mostrar = num2+i;

            System.out.println(mostrar);

        }
    }else if(num1<num2){
        resultado = num2-num1;
        for(int i=0; i<=resultado; i++){
            int mostrar = 0;
            mostrar = num1+i;

            System.out.println(mostrar);
           

    }
}
}
}