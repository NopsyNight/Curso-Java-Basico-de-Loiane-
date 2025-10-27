package questões.questõesAula14_e_15;

// Faça um programa que lê duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule sua média. A atribuição de conceitos obedece à tabela abaixo:
// Média de Aproveitamento - Conceito
// Entre 9.0 e 10         - A
// Entre 7.5 e 9.0        - B
// Entre 6.0 e 7.5        - C
// Entre 4.0 e 6.0        - D
// Entre 4.0 e zero       - E
// O algorítmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem "APROVADO" se o conceito for A, B ou C, e "REPROVADO" se o conceito for D ou E.

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Cálcule a Média do Aluno ---");
        System.out.println("Informe a primeira nota do aluno: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10){
            System.out.println("// Média de Aproveitamento - Conceito\n" +
                    "// Entre 9.0 e 10         - A\n" +
                    "// Entre 7.5 e 9.0        - B\n" +
                    "// Entre 6.0 e 7.5        - C\n" +
                    "// Entre 4.0 e 6.0        - D\n" +
                    "// Entre 4.0 e zero       - E\n" +
                    "---------------------------------\n" +
                    "// Sua Nota: " + media+ "         - A\n" +
                    "// APROVADO.");
        }else if (media >= 7.5 && media < 9){
            System.out.println("// Média de Aproveitamento - Conceito\n" +
                    "// Entre 9.0 e 10         - A\n" +
                    "// Entre 7.5 e 9.0        - B\n" +
                    "// Entre 6.0 e 7.5        - C\n" +
                    "// Entre 4.0 e 6.0        - D\n" +
                    "// Entre 4.0 e zero       - E\n" +
                    "--------------------------------- \n+" +
                    "// Sua nota: " + media+ "          - B\n" +
                    "// APROVADO");
        }else if (media >= 6 && media < 7){
            System.out.println("// Média de Aproveitamento - Conceito\n" +
                    "// Entre 9.0 e 10         - A\n" +
                    "// Entre 7.5 e 9.0        - B\n" +
                    "// Entre 6.0 e 7.5        - C\n" +
                    "// Entre 4.0 e 6.0        - D\n" +
                    "// Entre 4.0 e zero       - E\n" +
                    "--------------------------------- \n+" +
                    "// Sua nota: " + media+ "          - C\n" +
                    "// APROVADO");
        }else if (media >= 4.5 && media < 6){
            System.out.println("// Média de Aproveitamento - Conceito\n" +
                    "// Entre 9.0 e 10         - A\n" +
                    "// Entre 7.5 e 9.0        - B\n" +
                    "// Entre 6.0 e 7.5        - C\n" +
                    "// Entre 4.0 e 6.0        - D\n" +
                    "// Entre 4.0 e zero       - E\n" +
                    "--------------------------------- \n+" +
                    "// Sua nota: " + media+ "           - D\n" +
                    "// REPROVADO");
        }else if (media >= 0 && media < 4.5){
            System.out.println("// Média de Aproveitamento - Conceito\n" +
                    "// Entre 9.0 e 10         - A\n" +
                    "// Entre 7.5 e 9.0        - B\n" +
                    "// Entre 6.0 e 7.5        - C\n" +
                    "// Entre 4.0 e 6.0        - D\n" +
                    "// Entre 4.0 e zero       - E\n" +
                    "--------------------------------- \n+" +
                    "// Sua nota: " + media+ "          - E\n" +
                    "// REPROVADO");
        }else if (media > 10 || media < 0){
            System.out.println("Nota Inválida, Tente novamente e Não insira notas acima de 11 ou negativas.");
        }
    }
}

