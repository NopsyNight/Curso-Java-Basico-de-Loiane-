package questões.questoesAula19;

// Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuido ao local da lista: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * 2; // vai multiplicar os índices de A e B
        }

        System.out.print("Vetor A = ");
        for (int i= 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i= 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
