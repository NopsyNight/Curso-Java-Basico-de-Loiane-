package questões.questoesAula16_17;

// Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("--- Cálculo de Potência ---");

        System.out.println("Informe um número para ser a base: ");
        int base = scan.nextInt();

        System.out.println("Informe o número que vai ser o expoente: ");
        int expoente = scan.nextInt();

        if (expoente < 0){
            System.out.println("Este método não lida com expoentes negativos.");
        }

        double resultado = 1;

        for (int i = 0; i < expoente ; i++){
            resultado = resultado * base;
        }

        System.out.println(base + " elevado a " + expoente + " = " + resultado);
    }
}
