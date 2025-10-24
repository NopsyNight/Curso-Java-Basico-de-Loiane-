package Questões.QuestõesAula13;

// Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em graus farenheint.

import java.util.Scanner;

public class Questão10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Transforma em Graus Fahrenheit ---");
        System.out.println("Informe quantos Graus Celsius você quer descobrir que ficam em Farenheit: ");

        float Celsius = scan.nextFloat();

        float Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println("Resultado: " + Fahrenheit + "ºF.");
    }

}
