package questões.questoesAula16_17;

// A série de Fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,34,55..., Faça um programa que seja capaz de gerar a série até o nonésimo termo.

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args){

        int numero1 = 0;
        int numero2 = 1;

        int proximo = 0;
        for (int i = 0; proximo <= 1200; proximo++){
            proximo = numero1 + numero2;
            System.out.println(proximo);
            numero1 = numero2;
            numero2 = proximo;
        }
    }
}
