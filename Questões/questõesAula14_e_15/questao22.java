package questões.questõesAula14_e_15;

// Faça um programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão);

import java.util.Scanner;

public class questao22 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para descobrir se é par ou impar (precisa ser inteiro): ");
        int numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é par.");
        }else if (numero % 2 == 1){
            System.out.println("O número é impar.");
        }else {
            System.out.println("O número é quebrado.");
        }
    }
}
