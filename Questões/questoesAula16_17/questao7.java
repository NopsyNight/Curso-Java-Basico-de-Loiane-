package questões.questoesAula16_17;

// Faça um programa que leia cinco números e imprima o maior número.

import java.util.Scanner;
import java.util.Arrays;

public class questao7 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero1 = scan.nextDouble();System.out.println("Informe o segundo número: ");
        double numero2 = scan.nextDouble();System.out.println("Informe o terceiro número: ");
        double numero3 = scan.nextDouble();System.out.println("Informe o quarto número: ");
        double numero4 = scan.nextDouble();System.out.println("Informe o quinto número: ");
        double numero5 = scan.nextDouble();


        double numeros[] =  {numero1, numero2, numero3, numero4, numero5};

        Arrays.sort(numeros);

        System.out.println("O maior numero é: " + numeros[4]);
    }
}
