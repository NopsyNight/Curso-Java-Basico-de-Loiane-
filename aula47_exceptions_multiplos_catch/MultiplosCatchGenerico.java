package aulas.aula47_exceptions_multiplos_catch;

public class MultiplosCatchGenerico {
    public static void main(String[] args){

        // Catch Throwable é uma super classe de erros e excessões que fazem com que caso você não saiba o tipo de erro, ela pode fazer uma varredura por si própria.

        int[] numeros = {4, 8, 16, 32 , 64 , 128};
        int[] denominadores = {2, 0, 4, 8 , 0};

        for(int i = 0; i < numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/"+ denominadores[i] + " = "+(numeros[i]/denominadores[i]));
            }
            catch(Throwable e1){
                System.out.println("Ocorreu um erro no programa");
            }
        }
    }
}
