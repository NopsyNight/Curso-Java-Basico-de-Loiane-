package questões.questoesAula16_17;

// Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor, e a soma dos valores.

import java.util.Scanner;
import java.util.Arrays;

public class questao18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double numeros[] =  new double[10]; // cria array de 5 posições.

        int soma = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Informe o " + (i +1) + "ª número: ");
            numeros[i] = scan.nextDouble(); // Jogará os números para a lista.
            soma += numeros[i];
        }

        Arrays.sort(numeros);

        System.out.println("Resultado:" +
                "\nMaior Número: " + numeros[9] +
                "\nMenor Número: " + numeros[0] +
                "\nA Soma dos valores: "+ soma  );
    }
}
