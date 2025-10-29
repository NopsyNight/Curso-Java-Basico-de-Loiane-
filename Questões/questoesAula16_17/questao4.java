package questões.questoesAula16_17;

// Supondo que a população de um país A, seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja de 200.000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva quantos anos são necessários para o crescimento da população do país A, ultrapasse ou iguale a população do País B, mantidas as taxas de crecimento.

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args){

        System.out.println("Supondo que a população de um país A, seja da ordem de 80.000 habitantes com\numa taxa anual de crescimento de 3% e que a população de B seja de 200.000 habitantes\ncom uma taxa de crescimento de 1.5, quantos anos a população A alcancaria a população B?");

        System.out.println("\nResposta: ");

        double populacaoA = 80000;
        double porcentagemAnualA = 0.03;

        double populacaoB = 200000;
        double porcentagemAnualB = 0.015;

        int anos = 0;

        do {
            populacaoA += populacaoA * porcentagemAnualA;
            populacaoB += populacaoB * porcentagemAnualB;
            anos++;
        } while (populacaoA <= populacaoB);

        System.out.println("\nSe passarão " + anos + " anos para a população A ultrapassar ou igualar a população B.");
        System.out.println("População final de A: " + populacaoA + " habitantes.");
        System.out.println("População final de B: " + populacaoB + " habitantes.");
    }
}
