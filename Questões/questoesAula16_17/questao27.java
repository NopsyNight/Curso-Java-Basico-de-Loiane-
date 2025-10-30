package questões.questoesAula16_17;

// Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.

import java.util.Scanner;

public class questao27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Cálculo Média de Alunos Por Turma");

        boolean sair = false;
        System.out.println("Informe quantas turmas tem: ");
        int turmas = scan.nextInt();

        int somaAlunos = 0;

        int alunos = 0;
        for (int i = 1; i <= turmas; i++) {
            do {
                System.out.print("Informe o número de alunos da turma " + i + " (máx 40): ");
                alunos = scan.nextInt();

                if (alunos > 40) {
                    System.out.println("Só se suporta 40 alunos por turma. Tente novamente.");
                }

            } while (alunos > 40);
        }
        somaAlunos += alunos;

        double media = alunos / turmas;
        System.out.println("A média de alunos por turma será de: " + media + " alunos por turma.");
    }
}
