package aulas.aula47_exceptions_multiplos_catch;

public class MultiCatch {
    public static void main(String[] args){
        // Essa técnica só está disponível apartir do Java 7+, que faz com que é possível digitar multiplos catch em um mesmo catch de uma mesma família como exemplo abaixo:

        int[] numeros = {4, 8, 16, 32 , 64 , 128};
        int[] denominadores = {2, 0, 4, 8 , 0};

        for(int i = 0; i < numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/"+ denominadores[i] + " = "+(numeros[i]/denominadores[i]));
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException exception){
                System.out.println("Ocorreu um erro no programa");
            }
        }
    }
}
