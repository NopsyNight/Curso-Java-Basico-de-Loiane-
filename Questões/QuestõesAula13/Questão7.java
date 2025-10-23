package Questões.QuestõesAula13;

// Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class Questão7 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Cálcule a Área do Quadrado ---");
        System.out.println("Digite o lado do Quadrado em Cm: ");
        double lado = scan.nextDouble();

        double area_do_quadrado = lado * lado;

        double dobro_da_area = area_do_quadrado * 2;

        System.out.println("A área do Quadrado é: " + area_do_quadrado +"Cm² e seu dobro é: " + dobro_da_area + "Cm².");

    }

}
