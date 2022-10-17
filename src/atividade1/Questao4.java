package atividade1;
import java.util.Scanner;
public class Questao4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        float valorHora,salario;
        int qtdHoras;

        System.out.println(" Digite o nome do Colaborador ");
        nome = scan.nextLine();
        System.out.println(" Digite o valor da Hora trabalhada ");
        valorHora = scan.nextFloat();
        System.out.println(" Digite a quantidade de Horas que trabalhou ");
        qtdHoras = scan.nextInt();

        salario = qtdHoras * valorHora;

        System.out.println( nome + " vai receber de salário " + salario);

        scan.close();
    }
}
