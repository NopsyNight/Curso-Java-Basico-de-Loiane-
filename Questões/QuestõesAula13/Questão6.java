package Questões.QuestõesAula13;

// Faça um Programa que peça o raio de um circulo, calcule e mostre sua área.

import java.util.Scanner;

public class Questão6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Cácule a Área do Círculo ---");
        System.out.println("Informe o raio do círculo: ");
        float raio = scan.nextFloat();

        float pi = 3.14f;

        float area_do_circulo = (pi * raio * raio);

        System.out.println("A área do círculo é: " + area_do_circulo + "Cm²");
    }
}
