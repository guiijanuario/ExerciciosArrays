import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][5];
        int soma = 0;

        for(int i = 0; i < 4; i++){
            for(int x = 0; x < 5; x++){
                System.out.println("Digite o numero que deseja inserir: ");
                int num = scanner.nextInt();
                matriz[i][x] = num;
                soma += num;
            }
        }

        System.out.println("[---------- **** ----------]");
        for(int i = 0; i < 4; i++){
            for(int x = 0; x < 5; x++){
                System.out.print("|" + matriz[i][x] + "|");
            }
            System.out.println();
        }
        System.out.println("A soma dos números da matriz é: " + soma);
    }
}
