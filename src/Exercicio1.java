import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("[----- Gerar uma lista -----]");

        System.out.println("Insira o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.println("Insira o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int maior, menor = 0;

        if(num1 > num2){
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }

        if(maior == menor){
            System.out.println("Não é possivel colocar 2 números iguais.");
            return;
        }

        for (int i = menor + 1; i <= maior; i++) {
            numeros.add(i);
        }

        System.out.println("A lista com os números ficou da seguinte forma: " + numeros);

        System.out.println("Digite o número que você deseja remover: ");
        int numRemover = scanner.nextInt();
        int indexNumRemover = numeros.indexOf(numRemover);

        for(int numero : numeros){
            if(indexNumRemover == numero){
                numeros.remove(indexNumRemover);
            }
        }

        System.out.println("A lista ficou da seguinte  " + numeros + " depois que removeu o número " + numRemover);

    }
}
