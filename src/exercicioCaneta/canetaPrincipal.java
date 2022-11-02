package exercicioCaneta;

public class canetaPrincipal {
    public static void main(String[] args) {
        caneta caneta1 = new caneta("Bic","Azul");
      
        caneta1.status();
        caneta1.rabiscar();
        caneta1.status();
        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();
        caneta1.status();
        caneta1.destampar();
        caneta1.rabiscar();     
        caneta1.status();   
        caneta1.destampar();
        caneta1.escrever("Elismar Rodrigues de Oliveira");
        caneta1.status();   
    }
}
