package questões.questõesAula14_e_15;

// As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os seguintes reajustes:
// Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
// Salários até R$ 280,00 (incluindo) : aumento de 20%;
// Salários entre R$ 280,00 à R$ 700,00: aumento de 15%;
// Salários entre R$ 700,00 à R$ 1500,00: aumento de 10%;
// Salários entre R$ 1500,00 em diante: aumento de 5%.
// Após o aumento ser realizado, informe na tela:
// O salário antes do reajuste.
// O percentual de aumento do reajuste.
// O valor do aumento.
// O novo salário, após o aumento.

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Reajuste do Salário dos Colaboradores ---");
        System.out.println("Informe seu salário: ");
        double salarioBruto = scan.nextDouble();

        if (salarioBruto <= 280){
            double percentualAumento = salarioBruto * 0.20;
            double salarioFinal = salarioBruto + percentualAumento;

            System.out.println("O seu salário inicial era de: R$" + salarioBruto + " Agora com o aumento de 20%, com o valor de: R$" + percentualAumento + " O seu novo salário agora é de: R$" + salarioFinal + ".");
        }else if (salarioBruto > 280 && salarioBruto <= 700){
            double percentualAumento = salarioBruto * 0.15;
            double salarioFinal = salarioBruto + percentualAumento;

            System.out.println("O seu salário inicial era de: R$" + salarioBruto + " Agora com o aumento de 15%, com o valor de: R$" + percentualAumento + " O seu novo salário agora é de: R$" + salarioFinal + ".");
        }else if (salarioBruto > 700 && salarioBruto <= 1500){
            double percentualAumento = salarioBruto * 0.10;
            double salarioFinal = salarioBruto + percentualAumento;

            System.out.println("O seu salário inicial era de: R$" + salarioBruto + " Agora com o aumento de 10%, com o valor de: R$" + percentualAumento + " O seu novo salário agora é de: R$" + salarioFinal + ".");
        }else{
            double percentualAumento = salarioBruto * 0.05;
            double salarioFinal = salarioBruto + percentualAumento;

            System.out.println("O seu salário inicial era de: R$" + salarioBruto + " Agora com o aumento de 5%, com o valor de: R$" + percentualAumento + " O seu novo salário agora é de: R$" + salarioFinal + ".");
        }

    }
}
