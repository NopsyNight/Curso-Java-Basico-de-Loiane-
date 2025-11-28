/* package aulas.aula51_exceptions_criando_sua_propria_exception;

public class UsandoMinhaException {
    public static void main(String[] args){

        try{
         teste();
        }
        catch (DivisaoNaoExata e){
            e.printStackTrace();
        }
    }
}

    public static void teste() throws  DivisaoNaoExata{
        int[] numeros = {4, 8, 5, 16, 21, 32, 64 , 128};
        int[] denominadores = {2, 0, 4, 8 , 0, 2, 3};

        for(int i = 0; i < numeros.length; i++){
            try{
                if (numeros[i] % 2 != 0){
                    // lançar exception
                    // throw new Exception("Número ímpar, divisão não exata");
                    throw new DivisaoNaoExata(numeros[i], denominadores[i]);
                }
                System.out.println(numeros[i] + "/"+ denominadores[i] + " = "+(numeros[i]/denominadores[i]));
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException exception){
                System.out.println("Ocorreu um erro no programa");
            }
        }
}
 */
