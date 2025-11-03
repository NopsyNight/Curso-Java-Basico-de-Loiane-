package questões.questoesAula19;

// Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina e escreva a média aritmética simples dos elementos ímpares armazenados neste valor.

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaNumerosimpares = 0;
        int contadorimpares = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuido ao local da lista A: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 1){
                somaNumerosimpares += vetorA[i];
                contadorimpares ++;
            }
        }

        double mediaAritmetica = (double) somaNumerosimpares / contadorimpares;

        System.out.print("Vetor A = ");
        for (int i= 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("A média aritmética de todos ímpares é de : " + mediaAritmetica);
    }
}
