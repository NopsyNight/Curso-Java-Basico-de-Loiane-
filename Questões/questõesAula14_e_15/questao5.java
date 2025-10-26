package questões.questõesAula14_e_15;

// Faça um programa para leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
// A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
// A mensagem "Reprovado", se a média alcançada for menor < 7;
// A mensagem "Aprovado com Distinção", se a média alcançada for igual a dez;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("--- Cálcule a Média do Aluno ---");
        System.out.println("Informe a primeira nota do aluno: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10){
            System.out.println("O aluno foi Aprovado com Distinção com nota: 10");
        }else if (media < 10 && media >= 7){
            System.out.println("O aluno foi Aprovado com nota: " + media);
        }else if (media < 7){
            System.out.println("O aluno foi Reprovado com nota: " + media);
        }else {
            System.out.println("Nota Inválida por ser superior a 10 ou negativa");
        }
    }
}
