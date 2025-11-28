package aulas.aula46_Exceptions_try_catch;

public class Excecao {
    public static void main(String[] args){

        /*
        int[] vetor = new int[4];

        System.out.println("Antes da exception");

        vetor[4] = 1;

        System.out.println("Esse texto não será impresso");
         */

        // dará erro no console que irá informar que está errado

        // temos:

        /*
        try{
            // bloco que é monitorado para erro
        }
        catch (TipoDaException exception){
            // tratamento Erro
        }
         */

        // então:
        try{
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Esse texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um índice do vetor que não existe");
        }

        System.out.println("Esse texto será impresso após a exception");

        // Por que utilizar tratamentos de exceções?

        // Pois não tratar erros fazem a execução do programa terminar e você terá que reiniciar o programa inteiro para poder rodar novamente.

        // Ao tratar erros:
        // Permite que o programa execute uma determinada lógica caso o erro aconteça e ele não irá fechar por completo.
    }
}
