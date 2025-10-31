package questões.questoesAula19;

// Criar um vetor A com 10 elementos Inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do veto B deverá ser o resto da divisão dos respectivo elemento de A por 2, ou seja:
// B[i] := A[i] % 2.

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuido ao local da lista A: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] % 2;

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
