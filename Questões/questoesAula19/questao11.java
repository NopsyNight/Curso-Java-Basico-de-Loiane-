package questões.questoesAula19;

// Criar um vetor com 10 elementos inteiros. Implementar um programa que informe os valores que são pares.

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int contadorPares = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuido ao local da lista A: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0){
                contadorPares++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i= 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A quantidade de números pares são de: " + contadorPares);
    }
}
