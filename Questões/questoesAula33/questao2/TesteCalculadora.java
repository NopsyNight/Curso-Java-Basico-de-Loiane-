package questoes.questoesAula33.questao2;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe 2 números e descubra o valor deles em soma, subtração, multiplicação, divisão e potencialização: ");

        System.out.println("Num1: ");
        int num1 = scan.nextInt();
        System.out.println("Num2: ");
        int num2 = scan.nextInt();

        System.out.println("Soma: " +
                Calculadora.soma(num1, num2));
        System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + Calculadora.dividir(num1, num2));
        System.out.println("Potencialização: " + Calculadora.potencializar(num1, num2));

    }
}
