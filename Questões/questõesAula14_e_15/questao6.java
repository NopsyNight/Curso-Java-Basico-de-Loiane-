package questões.questõesAula14_e_15;

// Faça um programa que leia três números e mostre o maior entre eles

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Descubra Qual Número Maior ---");
        System.out.println("Informe o primeiro número: ");
        double numero1 = scan.nextDouble();
        System.out.println("Informe o segundo número: ");
        double numero2 = scan.nextDouble();
        System.out.println("Informe o terceiro número: ");
        double numero3 = scan.nextDouble();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O maior número é: " + numero1);
        }else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("O maior número é: " + numero2);
        }else if (numero3 > numero2 && numero3 > numero1){
            System.out.println("O maior número é: " + numero3);
        }else if (numero1 == numero2 || numero1 == numero3){
            System.out.println("Todos os números são iguais.");
        }else{
            System.out.println("Dois números são iguais.");
        }
    }
}
