package atividade3;
import java.util.Scanner;
public class questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 1;        
        String palavraDigitada = "";
        String palavra = "JAVA-2022";    
        int qtdTentativas = 4;
    //OBSERVAÇÃO : TODA VEZ QUE REPETE O SEGUNDO LOOP A VARIÁVEL palavraDigitada FICA SALVO 
      //  O QUE FOI DIGITADO ANTES E NÃO PARA PARA PERGUNTAR NOVAMENTE JÁ IMPRIME DIRETAMENTE
    
        System.out.println("TESTE DE DIGITAÇÃO ");   
    
          
        
       // System.out.println("Digite a palavra JAVA-2022 ");
      //  palavraDigitada = scan.nextLine();
     //   while(opcao != 0  || qtdTentativas < 1){
            System.out.println("Digite a palavra JAVA-2022 ");
            palavraDigitada = scan.nextLine();
        if(palavraDigitada.equals(palavra)){
            System.out.println("Palavra Correta");
        }else{
            System.out.println("Palavra Errada!");
            qtdTentativas --;
            System.out.println("Você tem " + qtdTentativas + "Tentativas restantes");
        }
      //  System.out.println("Informe 1 pra continuar ou zero 0 pra sair");
      //  opcao = scan.nextInt();
       
        
 //      }

    }
    

}
