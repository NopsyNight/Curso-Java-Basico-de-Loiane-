package questões.questoesAula19;

// Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor.

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaNumeros = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuido ao local da lista A: " + i);
            vetorA[i] = scan.nextInt();

            somaNumeros += vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i= 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma de todos os números é de : " + somaNumeros);
    }
}
