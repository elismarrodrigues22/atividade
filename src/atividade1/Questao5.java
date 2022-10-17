package atividade1;
import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float valorJantar,valorTotal;
        final int porcento = 10;
        float taxaGarcom;

        System.out.println(" Informe o valor do Jantar");
        valorJantar = scan.nextFloat();
        taxaGarcom = (valorJantar * porcento)/100;
        valorTotal = valorJantar + taxaGarcom;

        System.out.println(" Taxa do Garçom : " + taxaGarcom);
        System.out.println(" valor da refeição : " + valorJantar);
        System.out.println(" Valor total : " + valorTotal );

    }
}
