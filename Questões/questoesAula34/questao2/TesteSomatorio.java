package questoes.questoesAula34.questao2;

import java.util.Scanner;

public class TesteSomatorio {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = scan.nextInt();

        System.out.println("A somatória dos números 1 até " + num + " será de: " + Somatorio.somatorio(num));
    }
}
