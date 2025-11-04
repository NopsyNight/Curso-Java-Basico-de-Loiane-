package questões.questoesAula19;

// Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regra de formação:
// A) C[i] deverá receber 1 quando A[i] for maior que B[i];
// B) C[i] deverá receber 0 quando A[i] for igual a B[i];
// C) C[i] deverá receber -1 quando A[i] for menor a B[i].

import java.util.Scanner;

public class questao25 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuido ao local da lista A: " + i);
            vetorA[i] = scan.nextInt();

            System.out.println("Informe um valor atribuido ao local da lista B: " + i);
            vetorB[i] = scan.nextInt();

            if(vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            } else if ( vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            } else{
                vetorC[i] = -1;
            }
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

        System.out.print("Vetor C = ");
        for (int i= 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}
