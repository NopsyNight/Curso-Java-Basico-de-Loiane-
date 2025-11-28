package aulas.aula50_exceptions_erro_e_exceptions;

public class ErroEException {
    public static void main(String[] args){
        // Pensa que o Erro no java ele somente identifica e diz o que o java tem de erro, mas não é possível tratá-lo, sendo somente possível saber a existência dele, e quando ele é acionado, o programa termina. Sendo considerada uma classe não verificável

        // No exception, já é outra visão, onde ele pode ser separado entre as verificadas e não verificáveis.

        // As não verificadas acontecem durante o tempo de execução do programa, quando você roda ele, e ele identifica as exceções não verificadas, que chamamos RuntimeException e dentro dela temos várias familias de erros, como: ArrayIndexOutOfBoundsException, NullPointerException, ArithmeticException, ClassCastException e entre outras.

        // Curiosidade sobre NullPointerException: Pode ocorrer quando você chama um objeto que ainda não foi instanciado na classe, e o ClassCastException é um tipo de exceção que ocorre na hora de converter, como upcasting ou downcasting.

        // E existem as verificáveis que são as excessões mais famosas: IOException que faz quando ao acesso de arquivos, ou leitura e escrita de arquivo e também as exceções de SQLException que irá ser comentado quando iniciarmos o java com MySQl.
    }
}
