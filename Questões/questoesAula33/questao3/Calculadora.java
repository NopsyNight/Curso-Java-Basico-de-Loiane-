package questoes.questoesAula33.questao3;

// Escreva um método para calcular fatorial de um número na classe calculadora do exercício anterior.

public class Calculadora {

    public static long fatorial(int numero){
        if (numero < 0){
            System.out.println("Fatorial não aceita números negativos!");
            return 0;
        }
        long resultado = 1;

        for (int i = 1; i<= numero; i++){
            resultado *= i;
        }

        return resultado;
    }

}
