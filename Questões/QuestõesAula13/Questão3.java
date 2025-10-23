package Questões.QuestõesAula13;

// Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = scan.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("A soma dos números é igual a : " + soma);

    }
}
