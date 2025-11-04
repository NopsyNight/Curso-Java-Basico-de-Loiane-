package questões.questoesAula19;

// Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tamanho e tipo, obedecendo as seguintes regras de informação:
// A) vetor B deverá receber 1 quando A for par;
// B) deverá receber 0 quando A[i] for ímpar.

import java.util.Scanner;

public class questao24 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuido ao local da lista: " + i);
            vetorA[i] = scan.nextInt();

            if(vetorA[i] % 2 == 1){
                vetorB[i] = 0;
            }else if (vetorA[i] % 2 == 0){
                vetorB[i] = 1;
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
    }
}
