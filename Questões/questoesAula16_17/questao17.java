package questões.questoesAula16_17;

// Faça um programa que calcule o fatorial de um número inteiro.

import java.util.Scanner;

public class questao17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Fatorial ---");
        System.out.println("Informe um número para saber o seu fatorial: ");
        int numero = scan.nextInt();

        int fatorial = 1;

        for (int i =  numero; i > 1; i--) {
            fatorial *= i;
            System.out.println(i + "! = " + fatorial);
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
