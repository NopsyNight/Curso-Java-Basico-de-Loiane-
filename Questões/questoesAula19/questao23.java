package questões.questoesAula19;

// Números palíndromos são aqueles que escritos da direita para esquerda tem o mesmo valor quando escritos para esquerda para direita. Exemplo: 454, 789987, 97379, 123454321, etc. Escreva um programa que tenha um vetor A de 10 numeros inteiros e verifique se um determinado valor é palíndromo, ou seja, se o primeiro elemento do vetor é igual ao último, se o segundo elemento do valor foi igual ao penúltimo e assim por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.

import java.util.Scanner;

public class questao23 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean ehPalindromo = true;

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Informe um valor  " + i + "º: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[0] == vetorA[9]){
                if(vetorA[1] == vetorA[8]){
                    if((vetorA[2] == vetorA[7])){
                        if((vetorA[3] == vetorA[6])){
                            if(vetorA[4] == vetorA[5]){
                                ehPalindromo = true;
                            }
                        }
                    }
                }
            }
        }

        if (ehPalindromo){
            System.out.println("Os números do Vetor A");
            System.out.print("Vetor A = ");
            for (int i = 0; i < vetorA.length; i++){
                System.out.print(vetorA[i] + " ");
            }
            System.out.println();
            System.out.println("Formam um palíndromo!");
        }
        else{
            System.out.println("Os números do vetor não formam um palíndromo");
        }
    }
}
