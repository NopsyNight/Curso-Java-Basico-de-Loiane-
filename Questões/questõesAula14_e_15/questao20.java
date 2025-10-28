package questões.questõesAula14_e_15;

//  Faça um programa para leitura de três notas parciais do aluno. O programa deve calcular a média alcançada por aluno e presentar

import java.util.Scanner;

public class questao20 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("--- Cálcule a Média do Aluno ---");
        System.out.println("Informe a primeira nota do aluno: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        double nota2 = scan.nextDouble();
        System.out.println("Informe a terceira nota do aluno: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media == 10){
            System.out.println("O aluno foi Aprovado com Distinção com nota: 10.");
        }else if (media < 10 && media >= 7){
            System.out.println("O aluno foi Aprovado com nota: " + media + ".");
        }else if (media < 7){
            System.out.println("O aluno foi Reprovado com nota: " + media + ".");
        }else {
            System.out.println("Nota Inválida por ser superior a 10 ou negativa");
        }
    }
}
