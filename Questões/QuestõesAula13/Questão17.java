package Questões.QuestõesAula13;

// Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho emmetros quadrados da área a ser pintada. Considere que o tamanho da cobertura de tinta é de 1 litro para cada 6 metros quadrados e que  a tinta é vendida em latas de 18 litros, que custam R$80,00 ou em galões de 3,6 litros, que custam R$25,00.
// Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
// Comprar apenas latas de 18 litros;
// Comprar apenas galões de 3,6 litros;
// misturar latas e galões, de forma que o preço seja o menor. Acrescente 10% de folga e sempre arrendonde os valores para cima, isto é, considere latas cheias.

import java.util.Scanner;
public class Questão17 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Loja de Tintas ---");
        System.out.println("Informe quantos metros quadrados serão pintados (1 litro = 6m²): ");
        float mQuadrados = scan.nextFloat();

        // Cálculo com 10% de folga
        double litrosNecessarios = mQuadrados / 6 * 1.1;

        // Situação 1: Apenas latas de 18L
        double latasNecessarias = Math.ceil(litrosNecessarios / 18);

        double precoFinal = latasNecessarias * 80;
        // Situação 2: Apenas galões de 3.6L
        double latasNecessariasGalao = Math.ceil(litrosNecessarios /3.6);
        double precoFinalGalao = latasNecessariasGalao * 25;
        double precoFinalMisturado = Math.min(precoFinalGalao, precoFinal);
        double resto = litrosNecessarios % 18;
        double latasNecessariasMisturadas  = Math.floor(litrosNecessarios / 18);
        double galoesMistura = Math.ceil(resto / 3.6);

        // Se não precisar de galões (quando o resto for zero)
        if (resto == 0) galoesMistura = 0;


        System.out.println("A quantidade de tinta a serem compradas depende de três situações diferentes: ");
        System.out.println("Se for com latas de 18 litros, ficará: " + latasNecessarias + " latas e o preço ficará: R$" + precoFinal+ ".");
        System.out.println("Se for com galões de 3,6 Litros ficará: " + latasNecessariasGalao + " galões e o preço ficará com: R$" + precoFinalGalao+ ".");
        System.out.println("Se misturarmos os galões e o preço, ficará: " + latasNecessariasMisturadas + " latas, os galões ficam com "+ galoesMistura + " galões e o preço final será:" + precoFinalMisturado + ".");
    }
}
