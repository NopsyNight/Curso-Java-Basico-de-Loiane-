package questões.questõesAula14_e_15;

// Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto ( conforme a tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
// Desconto do IR:
// Salário Burto até 900 é isento.
// Salário Bruto até 1500 - desconto de 5%
// Salário Bruto até 2500 - desconto de 10%
// Salário Bruto além de 2500 - desconto de 20%
// Imprima na tela as informações dispostas conforme o exemplo abaixo.
// Salário Bruto: (5 * 200)  : R$ 1100,00
// (-) IR (5%)               : R$ 55,00
// (-) INSS (10%)            : R$ 110,00
// FGTS (11%)                : R$ 121,00
// Total de descontos        : R$ 165,00
// Salário Líquido           : R$ 935,00

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Cálculo Folha de Pagamento ---");
        System.out.println("Informe quanto você ganha por hora: ");
        double ganhoHoraTrabalhada = scan.nextDouble();
        System.out.println("Informe quantas horas você trabalha por mês: ");
        double horasTrabalhadasMensais = scan.nextDouble();

        double salarioBruto = ganhoHoraTrabalhada * horasTrabalhadasMensais;

        if (salarioBruto <= 900) {
            System.out.println("Salário Bruto: (" + ganhoHoraTrabalhada + " * " + horasTrabalhadasMensais + ") : R$ " + salarioBruto);
            System.out.println("(-) IR (0%)                   : R$ 00,00");
            System.out.println("(-) INSS (0%)                 : R$ 00,00");
            System.out.println("FGTS (0%)                     : R$ 00,00");
            System.out.println("Total de descontos            : R$ 00,00");
            System.out.println("Salário Líquido               : R$ " + salarioBruto);
        }else if (salarioBruto > 900 && salarioBruto <= 1500){
            double inss = salarioBruto * 0.1;
            double fgts = salarioBruto * 0.11;
            double ir = salarioBruto * 0.05;

            double totalDescontos = inss + fgts + ir;
            double salarioLíquido = salarioBruto - inss - fgts;

            System.out.println("Salário Bruto: (" + ganhoHoraTrabalhada + " * " + horasTrabalhadasMensais + ") : R$ " + salarioBruto);
            System.out.println("(-) IR (5%)                  : R$ " + ir);
            System.out.println("(-) INSS (10%)               : R$ " + inss);
            System.out.println("FGTS (11%)                   : R$ " + fgts);
            System.out.println("Total de descontos           : R$ " + totalDescontos);
            System.out.println("Salário Líquido              : R$ " + salarioLíquido);
        }else if (salarioBruto > 1500 && salarioBruto <= 2500){
            double inss = salarioBruto * 0.10;
            double fgts = salarioBruto * 0.11;
            double ir = salarioBruto * 0.10;

            double totalDescontos = inss + fgts + ir;
            double salarioLíquido = salarioBruto - inss - fgts;

            System.out.println("Salário Bruto: (" + ganhoHoraTrabalhada + " * " + horasTrabalhadasMensais + ") : R$ " + salarioBruto);
            System.out.println("(-) IR (10%)                 : R$ " + ir);
            System.out.println("(-) INSS (10%)               : R$ " + inss);
            System.out.println("FGTS (11%)                   : R$ " + fgts);
            System.out.println("Total de descontos           : R$ " + totalDescontos);
            System.out.println("Salário Líquido              : R$ " + salarioLíquido);
        }else{
            double inss = salarioBruto * 0.1;
            double fgts = salarioBruto * 0.11;
            double ir = salarioBruto * 0.20;

            double totalDescontos = inss + fgts + ir;
            double salarioLíquido = salarioBruto - inss - fgts;

            System.out.println("Salário Bruto: (" + ganhoHoraTrabalhada + " * " + horasTrabalhadasMensais + ") : R$ " + salarioBruto);
            System.out.println("(-) IR (20%)                 : R$ " + ir);
            System.out.println("(-) INSS (10%)               : R$ " + inss);
            System.out.println("FGTS (11%)                   : R$ " + fgts);
            System.out.println("Total de descontos           : R$ " + totalDescontos);
            System.out.println("Salário Líquido              : R$ " + salarioLíquido);
        }
    }
}