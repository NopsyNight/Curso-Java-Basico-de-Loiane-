package questões.questoesAula27a32.questao4;

import java.util.Scanner;

public class TesteJogo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();

        System.out.println("=== JOGO DA VELHA ===");

        while (true) {
            jogo.mostrarTabuleiro();
            System.out.println("Vez do jogador " + jogo.getJogadorAtual());
            System.out.print("Informe linha (0-2): ");
            int linha = sc.nextInt();
            System.out.print("Informe coluna (0-2): ");
            int coluna = sc.nextInt();

            if (jogo.jogar(linha, coluna)) {
                if (jogo.verificarVitoria()) {
                    jogo.mostrarTabuleiro();
                    System.out.println("Jogador " + jogo.getJogadorAtual() + " venceu!");
                    break;
                } else if (jogo.tabuleiroCheio()) {
                    jogo.mostrarTabuleiro();
                    System.out.println("Empate!");
                    break;
                }
                jogo.trocarJogador();
            }
        }
    }
}
