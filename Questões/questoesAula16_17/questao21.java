package questões.questoesAula16_17;

// Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível por 1 e ele mesmo.

import java.util.Scanner;

public class questao21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Números Primos ---");
        System.out.println("Informe um número:");

        int numero = scan.nextInt();

        boolean primo = true;

        if (numero <= 1){
            System.out.println("Não é Primo");
        }
        // Testa divisores de 2 até a raiz quadrada de 'numero'
        // (não precisa ir até o número todo, isso otimiza)
        for (int i = 2; i <= Math.sqrt(numero); i ++){
            if (numero % i == 0){
                primo = false;
                break;
            }
        }
        if (primo){
            System.out.println("O número " + numero + " é primo!");
        }else{
            System.out.println("O número " + numero + " não é primo!");
        }
    }
}