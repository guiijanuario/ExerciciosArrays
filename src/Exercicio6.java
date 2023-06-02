import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[----- Ver se o número é múltiplo de 5 e 7 -----]");
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 5 == 0 && numero % 7 == 0) {
            System.out.println("Este número é múltiplo de 5 e 7");
        } else {
            System.out.println("Este número não é múltiplo de 5 e 7");
        }

    }
}
