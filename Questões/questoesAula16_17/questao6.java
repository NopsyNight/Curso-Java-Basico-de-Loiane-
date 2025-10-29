package questões.questoesAula16_17;

// faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args){

        System.out.println("Impressão de números do 1 ao 20. ");

        for(int i = 1; i <= 20; i++){
            System.out.println(i);
        }

        for (int i = 0, j = 1; j<= 20 && i <= 20;i+= 2, j+=2 ){
            System.out.println( i+ " " + j);
        }
    }
}
