package Questões.QuestõesAula13;

// Faça um Programa que converta metros para centímetros.

import java.util.Scanner;

public class Questão5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos metros podem ser em centímetros: ");
        double metros = scan.nextDouble();

        double centimetros = metros * 10;

        System.out.println("Os " + metros + " Metros, Se transformam em: "+ centimetros + "Centímetros.");
    }
}
