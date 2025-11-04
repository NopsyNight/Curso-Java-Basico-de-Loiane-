package questões.questoesAula20;

// Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima a matriz criada e encontre a quantidade de números pares, a quantidade de números ímpares.

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double[][] valoresNumeros = new double[3][3];
        int contadoresPares = 0;
        int contadoresImpares = 0;

        for (int l = 0; l < valoresNumeros.length; l++){
            for(int c = 0; c < valoresNumeros.length; c++){
                System.out.println("Informe um número da linha " + (l+1) + " da coluna " + (c+1) + ": ");
                valoresNumeros[l][c] = scan.nextDouble();

                if (valoresNumeros[l][c] % 2 == 1){
                    contadoresImpares++;
                }else if(valoresNumeros[l][c] % 2 ==0){
                    contadoresPares++;
                }
            }
        }

        System.out.println("--- Lista ---");
        for (int i = 0; i <valoresNumeros.length; i++){
            for(int j = 0; j<valoresNumeros.length; j++){
                System.out.print(valoresNumeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("O número pares é de: " + contadoresPares);
        System.out.println("O número de ímpares é de: " + contadoresImpares);

    }
}
