package exercicioCaneta;

public class caneta {
    private  String modelo;
     private  String cor;
     private int carga;
    private boolean tampada = true;

    // metodo Construtor

    public caneta(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
        tampada = true;
        this.carga = 100;
    }

    void rabiscar(){
       escrever("Rabisco");
    } 
    void tampar(){
        System.out.println("Caneta tampada");
        tampada = false;
    }   

    void destampar(){
        System.out.println("Caneta destampada ");
        tampada = true;
    }

    void escrever(String texto){
        if(tampada){
            System.out.println(texto);
            carga -= texto.length();
        }
    }

    @Override
    public String toString() {
        return "caneta [modelo=" + modelo + ", cor=" + cor + ", carga=" + carga + ", tampada=" + tampada + "]";
    }
    
    public void status(){
        System.out.println(toString());
    }

}
