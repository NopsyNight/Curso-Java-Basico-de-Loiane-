package questões.questoesAula19;

// Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$) e a seguir armazene em vetor A com 20 elementos as seguintes conversões:
// A[i] = contação do dolar * i, para todo i variando de 1 até 20.

import java.util.Scanner;

public class questao20 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double[] dolares = new double[20];
        double[] reais = new double[20];

        for (int i = 1; i < dolares.length; i++){
            System.out.println("Quantos dólares (U$) você quer converter para reais(R$)? :" + i);
            dolares[i] = scan.nextDouble();

            reais[i] = dolares[i] * 5.36; // Cotação do dólar atual de 03/11/2025
        }

        System.out.print("Dólares = ");
        for (int i = 0; i < dolares.length; i++){
            System.out.print(" U$"+dolares[i] + " ");
        }
        System.out.println();

        System.out.print("Reais = ");
        for (int i = 0; i < reais.length; i++){
            System.out.print("R$" + reais[i] + " ");
        }
        System.out.println();
    }
}
