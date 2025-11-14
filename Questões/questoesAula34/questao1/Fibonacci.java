package questoes.questoesAula34.questao1;

// Escreva um método recursivo e estático que calcule e retorne o Nonésimo termo da sequência de Fibonacci. Alguns números desta sequência são: 0, 1, 2, 3 , 5, 8, 13, 21, 34, 55, 89...
public class Fibonacci {

    public static int fibonnaci(int num){
        if (num < 2){
            return num;
        }
        else{
            return fibonnaci(num - 1) + fibonnaci(num - 2);
        }

    }
}
