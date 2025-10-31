package questões.questoesAula19;

// Criar um vetor com 15 elementos inteiros. Construir um vetor B com o mesmo tipo e tamanho, sendo cada elemento do B deverá ser o quadraddo do respectivo elemento A, ou seja:
// vetorB[i] = vetorA[i] * vetorA[i]

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuido ao local da lista: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i]; // vai elevar ao quadrado o índice de A para B
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
