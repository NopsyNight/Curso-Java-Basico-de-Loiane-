package questões.questoesAula27a32.questao3;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] disciplinas = {"Linguagem de Programação 1", "Álgebra", "Teoria Organizacional"};
        double[] notasFinal = {10, 9, 8};

        Aluno matheus = new Aluno("Matheus", 202511, disciplinas, notasFinal);

        matheus.mostrarCurriculoAluno();
    }
}
