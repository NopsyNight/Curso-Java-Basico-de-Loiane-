package questões.questõesAula14_e_15;

// Faça um programa que leia 2 número e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
// Par ou Ímpar;
// Positivo ou Negativo;
// Inteiro ou Decimal.

import java.util.Scanner;

public class questao24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero1 = scan.nextDouble();
        System.out.println("Informe outro número: ");
        double numero2 = scan.nextDouble();

        System.out.println("Escolha uma Opção:\n" +
                " 1. Soma\n" +
                " 2. Subtração\n" +
                " 3. Multiplicação\n" +
                " 4. Divisão");
        int opcao = scan.nextInt();

        double resultado = 0;
        String operacao = "";

        switch (opcao) {
            case 1 -> { resultado = numero1 + numero2; operacao = "Soma"; }
            case 2 -> { resultado = numero1 - numero2; operacao = "Subtração"; }
            case 3 -> { resultado = numero1 * numero2; operacao = "Multiplicação"; }
            case 4 -> {
                if (numero2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                resultado = numero1 / numero2;
                operacao = "Divisão";
            }
            default -> {
                System.out.println("Opção inválida!");
                return;
            }
        }

        // Verificações
        boolean ehInteiro = resultado % 1 == 0;
        boolean ehPar = ehInteiro && ((int) resultado) % 2 == 0;
        boolean ehPositivo = resultado >= 0;

        // Impressão
        System.out.printf("\nResultado da %s: %.2f%n", operacao, resultado);

        if (ehInteiro) {
            System.out.println("→ É um número inteiro e " + (ehPar ? "par." : "ímpar."));
        } else {
            System.out.println("→ É um número decimal.");
        }

        System.out.println("→ É " + (ehPositivo ? "positivo." : "negativo."));
    }
}