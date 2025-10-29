package questões.questoesAula16_17;

// Aletere o programa anteriro para no final a soma dos números.

import java.util.Arrays;
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int soma = 0;
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

                        System.out.println(numeros[0]);

                         soma += numeros[0];
                    }

                    System.out.println("A soma entre esses números é: " + soma);
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
