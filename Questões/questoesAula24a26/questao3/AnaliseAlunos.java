package questões.questoesAula24a26.questao3;

// Escreva uma classe para representar um Aluno, adicione atributos relacionados às características de um Aluno, como nome, matricula, curso que está matriculado, nome de 3 disciplinas ques está cursando e as notas dessas 3 disciplinass. Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma determinada disciplina.
// Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e ao final informa o nome das disciplinas, mostra as notas e mostra se o aluno foi aprovado ou não.

import java.util.Scanner;

public class AnaliseAlunos {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Aluno matheus = new Aluno();

        System.out.println("Informe seu nome: ");
        matheus.nome = scan.next();

        System.out.println("Informe o número da sua matrícula: ");
        matheus.matricula = scan.nextInt();

        for (int i = 0; i<matheus.disciplinas.length; i++){ // Jogas as Disciplinas dentro de uma Lista para serem reutilizada depois.
            System.out.println("Informe sua " + (i+1) + "º Disciplina: ");
            matheus.disciplinas[i] = scan.next();

            System.out.println("Informe sua média final dessa disciplina: ");
            matheus.notaFinal[i] = scan.nextDouble();
        }

        matheus.mostrarCurriculoAluno();
    }
}
