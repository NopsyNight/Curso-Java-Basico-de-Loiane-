package questões.questõesAula14_e_15;

// Faça um programa que leia três número e mostre o maior e o menor deles.

import java.util.Scanner;
import java.util.Arrays; // Utilização de um Array para salvar informações em uma variável.

public class questao7 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Descubra Qual Número Maior e o Menor ---");
        System.out.println("Informe o primeiro número: ");
        double numero1 = scan.nextDouble();
        System.out.println("Informe o segundo número: ");
        double numero2 = scan.nextDouble();
        System.out.println("Informe o terceiro número: ");
        double numero3 = scan.nextDouble();

        double[] numeros = {numero1, numero2, numero3};
        //    ^^ - Informa a variável como uma lista.

        Arrays.sort(numeros); // Corrije os números do menor para o maior.

        // O maior número será o último elemento do array após a ordenação.
        // O índice do último elemento é o tamanho do array menos 1.
        double maiorNumero = numeros[numeros.length - 1];

        double menorNumero = numeros[0];

        if (maiorNumero == menorNumero){
            System.out.println("Todos os números são iguais");
        }else{
            System.out.println("O maior número é: " + maiorNumero + " e o menor número é: " + menorNumero + ".");
        }
    }
}