package aulas.aula17_for;

public class For {
    public static void main(String[] args){

        // Crescente
        for(int i=0; i <= 10; i++){
            System.out.println("I tem valor: "+ i);
        }

        // System.out.println(i); Não foi criado a variável fora do looping, então não funcionaria a impressão.

        // Decrescente
        for(int i= 5; i > 0; --i){
            System.out.println("I te valor: " + i);
        }

        // for com mais variáveis
        for (int i = 0, j = 10; i <= j ;i++, j-- ){
            System.out.println("I = " + i+ "; j = " + j);
        }

        // Partes Ausentes

        int count = 0;
        for (; count <= 10;){
            System.out.println("Valor de count: " + count);
            count += 2;
        }

        // sem partes ausentes
        for (int cont=0; cont < 10; cont += 2){
            System.out.println("Valor de cont =" + cont);
        }

        // Loop Infinito - Curiosidade, Nunca irá parar de gerar.

        /*for (; ; ){

        }*/

        // Não Recomendado.
        int soma =0;
        for (int i=1; i < 5; soma += i++){
            System.out.println("O valor da soma é: " + soma);
        }

        for (int i = 0; i < 5; i++){
            System.out.println("i tem valor: " + i);
        }
    }
}
