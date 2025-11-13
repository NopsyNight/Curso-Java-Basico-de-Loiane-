package aulas.aula33OO_Variáveis_e_metodos_estaticos;

public class TesteMinhaCalculadora {

    static int resultadoSoma;

    public static void main(String[] args){

        resultadoSoma = MinhaCalculadora.soma(1, 2);
        // Depois de aplicar o static:

        // MinhaCalculadora calculadora = new MinhaCalculadora();
        // calculadora.soma(1,2);

        // Não vai precisar aplicar uma variável a classe.

        int soma1 = MinhaCalculadora.soma(1, 2);

        System.out.println(soma1);

        int soma2 = MinhaCalculadora.soma(1,2,3);

        System.out.println(soma2);

        soma2Valores(1, 2);
    }

    static int soma2Valores(int num1, int num2){
        return MinhaCalculadora.soma(num1,num2);
    }
}
