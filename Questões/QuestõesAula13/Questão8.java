package Questões.QuestõesAula13;

// Faça um Programa que pergunte a você quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total o seu salário no referido mês.

import java.util.Scanner;

public class Questão8 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Cálcule Seu Salário Mensal ---");
        System.out.println("Informe quanto você ganha por hora: ");
        double ganhoHoraTrabalhada = scan.nextDouble();
        System.out.println("Informe quantas horas você trabalha por mês: ");
        double horasTrabalhadasMensais = scan.nextDouble();

        double ganhoMensal = ganhoHoraTrabalhada * horasTrabalhadasMensais;

        System.out.println("Você ganha: R$"+ ganhoMensal + " Mensalmente");
    }
}
