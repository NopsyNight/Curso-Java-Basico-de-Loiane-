package questões.questõesAula14_e_15;

// Faça um programa que peça um número e informe se o número é inteiro ou decimal. Dica: Utilize uma função de arredondamento.

import java.util.Scanner;

public class questao23 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Descubra Se O Número é Inteiro ou Decimal! ---");
        System.out.println("Informe um número: ");
        double numero = scan.nextDouble();

        if (numero == Math.floor(numero)){
            System.out.println("O número " + numero + " é inteiro!");
        } else{
            System.out.println("O número " + numero + " é decimal!");
        }
    }

}
