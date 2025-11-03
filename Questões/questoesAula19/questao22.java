package questões.questoesAula19;

// Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos do vetor A são pares. Se pelo menos um elementor vetor não for par o processo de repetição para percorrer os elementos do vetor deve ser encerrado, como sugestão:
// Utilize uma variável do tipo flag para atingir este propósito

import java.util.Scanner;

public class questao22 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean todosPares = true;

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Informe o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                todosPares = false;
                break;
            }
        }

        if (todosPares){
            System.out.println("Todos os números são pares.");
        }else{
            System.out.println("Nem todas as variáveis foram pares");
        }

    }
}
