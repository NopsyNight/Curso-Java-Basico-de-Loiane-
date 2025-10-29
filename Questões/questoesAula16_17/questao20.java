package questões.questoesAula16_17;

// Altere o programa de cálculo do fatorial, permitindo o usuário calcular fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.

import java.util.Scanner;

public class questao20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("--- Fatorial ---");
            System.out.println("Informe um número para saber o seu fatorial: ");
            int numero = scan.nextInt();
            if (numero > 16 || numero < 0){
                System.out.println("Informe somente números menores que 16 e postivos.");
                continue;
            }else{
                int fatorial = 1;

                for (int i =  numero; i > 1; i--) {
                    fatorial *= i;
                    System.out.println(i + "! = " + fatorial);
                }
                System.out.println("O fatorial de " + numero + " é: " + fatorial);

                System.out.println("Deseja repetir o cálculo? :");
                String resposta = scan.next();

                if (resposta.equalsIgnoreCase("sim")){
                    continue;
                }else if (resposta.equalsIgnoreCase("não")){
                    System.out.println("Até logo!");
                    break;
                }
            }

        }

    }
}
