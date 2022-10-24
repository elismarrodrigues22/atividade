package atividade3;
import java.util.Scanner;
public class questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 1;        
        String palavraDigitada = "";
        String palavra = "JAVA-2022";    
        int qtdTentativas = 4;

        System.out.println("TESTE DE DIGITAÇÃO ");   
    
          
        
        System.out.println("Digite a palavra JAVA-2022 ");
        palavraDigitada = scan.nextLine();
        switch(palavraDigitada){
                    case "JAVA-2022":
                    System.out.println("Palavra Correta");
                    break;

                    default:
                    System.out.println("Palavra Incorreta Tente Novamente");
                    while(qtdTentativas > 0 || palavraDigitada.equals(palavra)){
                        System.out.println(" Quantidade de tentativas " + qtdTentativas);
                        System.out.println("Digite a palavra JAVA-2022 ");
                        palavraDigitada = scan.nextLine();
                        qtdTentativas --;
                       
                    }
        }

     

    }
    

}
