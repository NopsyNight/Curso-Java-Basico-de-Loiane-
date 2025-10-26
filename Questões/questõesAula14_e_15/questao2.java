package questões.questõesAula14_e_15;

// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double numero = scan.nextDouble();

        if(numero < 0){
            System.out.println("O número: " + numero + " é negativo");
        }else if (numero > 0){
            System.out.println("O número: " + numero + " é positivo");
        }else{
            System.out.println("O número é neutro");
        }
    }
}
