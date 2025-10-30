package questões.questoesAula16_17;

// Faça um programa que mostre todos os primos entre 1 e N Sendo N um número inteiro fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos. Serão avaliados o funcionamento, o estilo e o número de teste (divisões) executados.

import java.util.ArrayList;
import java.util.Scanner;

public class questao23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Contador de Números Primos ---");
        System.out.println("Informe um número:");

        int limite = scan.nextInt();

        // Lista para guardar os números primos encontrados
        ArrayList<Integer> primos = new ArrayList<>();

        // Percorre todos os números de 2 até o limite
        for (int numero = 2; numero <= limite; numero++) {

            boolean ehPrimo = true; // supõe que o número é primo

            // testa divisores de 2 até a raiz quadrada do número
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false; // achou um divisor → não é primo
                    break;
                }
            }
            // se for primo, adiciona na lista
            if (ehPrimo) {
                primos.add(numero);
            }
        }
     System.out.println("\nNúmeros primos encontrados até " + limite + ":");
        System.out.println(primos);
    }
}
