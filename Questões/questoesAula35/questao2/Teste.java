package questoes.questoesAula35.questao2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Professor prof = new Professor("João Silva", "Computação", "joao@uni.com");

        Aluno[] alunos = new Aluno[5];
        alunos[0] = new Aluno("Matheus", "001");
        alunos[1] = new Aluno("Ana", "002");
        alunos[2] = new Aluno("Carlos", "003");
        alunos[3] = new Aluno("Julia", "004");
        alunos[4] = new Aluno("Pedro", "005");

        Curso curso = new Curso("Java Básico", "14h - 16h", prof, alunos);

        for (Aluno a : alunos) {
            System.out.println("Digite as 4 notas do aluno " + a.getNome() + ":");
            double[] notas = new double[4];

            for (int i = 0; i < 4; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                notas[i] = scan.nextDouble();
            }

            a.setNotas(notas);
            System.out.println();
        }
        System.out.println("---- RESULTADOS ----");
        for (Aluno a : alunos) {
            double media = a.calcularMedia();
            System.out.println(a.getNome() + " - Média: " + media +
                    " - " + (a.isAprovado() ? "APROVADO" : "REPROVADO"));
        }
        System.out.println("\nMédia da turma: " + curso.mediaTurma());
    }
}
