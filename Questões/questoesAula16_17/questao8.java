package questões.questoesAula16_17;

// Faça um programa que leia 5 numeros, e informe a soma e média dos números.


import java.util.Scanner;

public class questao8 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double numeros[] =  new double[5]; // cria array de 5 posições.

        for(int n1 = 0; n1 < 5; n1++){
            System.out.println("Informe o " + (n1+1) + "ª número: ");
            numeros[n1] = scan.nextDouble(); // Jogará os números para a lista.
        }

        double soma = 0;

        for (int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }

        double media = soma / numeros.length;

        System.out.println("A soma de todos os números: " + soma);
        System.out.println("A média é: " + media);
    }
}
