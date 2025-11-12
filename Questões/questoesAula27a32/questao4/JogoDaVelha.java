package questões.questoesAula27a32.questao4;

public class JogoDaVelha {

    // ====== ATRIBUTOS (ENCAPSULADOS) ======
    private char[][] tabuleiro;
    private char jogadorAtual;

    // ====== CONSTRUTOR ======
    public JogoDaVelha() {
        this.tabuleiro = new char[3][3];
        this.jogadorAtual = 'X';
        inicializarTabuleiro();
    }

    // ====== MÉTODOS GETTERS E SETTERS ======
    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public char getJogadorAtual() {
        return jogadorAtual;
    }

    public void setJogadorAtual(char jogadorAtual) {
        this.jogadorAtual = jogadorAtual;
    }

    // ====== MÉTODOS PRINCIPAIS ======
    private void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.tabuleiro[i][j] = '-';
            }
        }
    }

    public boolean jogar(int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != '-') {
            System.out.println("Jogada inválida, tente novamente.");
            return false;
        }
        tabuleiro[linha][coluna] = this.jogadorAtual;
        return true;
    }

    public void trocarJogador() {
        if (this.jogadorAtual == 'X') {
            this.jogadorAtual = 'O';
        } else {
            this.jogadorAtual = 'X';
        }
    }

    public void mostrarTabuleiro() {
        System.out.println("Tabuleiro atual:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarVitoria() {
        // Verifica linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) ||
                    (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual)) {
                return true;
            }
        }

        // Verifica diagonais
        if ((tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
                (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual)) {
            return true;
        }

        return false;
    }

    public boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
