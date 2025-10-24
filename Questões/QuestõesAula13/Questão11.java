package Questões.QuestõesAula13;

// Faça um programa que peça 2 números inteiros e um número real. Cácule e mostre:
// a. Produto do dobro do primeiro com a metade do segundo
// b. a soma do triplo do primeiro com o terceiro
// c. o terceiro elevado ao cubo

import java.util.Scanner;

public class Questão11 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("--- Cálculo de Dois Números ---");
        System.out.println("Informe um número Inteiro: ");
        int inteiro = scan.nextInt();
        System.out.println("Informe um número Real: ");
        float real = scan.nextFloat();

        float calculo1 = ((inteiro * 2) * (real / 2));
        float calculo2 = ((inteiro * 3 ) + (calculo1 * 3));
        float calculo3 = calculo1 * calculo1 * calculo1;

        System.out.println("O produto do dobro do primeiro com a metade do segundo é: " +  calculo1);
        System.out.println("A soma do triplo do primeiro com o triplo do terceiro: " + calculo2);
        System.out.println("O terceiro elevado ao cubo: "+ calculo3);
    }
}
