package aulas.aula49_exceptions_stacktrace_throws;

public class ExceptionGenerica {
    public static void main(String[] args){

        int[] numeros = {4, 8, 16, 32 , 64 , 128};
        int[] denominadores = {2, 0, 4, 8 , 0};

        for(int i = 0; i < numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/"+ denominadores[i] + " = "+(numeros[i]/denominadores[i]));
            }
            catch(Exception exc){
                System.out.println(exc.getMessage());
                exc.printStackTrace();// não usa "aconteceu um erro"
            }
        }

        // Error: Resulta na finalização do programa.

        // Exception: possível tratar erro e continuar execução do programa.

        // Os erros como loiane explica, não irão ficar no console, e sim serão lançados aos arquivos de log para ser acessado por uma equipe de desenvolvedores ou um desenvolvedor e descobrir qual foi o erro indicado

    }
}
