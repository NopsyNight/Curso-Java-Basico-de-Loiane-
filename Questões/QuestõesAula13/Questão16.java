package Questões.QuestõesAula13;

// Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$80,00. Informe ao usuário a quantidade de latas de tinta a serem compradas e o preço total.

import java.util.Scanner;

public class Questão16 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Loja de Tintas ---");
        System.out.println("Informe quantos metros quadrados serão pintados (1 litro = 3m²): ");
        float mQuadrados = scan.nextFloat();

        double litrosNecessarios = mQuadrados / 3;
        double latasNecessarias = Math.ceil(litrosNecessarios / 18);
        double precoFinal = latasNecessarias * 80;

        System.out.println("A quantidade de latas de tinta a serem compradas será: " + latasNecessarias + " latas e seu preço será de R$"+ precoFinal + ".");
    }
}
