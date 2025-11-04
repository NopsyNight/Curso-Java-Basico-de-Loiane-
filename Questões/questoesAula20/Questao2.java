package questões.questoesAula20;

// Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e menor valor da linha 5 e qual é o maior e menor valor da coluna 7.

import java.util.Random;

public class Questao2 {
    public static void main(String[] args){

        int[][] matrizM = new int[10][10];

        Random numeroRadom = new Random();

        int maiorlinha5 = 0;
        int menorlinha5 = 11;
        int linha = 0;
        int coluna = 0;

        int maiorColuna7 = 0;
        int menorColuna7 = 11;

        for (int i = 0; i<matrizM.length; i++){
            for(int j = 0; j<matrizM.length; j++){
                matrizM[i][j] = numeroRadom.nextInt(10);
                if(matrizM[4][j] > maiorlinha5){
                    maiorlinha5 = matrizM[4][j];
                    linha = i;
                    coluna = j;
                }else if(matrizM[4][j] < menorlinha5){
                    menorlinha5 = matrizM[4][j];
                    linha = i;
                    coluna = j;
                }if (matrizM[i][6] > maiorColuna7){
                    maiorColuna7 = matrizM[i][6];
                    linha = i;
                    coluna = j;
                }else if(matrizM[i][6] < menorColuna7){
                    menorColuna7 = matrizM[i][6];
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

        System.out.println("Maior valor da linha 5 = " + maiorlinha5);
        System.out.println("Menor valor da linha 5 = " + menorlinha5);
        System.out.println("Maior valor da coluna 7 = " + maiorColuna7);
        System.out.println("Menor valor da coluna 7 = " +menorColuna7);
    }
}
