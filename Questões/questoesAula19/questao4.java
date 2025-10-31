package questões.questoesAula19;

// Criar um vetor A com 15 elementos Inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo cada elemento do vetor B deverá ser a raíz quadrada do respectivo elemento de A, ou seja:
// vetorB[i] = sqrt(vetorA[i])

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuido ao local da lista: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = (int) Math.sqrt(vetorA[i]); // O sqrt normalmente só funciona com variáveis do tipo double, ou float, como temos um inteiro, vamos transformar a equação em inteira, para que funcione.
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
