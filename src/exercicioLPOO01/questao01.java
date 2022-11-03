package exercicioLPOO01;
import java.util.Scanner;
public class questao01 {
    public static void main(String[] args) {
        Carro carro = new Carro(" FIAT ", " PALIO ");
        
        carro.printStatus();
        carro.acelerar(20);        
        carro.acelerar(50);
        carro.acelerar(200);        
        carro.frear(100);
        carro.frear(150);
        carro.printStatus();
    }
}
