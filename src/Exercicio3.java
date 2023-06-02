import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        System.out.print("Digite o " + "1ª " + "número a ser inserido ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o número a ser inserido: ");
        int num2 = scanner.nextInt();
        int maior = 0;
        int menor = 0;

        if (num1 > num2) {
            maior = num1;
            menor = num2;
            listaNumeros.add(maior);
            listaNumeros.add(menor);
        } else {
            maior = num2;
            menor = num1;
            listaNumeros.add(maior);
            listaNumeros.add(menor);
        }

        System.out.println("O Resultado ficou assim: " + listaNumeros);

    }
}
