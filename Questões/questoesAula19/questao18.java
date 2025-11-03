package questões.questoesAula19;

// Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de Pessoas. Escreva um programa que determine e escreva menor e maior idade e suas respectivas posições.

import java.util.Scanner;
import java.util.Arrays;

public class questao18 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] Idades = new int[10];
        int contadorIdade = 0;

        for (int i = 0; i < Idades.length; i++){
            System.out.println("Informe a "+ (i+1) +"º idade: ");
            Idades[i] = scan.nextInt();
        }
        Arrays.sort(Idades);
        System.out.print("Idades = ");
        for (int i = 0; i < Idades.length; i++){
            System.out.print(Idades[i] + " ");
        }
        System.out.println();
        System.out.println("A menor Idade registrada foi: " + Idades[0] + " anos, e sua posição é a 1º");
        System.out.println("A maior idade registrada foi: " + Idades[9] + " anos, e sua posição é a 10º");
    }
}
