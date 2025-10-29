package questões.questoesAula16_17;

// Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e ímpares.

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Contador de Pares e Ímpares ---");
        int contadorImpar = 0;
        int contadorPar = 0;

        for (int i = 0; i <10; i++){
            System.out.println("Insira o " + (i+1) + "º número: ");
            double numero = scan.nextDouble();

            if (numero % 2 == 0){
                contadorPar++;
            } else{
                contadorImpar++;
            }
        }
        System.out.println("O total de Ímpares foi de: " + contadorImpar + "\nE o total de Pares foi de: " + contadorPar);
    }
}
