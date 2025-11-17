package questoes.questoesAula35.questao2;

// Escreva uma classe para representar um Curso, que tem nome e horário.
// Cada curso tem um Professor, que possui nome, departamento e email.
// Cada curso também pode ter vários alunos (tipo Aluno). Cada aluno tem nome, matrícula, e 4 notas. Escreva um programa que teste que crie um Curso com 5 alunos, e que peça para o usuário entrar com 4 notas de cada aluno. Ao final, imprima a média de cada aluno, se o mesmo está aprovado (media maior ou igual a 7), e qual é a média da turma.


import java.util.Scanner;

public class Curso {
    static Scanner scan = new Scanner(System.in);

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso(String nome, String horario, Professor professor, Aluno[] alunos) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public double mediaTurma() {
        double soma = 0;
        for (Aluno a : alunos) {
            soma += a.calcularMedia();
        }
        return soma / alunos.length;
    }
}
