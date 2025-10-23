package Questões.QuestõesAula13;

// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro bimestre do aluno: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite a nota do segundo bimestre do aluno: ");
        double n2 = scan.nextDouble();
        System.out.println("Digite a nota do terceiro bimestre do aluno: ");
        double n3 = scan.nextDouble();
        System.out.println("Digite a nota do quarto bimestre do aluno: ");
        double n4 = scan.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média final do aluno foi: " + media);
    }
}
