package Questões.QuestõesAula13;

// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no Mês. Cálcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
// Salário Bruto
// Quanto pagou ao INSS
// Quanto Pagou ao Sindicato
// O salário líquido
// Calculse os descontos e o salário líquido conforme a tabela abaixo:
// + Salário Bruto - IR (11%) - INSS (8%) - Sindicato (5%) = Salário Líquido
import java.util.Scanner;

public class Questão15 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Cálcule Seu Salário Mensal ---");
        System.out.println("Informe quanto você ganha por hora: ");
        float ganhoHoraTrabalhada = scan.nextFloat();
        System.out.println("Informe quantas horas você trabalha por mês: ");
        float horasTrabalhadasMensais = scan.nextFloat();

        float salarioBruto = ganhoHoraTrabalhada * horasTrabalhadasMensais;

        float inss = salarioBruto * 0.08f;
        float sindicato = salarioBruto * 0.11f;
        float salarioLíquido = salarioBruto - inss - sindicato;

        System.out.println("Você ganha R$" + salarioBruto+" de salário bruto, com os impostos do INSS de 8% que é R$" + inss + " e do Sindicato que é 11% que fica R$" + sindicato + " Seu salário Liquido será de R$" + salarioLíquido);
    }
}
