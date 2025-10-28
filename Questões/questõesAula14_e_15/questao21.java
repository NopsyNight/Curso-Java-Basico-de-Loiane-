package questões.questõesAula14_e_15;

// Faça um programa para um caixa eletrônico. O programa deverá perguntar ao usuário o valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50, e 100 Reais. O valor mínimo é de 10 reais e o máximo de 600 Reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
// Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma de 5 e uma nota de 1;
// Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

import java.util.Scanner;

public class questao21 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Caixa Eletrônico ---");
        System.out.println("Informe quanto R$ você quer sacar (valor mínimo: R$10 e máximo: R$600): ");
        int saque = scan.nextInt();

        if (saque < 10){
            System.out.println("Não aceito, por favor insira um valor acima de R$10");
            return;
        } else if(saque < 0){
            System.out.println("Kkkkk engraçadinho, não insira valores negativo.");
        }else if (saque > 600){
            System.out.println("Por favor, insira valores abaixo de R$600");
            return;
        }else{
            int nota100 = saque / 100;
            saque %= 100;

            int nota50 = saque / 50;
            saque %= 50;

            int nota10 = saque / 10;
            saque %= 10;

            int nota5 = saque / 5;
            saque %= 5;

            int nota1 = saque;

            // Exibição
            System.out.println("\nNotas fornecidas:");
            System.out.println(nota100 + " nota(s) de R$100");
            System.out.println(nota50 + " nota(s) de R$50");
            System.out.println(nota10 + " nota(s) de R$10");
            System.out.println(nota5 + " nota(s) de R$5");
            System.out.println(nota1 + " nota(s) de R$1");
        }
    }
}
