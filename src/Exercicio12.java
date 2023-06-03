import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[---- Pegar o maior e o maior número de um vetor ----]");
        System.out.println("[---- Insira 20 números ----]");

        int[] A = new int[20];

        for (int i = 0; i < 20; i++){
            System.out.println("Insira o " + (i+1) + "ª número: ");
            A[i] = scanner.nextInt();
        }

        int[] pares = new int[15];
        int[] impares = new int[15];

        int indexPares = 0;
        int indexImpares = 0;
        for(int i = 0; i < A.length;i++){
            if(A[i] % 2 == 0){
                pares[indexPares] += A[i];
                indexPares++;
            } else {
                impares[indexImpares] += A[i];
                indexImpares++;
            }
        }

        System.out.println("Os elementos inseridos foram: " + Arrays.toString(A));
        System.out.println("Os elementos pares: " + Arrays.toString(pares));
        System.out.println("Os elementos impares: " + Arrays.toString(impares));

    }
}
