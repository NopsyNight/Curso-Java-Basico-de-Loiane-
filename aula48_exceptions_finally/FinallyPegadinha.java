package aulas.aula48_exceptions_finally;

public class FinallyPegadinha {
    public static void main(String[] args){

        int[] numeros = {4, 8, 16, 32 , 64 , 128};
        int[] denominadores = {2, 0, 4, 8 , 0};

        for(int i = 0; i < numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/"+ denominadores[i] + " = "+(numeros[i]/denominadores[i]));
            }
            catch(ArithmeticException e1){
                System.out.println("Erro ao dividir por zero"); // tratamento do 1º erro
                System.exit(0);
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("Erro por falta de um denominador para dividir o número.");
                System.exit(0);
            }
            finally {
                System.out.println("Essa linha é impressa sempre após o try ou catch");
                System.out.println();
            }
        }
        // O " System.exit(0); é uma linha que ao terminar a execução do programa dentro do try ou catch, o finally não será executado
    }
}
