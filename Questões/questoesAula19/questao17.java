package questões.questoesAula19;

// Ler o vetor A com 10 elemenos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.

import java.util.Scanner;

public class questao17 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] Idades = new int[10];
        int contadorIdade = 0;

        for (int i = 0; i < Idades.length; i++){
            System.out.println("Informe a "+ (i+1) +"º idade: ");
            Idades[i] = scan.nextInt();

            if (Idades[i] > 35) {
                contadorIdade++;
            }
        }

        System.out.print("Idades = ");
        for (int i = 0; i < Idades.length; i++){
            System.out.print(Idades[i] + " ");
        }
        System.out.println();

        System.out.println("Há " + contadorIdade + " Pessoas com +35 anos de idade");
    }
}
