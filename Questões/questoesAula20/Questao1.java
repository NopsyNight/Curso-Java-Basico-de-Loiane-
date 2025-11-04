package questões.questoesAula20;

// Gere e imprima uma matriz M 4x4 com valores aleatório entre 0-9. Após isso determine o maior número da matriz e sua posição (linha, coluna)

import java.util.Random;

public class Questao1 {
    public static void main(String[] args){

        int[][] matrizM = new int[4][4];

        Random numeroRadom = new Random();

        for (int i = 0; i<matrizM.length; i++){
            for(int j = 0; j<matrizM.length; j++){
                matrizM[i][j] = numeroRadom.nextInt(9);
            }
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i <matrizM.length; i++){
            for(int j = 0; j<matrizM.length; j++){
                matrizM[i][j] = numeroRadom.nextInt(9);
                if(matrizM[i][j] > maior){
                    maior = matrizM[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int i = 0; i <matrizM.length; i++){
            for(int j = 0; j<matrizM.length; j++){
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maior valor = " + maior);
    }
}
