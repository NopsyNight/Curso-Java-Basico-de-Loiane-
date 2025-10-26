package questões.questõesAula14_e_15;

// Faça um Programa que peça dois números e imprima o maior deles

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número: ");
        double numero1 = scan.nextDouble();

        System.out.println("Insira um segundo número: ");
        double numero2 = scan.nextDouble();

        if(numero1 > numero2){
           System.out.println("O maior número é: " + numero1);
        }else if (numero2 > numero1){
            System.out.println("O maior número é: " + numero2);
        }else{
            System.out.println("Nenhum dos dois números é maior que o outro.");
        }
    }
}
