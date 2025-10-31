package questões.questoesAula19;

// Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemnto do vetor B deverá ser o respectivo elemento de A multiplicando por sua posição (ou índice), ou seja:
// B[i] = A[i] * i.

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuido ao local da lista: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
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
