package Questões.QuestõesAula13;

// Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. C = (5 * (F - 32) / 9).

import java.util.Scanner;

public class Questão9 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Transformador de Graus Celsius ---");
        System.out.println("Informe quantos Graus Farenheit você quer saber que são em Celsius: ");
        float F = scan.nextFloat();

        float Celsius = (5 * (F - 32) /9);

        System.out.println(Celsius + " Celsius :D");

    }
}
