package questões.questoesAula19;

// Ler duas notas bimestrais para um conjuntos de 10 alunos. Armazenar as notas informadas em dois vetores "Nota1" e "Nota2" do tipo real. Escreva um programa que calcule a média aritmética simples das notas informadas armazenando o resultado em um vetor "Result" de mesmo tipo e tamanho. AO mostrar os reultados exibir a situação de cada aluno. Se a média calculada for superior ou igual a 7 o aluno estará "Aprovado", caso contrário, a situação do aluno deverá ser "Reprovado".

import java.util.Scanner;

public class questao19 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double[] Nota1 = new double[10];
        double[] Nota2 = new double[10];
        double[] Result = new double[10];

        for (int i = 0; i < Nota1.length; i++){
            System.out.println("Informe a "+ (i+1) +"º Nota do primeiro bimestre: ");
            Nota1[i] = scan.nextDouble();

            if(Nota1[i] < 0 || Nota1[i] > 10){
                System.out.println("Informe uma nota menor que 10 e maior que 0");
                i--;
                continue;
            }

            System.out.println("Informe a " + (i+1) + "º Nota segundo bimestre:");
            Nota2[i] = scan.nextDouble();

            if(Nota2[i] < 0 || Nota2[i] > 10){
                System.out.println("Informe uma nota menor que 10 e maior que 0");
                i--;
                continue;
            }
            Result[i] = (Nota1[i] + Nota2[i]) / 2;
        }

        System.out.print("1º Notas = ");
        for (int i = 0; i < Nota1.length; i++){
            System.out.print(Nota1[i] + " ");
        }
        System.out.println();

        System.out.print("2º Notas = ");
        for (int i = 0; i < Nota2.length; i++){
            System.out.print(Nota2[i] + " ");
        }
        System.out.println();

        System.out.println("Resultados: ");
        for (int i = 0; i < Result.length; i++){
            if (Result[i] < 7){
                System.out.println("Média: "+ Result[i]+ " Está Reprovado");
            }else if(Result[i] >= 7){
                System.out.println("Média: "+ Result[i]+ " Está Aprovado.");
            }
        }
    }
}
