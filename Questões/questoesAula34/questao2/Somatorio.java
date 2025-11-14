package questoes.questoesAula34.questao2;

// Escreva um método recursivo e estático que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N

public class Somatorio {

    public static int somatorio(int num){
        if (num == 0){
            return num;
        }
        return num + somatorio(num - 1);

    }
}
