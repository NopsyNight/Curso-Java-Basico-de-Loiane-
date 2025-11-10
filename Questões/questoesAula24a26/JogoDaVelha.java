package questões.questoesAula24a26;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                tabuleiro[i][j] = ' ';
            }
        }

        char jogadorAtual = 'X';
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            mostrarTabuleiro(tabuleiro);
            System.out.println("Vez do jogador '" + jogadorAtual + "'");

            System.out.println("Informe a linha (0, 1 ou 2)");
            int linha = scan.nextInt();

            System.out.println("Informe a coluna (0, 1 ou 2)");
            int coluna = scan.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2){
                System.out.println("Posição Inválida! Tente novamente.");
                continue;
            }

            if (tabuleiro[linha][coluna] != ' '){
                System.out.println("Esta posição já está ocupada! Tente outra.");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;

            if(verificarVitoria(tabuleiro, jogadorAtual)){
                mostrarTabuleiro(tabuleiro);
                System.out.println("Jogador '" + jogadorAtual + "' venceu!");
                jogoAtivo = false;
            } else if (tabuleiroCheio(tabuleiro)){
                mostrarTabuleiro(tabuleiro);
                System.out.println("Empate! O tabuleiro está cheio.");
                jogoAtivo = false;
            } else{
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
    }

    public static void mostrarTabuleiro(char[] [] tab) {
        System.out.println("\n  0   1   2");
        for(int i = 0; i < 3; i++){
            System.out.println(i + " " + tab[i][0] + " | " + tab[i][1] + " | " + tab[i][2]);
            if (i < 2){
                System.out.println(" ---+---+---");
            }
        }
        System.out.println();
    }

    public static boolean verificarVitoria(char[][] t, char j){
        // Linhas
        for(int i = 0; i < 3; i++){
            if (t[i][0] == j && t[i][1] == j && t[i][2] == j)
                return true;
        }

        // Colunas
        for (int i = 0; i < 3; i++){
            if (t[0][i] == j && t[1][i] == j && t[2][i] == j)
                return true;
        }

        if(t[0][0] == j && t[1][1] == j && t[2][2] == j)
            return true;

        if(t[0][2] == j && t[1][1] == j && t[2][0] == j)
            return true;

        return false;
    }

    public static boolean tabuleiroCheio(char[][] tab) {
        for (int i = 0; i < 3; i++) {
            for (int j =0; j < 3 ; j++){
                if (tab[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
}
