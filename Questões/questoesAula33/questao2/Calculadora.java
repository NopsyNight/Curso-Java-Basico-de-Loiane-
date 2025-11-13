package questoes.questoesAula33.questao2;

// Escreva uma classe Calculadora que tenha os seguintes métodos: somar, subtrair, dividir , multiplicar e potencializar 2 números.

public class Calculadora {

    public static int soma(int num1, int num2){
        return num1+num2;
    }

    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static int dividir(int num1, int num2){
        return num1 / num2;
    }

    public static int potencializar(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }
}
