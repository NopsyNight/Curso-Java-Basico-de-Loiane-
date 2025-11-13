package aulas.aula33OO_Variáveis_e_metodos_estaticos;

// Aplicando o static.

public class MinhaCalculadora {

    public static int soma(int num1, int num2){
        return num1+num2;
    }

    public static int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static double soma (double num1, double num2){
        return num1 + num2;
    }

    public static int soma(int[] vetorInteiros){

        int total = 0;

        for (int i = 0; i< vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }

        return total;
    }

    // O modificador Static basicamente faz com que você não precise da instância da classe para poder acessar um método ou uma variável por conta que as classes, não possuem uma lógica de programação reestrita como é aprendida nas aulas.
}
