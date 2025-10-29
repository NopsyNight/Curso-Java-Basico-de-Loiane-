package questões.questoesAula16_17;

// A série de Fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,34,55... Faça um programa que gere a série até o valor seja maior que 500.

public class questao15 {
    public static void main(String[] args){

        System.out.println("--- Fibonacci --- ");

        int numero1 = 0;
        int numero2 = 1;

        int proximo = 0;
        for (int i = 0; proximo <= 500; proximo++){
            proximo = numero1 + numero2;
            System.out.println(proximo);
            numero1 = numero2;
            numero2 = proximo;
        }
    }
}
