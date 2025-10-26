package questões.questõesAula14_e_15;

// Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

import java.util.Arrays;
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Descubra Qual Produto Mais Barato ---");
        System.out.println("Informe o preço do primeiro produto: ");
        double preco1 = scan.nextDouble();
        System.out.println("Informe o preço do segundo produto: ");
        double preco2 = scan.nextDouble();
        System.out.println("Informe o preço do terceiro nproduto: ");
        double preco3 = scan.nextDouble();

        double[] precos = {preco1, preco2, preco3};

        Arrays.sort(precos);

        System.out.println("O preço do produto que você deve comprar é o que custa: R$"+ precos[0]);
    }
}