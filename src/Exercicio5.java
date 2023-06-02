import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#,##0.00");

        Map<String,Double> quadroFuncionarios = new HashMap<>();

        System.out.println("[----- Ver qual a média salarial de seus funcionários -----]");
        System.out.println("Digite quantos funcionários vão ser cadastrados: ");
        int qtdFuncionarios = scanner.nextInt();


        double somaSalario = 0;
        double mediaSalarial = 0;

        for (int i = 0; i < qtdFuncionarios;i++){
            System.out.println("Digite o nome do " + ( i + 1 ) + "ª" + " funcionário: ");
            String nomeColaborador = scanner.next();
            System.out.println("Digite o salário do " + ( i + 1 ) + "ª" + " funcionário: ");
            double salarioColaborador = scanner.nextDouble();
            quadroFuncionarios.put(nomeColaborador,salarioColaborador);
            somaSalario += salarioColaborador;
            mediaSalarial = somaSalario / qtdFuncionarios;
        }

        System.out.println("A grade de funcionários é: " + quadroFuncionarios);
        System.out.println("A média salarial é: R$ " + formatador.format(mediaSalarial));
    }
}
