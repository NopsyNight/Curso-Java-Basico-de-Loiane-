package aulas.aula34OO_Recursividade;

// Recursividade é basicamente o chamado de um recurso para ele mesmo, um exemplo é quando uma tirinha tem uma ideia de chamar outra tirinha de uma mesma função.

public class CalcularFatorial {

    // Método não recursivo de Fatorial:

    public static int calcularFatorial(int num){
        int total = 1;
        for (int i=num; i> 1; i--){
            total *=1;
        }
        return total;
    }

    // Método recursivo

    public static int fatorial(int num){
        if (num == 0){
            return 1;
        }
        return num * fatorial(num - 1); // Chama ele mesmo
        // Sendo: fatorial(5) = 5 * fatorial(4) = 4*fatorial(3)...
        //até fatorial(0) = 1
    }
}
