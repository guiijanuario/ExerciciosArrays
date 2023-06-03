import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        String[] sexos = new String[20];
        double[] alturas = new double[20];

        int sexoFeminino = 0;
        int sexoMasculino = 0;
        double alturaMaior = -2147483648.0;
        double alturaMenor = 2147483647.0;
        double altura = 0.0;
        double somaAltura = 0.0;
        double mediaAlturaHomens = 0.0;

        for(int i = 1; i <= 10; i++){

            System.out.println("Digite o sexo da " + (i) + "ª" + " : (F - Feminino e M - Masculino)");
            sexos[i] = scanner.next();

            System.out.println("Digite a altura da " + (i + 1) + "ª" + " pessoa");
            alturas[i] = scanner.nextDouble();

            if (sexos[i].equalsIgnoreCase("F")){
                sexoFeminino++;
            } else {
                sexoMasculino++;
                somaAltura += alturas[i];
            }

            if (alturas[i] < alturaMenor) {
                alturaMenor = alturas[i];
            }

            if (alturas[i] > alturaMaior) {
                alturaMaior = alturas[i];
            }

        }
        double mediaHomens = somaAltura/sexoMasculino;

        System.out.println("A maior altura é: " + formatador.format(alturaMaior));
        System.out.println("A menor altura é: " + formatador.format(alturaMenor));
        System.out.println("A média de altura dos homens é: " + formatador.format(mediaHomens));
        System.out.println("O número de mulheres é: " + sexoFeminino);
    }
}