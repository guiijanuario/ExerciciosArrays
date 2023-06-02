import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(5);
        numeros.add(1);
        numeros.add(6);
        numeros.add(2);

        System.out.println("Lista: " + numeros);

        System.out.print("Digite o número a ser inserido: ");
        int elemento = scanner.nextInt();

        System.out.print("Digite a posição de inserção (índice): ");
        int posicao = scanner.nextInt();

        if (posicao >= 0 && posicao <= numeros.size()) {
            numeros.add(posicao, elemento);
            System.out.println("Elemento inserido com sucesso!");
            System.out.println("Lista atualizada: " + numeros);
        } else {
            System.out.println("Posição inválida. A posição deve estar entre 0 e " + numeros.size());
        }
    }
}
