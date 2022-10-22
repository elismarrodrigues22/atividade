package atividade3;

import java.util.Scanner;
public class questao01 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = 0;
    int opcao = 10;
    int resultado;
    int numero=0;

    
    
    
  
    while(opcao != 0){
        System.out.println(" Digite uma operação para a tabuada  \n  1-SOMAR 2-MULTIPLICAR 3-SUBTRAIR 4-DIVIDIR 0-SAIR");
    opcao = scan.nextInt();
        
        if(opcao>=0 && opcao < 5){
            System.out.println(" Digite o número para a tabuada  ");
        numero = scan.nextInt();
      
          switch(opcao){
                    case 1:
                    System.out.println(" VOCÊ ESCOLHEU SOMAR ");
                    for(i = 1; i <=10; i++ ){
                    resultado = i + numero;
                        System.out.println( numero + " + " + i + " = " + resultado);
                    }
                    break;

                    case 2:
                    System.out.println(" VOCÊ ESCOLHEU MULTIPLICAR ");
                    for(i = 1; i <=10; i++ ){
                    resultado = i * numero;
                        System.out.println( numero + " X " + i + " = " + resultado);
                    }
                    break;

                    case 3:
                    int subtrair=0;
                    System.out.println(" VOCÊ ESCOLHEU SUBTRAIR");
                    for(i = 1; i <=10; i++ ){
                    subtrair = numero+i;
                    resultado = subtrair - numero;
                        System.out.println( subtrair + " - " + numero + " = " + resultado);
                        
                    }
                    break;

                    case 4:
                    int dividir=0;
                    System.out.println(" VOCÊ ESCOLHEU DIVIDIR");
                    dividir = numero;
                    for(i = 1; i <=10; i ++ ){
                    
                    resultado = dividir / numero;
                        System.out.println( dividir + " / " + numero + " = " + resultado);
                    dividir = dividir + numero;  

                    }
                    break;

                    

                    default:
                            
                }
            }else{
                System.out.println(" Número Incorreto Tente Novamente \n ");

                System.out.println(" Digite uma operação para a tabuada  \n  1-SOMAR 2-MULTIPLICAR 3-SUBTRAIR 4-DIVIDIR 0-SAIR");
                opcao = scan.nextInt();
   }

}
   System.out.println(" Encerrando o programa ");

}
    
}
