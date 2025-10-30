package questões.questoesAula16_17;

// Faça um programa que calcule e mostre a média aritmética de N notas

import java.util.ArrayList;
import java.util.Scanner;

public class questao24 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double notas = 0;

        int contador = 0;

        while(true){
            System.out.println("Informe uma nota: ");
            double nota = scan.nextDouble();

            contador++;
            notas += nota;

            System.out.println("Quer Colocar mais notas? :");
            String pergunta = scan.next();
            if (pergunta.equalsIgnoreCase("sim")){
                continue;
            } else if (pergunta.equalsIgnoreCase("não")){
                break;
            }
        }

        double media_aritmetica = notas / contador;
        System.out.println("A média aritmética das " + contador + " notas é: " + media_aritmetica);
    }
}
