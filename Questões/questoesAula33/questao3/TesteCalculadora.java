package questoes.questoesAula33.questao3;


import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número para descobrir a fatorial: ");
        int numero = scan.nextInt();

        System.out.println(numero +"! = "+ Calculadora.fatorial(numero));

    }
}
