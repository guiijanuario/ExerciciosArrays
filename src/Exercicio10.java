import java.util.Arrays;

public class Exercicio10 {
    public static void main(String[] args) {

        System.out.println("[---- Calcula a média dos números impares ----]");

        int[] A = new int[]{2,4,3,7,21,13,15,17,19,23};

        System.out.println("O números do vetor é: " + Arrays.toString(A));

        int quantidadeImpar = 0;
        int somaImpar = 0;
        for (int elemento : A){
            if (elemento % 2 != 0){
                somaImpar += elemento;
                quantidadeImpar++;
            }
        }
        double media = (double)somaImpar/quantidadeImpar;
        System.out.println("A média dos impares é: " + media);
    }
}
