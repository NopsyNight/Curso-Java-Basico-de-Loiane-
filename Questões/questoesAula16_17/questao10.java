package questões.questoesAula16_17;

// Faça um programa que receba dois números inteiros e gere os números interios que estão no intervalo compreendido por eles.

import java.util.Scanner;
import java.util.Arrays;

public class questao10 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Informe um número (Inteiro por favor.): ");
            int numero1 = scan.nextInt();

            if (numero1 % 2 == 1){
                System.out.println("Por favor, insira um número inteiro.");
                continue;
            }else{
                System.out.println("Insira outro número: ");
                int numero2 = scan.nextInt();

                if (numero2 % 2 == 1){
                    System.out.println("Por favor, insira um número inteiro.");
                    continue;
                }else{
                    int numeros[] = {numero1, numero2};

                    Arrays.sort(numeros);

                    for (;numeros[0] <= numeros[1]; numeros[0]++){

                        System.out.println(numeros[0]);                        }
                    }

                System.out.println("Espero que tenha aproveitado!");
                System.out.println("Quer tentar de novo?");
                String pergunta = scan.next();

                if(pergunta.equalsIgnoreCase("sim")){
                    continue;
                }else if (pergunta.equalsIgnoreCase("não")){
                    System.out.println("Até logo!");
                    break;
                }
            }
        }

    }
}
