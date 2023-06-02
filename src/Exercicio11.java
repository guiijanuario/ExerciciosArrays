import java.util.Arrays;

public class Exercicio11 {
    public static void main(String[] args) {

        System.out.println("[---- Pegar o maior e o maior número de um vetor ----]");
        int[] A = new int[]{12,18,22,24,15,34,56,56,64,34};

        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int posicaoMenor = 0;
        int posicaoMaior = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < menorIdade) {
                menorIdade = A[i];
                posicaoMenor = i;
            }

            if (A[i] > maiorIdade) {
                maiorIdade = A[i];
                posicaoMaior = i;
            }
        }

        System.out.println("As idades do vetor é: " + Arrays.toString(A));
        System.out.println("Menor idade é: " + menorIdade + ", posição é: " + posicaoMenor);
        System.out.println("Maior idade é: " + maiorIdade + ", posição é: " + posicaoMaior);

    }
}
