package Questões.QuestõesAula13;

// Tendo dados de entrada a altura de uma pessoa, construa um algorítmo que calculo seu peso ideal, usando a seguinte fórmula: (72.7 * altura) - 58

import java.util.Scanner;

public class Questão12 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Cálculo de Peso Ideal ---");
        System.out.println("Informe sua altura: ");
        float altura = scan.nextFloat();

        float pesoIdeal = (72.7f * altura) - 58f;

        System.out.println("Sua altura: " + altura + "cm - Peso ideal: " + pesoIdeal + "Kg.");
    }
}
