package aulas.aula20_matrizes;

// Array = lista de n elemento, trabalha como uma lista.
// Matriz = tabela de n x m elementos, diferente do array que é uma lista, na matriz a gente trabalha como se fosse um plano cartesiano, com várias listas agrupadas com seus respectivos elementos.
// Matriz == Array de arrays, ou seja uma lista de clubes de futebol e dentro desta lista, tem vários times de futebol com seus jogadores que também estão em outra listas; Matriz = lista de futebol = lista de clubes = lista de jogadores e assim por diante.

public class Matrizes {
    public static void main(String[] args){
        // Problema
        // Armazenar as 4 notas do ano de 30 alunos.

        // solução?
        double[] aluno1 = new double[4];
        double[] aluno2 = new double[4];
        double[] aluno3 = new double[4];
        double[] aluno4 = new double[4];
        double[] aluno5 = new double[4];

        // Não!!!

        // Solução:

        // Alunos x Notas

        // Notas:
        //        0          1         2         3
        // 0 |    10    |    7    |    8    |    9.5   |
        // 1 |    9     |    8    |    7    |    9     |
        // 2 |    8     |    9    |    10   |    7     |  Alunos
        // 3 |    5     |    8    |    7    |   8.5    |
        // ...

        // No código

        double[][] notasAlunos = new double[30][4];

        // 1º aluno representado [0] e notas [...]
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        // 2º aluno com a mesma contagem de notas.
        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 8.5;
        notasAlunos[1][3] = 10;

    }
}
