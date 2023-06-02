import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[----- Inverter o número digitado -----]");
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Você digitou o número " + numero);
        String numeroString = String.valueOf(numero);
        String reversao = "";

        for (int i = (numeroString.length() - 1); i >= 0; i--) {
            reversao += numeroString.charAt(i);
        }

        System.out.println("Segue o número em ordem inversa sem conversão em int: " + reversao);

    }
}
