package questões.questoesAula16_17;

// Altere o programa anterior e ele somente aceite entre 0 e 1000.
// O que? por que? KKKKKKKKKKKKKKKKK

import java.util.Arrays;
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double numeros[] =  new double[10]; // cria array de 5 posições.

        int soma = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Informe o " + (i +1) + "ª número: ");
            double entrada = scan.nextDouble();
            if (entrada < 0 || entrada > 1000){
                System.out.println("O Programa não aceita números maiores que 1000 ou negativos, tente novamente.");
                i--;
            }else{
                numeros[i] = entrada; // // aceita o número
                soma += numeros[i];
            }

        }

        Arrays.sort(numeros);

        System.out.println("Resultado:" +
                "\nMaior Número: " + numeros[9] +
                "\nMenor Número: " + numeros[0] +
                "\nA Soma dos valores: "+ soma  );
    }
}
