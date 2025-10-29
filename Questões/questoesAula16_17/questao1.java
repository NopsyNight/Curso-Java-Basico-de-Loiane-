package questões.questoesAula16_17;

// Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while (true){ // Loop será eterno até uma opção marcar para encerrar.
            System.out.println("Informe uma nota (entre 0 e 10) : ");
            double nota = scan.nextDouble();

            if (nota > 10 || nota < 0){
                System.out.println("Nota incorreta, Informe novamente.");
            }else{
                System.out.println("Nota correta.");
                System.out.println("Tenha um bom dia.");
                break; // Opção que quebra o loop.
            }
        }
    }
}
