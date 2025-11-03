package questões.questoesAula19;

// Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva: ]
// A) a soma de elementos armazenados neste vetor que são inferiores a 15;
// B) A quantidade de elementos armazenados no vetor que são iguais a 15;
// C) A média dos elementos que são armazenados no vetor que são superiores a 15;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaNumerosMenores15 = 0;
        int quantidadeDeNumerosIguais15 = 0;
        int somaNumerosMaiores15 = 0;
        int contadorNumerosMaiores15 = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe um valor atribuido ao local da lista A: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 15){
                somaNumerosMenores15 += vetorA[i];
            }else if (vetorA[i] == 15){
                quantidadeDeNumerosIguais15++;
            }else{
                somaNumerosMaiores15+= vetorA[i];
                contadorNumerosMaiores15++;
            }

        }

        double mediaAritmetica = (double) somaNumerosMaiores15 / contadorNumerosMaiores15;

        System.out.print("Vetor A = ");
        for (int i= 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("A soma dos números do Vetor A que são menores que 15 é: " + somaNumerosMenores15);
        System.out.println("A quantidade de números iguais a 15 é: " + quantidadeDeNumerosIguais15);
        System.out.println("A média Aritmética dos números maiores que 15 é: " + mediaAritmetica);
    }
}
