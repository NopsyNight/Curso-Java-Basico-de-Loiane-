package questões.questoesAula16_17;

// Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores. Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class questao26 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int contVoto1 = 0;
        int contVoto2 = 0;
        int contVoto3 = 0;
        int contNulo = 0;

        while (true){
            System.out.println("--- Eleições ---");
            System.out.println("Informe qual candidato que você quer votar: " +
                    "\nCandidato01: Cod: 1" +
                    "\nCandidato02: Cod: 2" +
                    "\nCandidato03: Cod: 3" +
                    "\nNulo ou Branco: Cod: 0.");
            System.out.println("-> ");

            int voto = scan.nextInt();

            if (voto == 1){
                contVoto1++;
            } else if (voto == 2){
                contVoto2++;
            } else if (voto == 3){
                contVoto3++;
            }else if(voto == 0){
                contNulo++;
            }else{
                System.out.println("ERROR! Código Inválido.");
            }

            System.out.println("Deseja continuar a votação? (sim/não) : ");
            String pergunta = scan.next();

            if (pergunta.equalsIgnoreCase("não")) {
                break;
            }
        }

        System.out.println("\n Resultado da Eleição");
        System.out.println("Candidato 1: " + contVoto1+
                "\nCandidato02: " + contVoto2+
                "\nCandidato03: " + contVoto3 +
                "\nVotos Nulos: " + contNulo );

        int vencedor = Math.max(contVoto1, Math.max(contVoto2, contVoto3));

        if (vencedor == contVoto1 && vencedor != contVoto2 && vencedor != contVoto3){
            System.out.println("\nO vencedor foi o Candidato 1");
        }else if(vencedor == contVoto2 && vencedor != contVoto1 && vencedor != contVoto3){
            System.out.println("\nO vencedor foi o Candidato 2");
        }else if(vencedor == contVoto3 && vencedor != contVoto1 && vencedor != contVoto2){
            System.out.println("\nO vencedor foi o Candidato 3");
        }else{
            System.out.println("\nHouve um empate entre os candidatos");

        }
    }
}