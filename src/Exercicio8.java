import java.util.ArrayList;

public class Exercicio8 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 100; i < 150; i++){
            numeros.add(i);
        }

        ArrayList<String> numerosEmString = new ArrayList<>();

        for (int numero : numeros){
            String numeroString = String.valueOf(numero);
            numerosEmString.add(numeroString);
        }

        ArrayList<Integer> numerosPares = new ArrayList<>();

        for ( String numero : numerosEmString){
                ArrayList<Integer> captura = new ArrayList<>();
                for (int i = 0; i < numero.length();i++){
                    char unico = numero.charAt(i);
                    captura.add(Integer.parseInt(String.valueOf(unico)));

                }
                int soma = 0;
                for ( int num : captura){
                    soma += num;
                }
                if(soma % 2 ==0) {
                    numerosPares.add(soma);
                    System.out.println("O número é: " + numero + " A soma entre elas é: " + soma + " [ -- Esse número é par -- ]git");
                }
        }
    }
}
