package atividade1;
import java.util.Scanner;
public class Questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float vlConta;
        int qtdPessoas;
        float vlPraCada;

        System.out.println(" Informe o valor da conta ");
        vlConta = scan.nextFloat();
        System.out.println(" Informe a quantidade de Pessoas pra dividir a conta ");
        qtdPessoas = scan.nextInt();
        vlPraCada = vlConta / qtdPessoas;

        System.out.println(" Cada Pessoa vai pagar : " + vlPraCada);

        
    }    

}
