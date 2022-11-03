package exercicioLPOO01;

import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;
   

    public Carro(String marca, String modelo){       
        this.marca = marca;
        this.modelo = modelo;  
        velocidadeAtual = 0;
    }

    public void acelerar(int valor){
        if((velocidadeAtual >=0 && velocidadeAtual <=200) && (velocidadeAtual+valor <= 200)){
        System.out.println(" Acelerando ");
        velocidadeAtual += valor;
        System.out.println(" Velocidade Atual " + velocidadeAtual);
    }else{
        System.out.println(" A velocidade máxima do veículo é 200 km por hora");        
        int contador = 200 - velocidadeAtual;
        velocidadeAtual += contador;
        System.out.println(" Velocidade Atual " + velocidadeAtual);
    }
    
    }

    public void frear(int valor){
        velocidadeAtual -= valor;
        if(velocidadeAtual <= 200 && velocidadeAtual > 0 ){
            System.out.println(" Freando ");
            System.out.println(" Velocidade Atual " + velocidadeAtual);
        }
            
           if(velocidadeAtual < 0 ){
                velocidadeAtual = 0;
                System.out.println(" Velocidade Atual " + velocidadeAtual);
            }
            
        }
    

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", velocidadeAtual=" + velocidadeAtual + "]";
    }

    public void printStatus(){
        System.out.println(toString());
    }
  


}
