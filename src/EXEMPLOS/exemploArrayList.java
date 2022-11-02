package EXEMPLOS;

public class exemploArrayList {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 3;
        numeros[1] = 2;
        numeros[2] = 1;

        for(int i : numeros){
            System.out.println(i);
        }
    }
}
