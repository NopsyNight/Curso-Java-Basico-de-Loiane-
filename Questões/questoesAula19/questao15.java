package questões.questoesAula19;

// Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor.

import java.util.Scanner;

public class questao15 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int contadorImpares = 0;
        int contadorPares = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuído ao local da lista A: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 1){
                contadorImpares ++;
            }else if (vetorA[i] % 2 == 0){
                contadorPares++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i= 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("A porcentagem de números ímpares é de: " + (contadorImpares * 10) + "% e a porcentagem de números pares é de: " + (contadorPares * 10) + "%.");
    }
}
