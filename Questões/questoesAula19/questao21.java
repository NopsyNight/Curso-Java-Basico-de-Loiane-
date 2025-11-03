package questões.questoesAula19;

// Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão:
// A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar um programa que determine o percentual de números 0's e 's existentes no vetor A.

public class questao21 {
    public static void main(String[] args){

        int[] vetorA = new int[10];
        int contadorZeros = 0;
        int contadorUns = 0;

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random() * 1);

            if (vetorA[i] == 0){
                contadorZeros++;
            }else{
                contadorUns++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i= 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("A porcentagem de números ímpares é de: " + (contadorZeros * 10) + "% e a porcentagem de números pares é de: " + (contadorUns * 10) + "%.");
    }
}
