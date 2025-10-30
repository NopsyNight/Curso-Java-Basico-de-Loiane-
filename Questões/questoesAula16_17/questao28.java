package questões.questoesAula16_17;

// Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.

import java.util.Scanner;

public class questao28 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Loja CDs ---");
        System.out.println("Informe quantos Cds você quer comprar: ");
        int cds = scan.nextInt();

        System.out.println("Informe quanto de dinheiro você quer investir nos CDs: ");
        int valorInvestido = scan.nextInt();

        double media = (double) valorInvestido / cds; // (double) transforma as variáveis em dobro para conseguir terem um valor com virgula.

        System.out.println("Você gastou R$" + media + " Por cada CD.");
    }
}
