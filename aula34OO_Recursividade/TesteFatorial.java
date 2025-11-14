package aulas.aula34OO_Recursividade;

public class TesteFatorial {
    public static void main(String[] args){

        int fatorialNR = CalcularFatorial.calcularFatorial(5);
        System.out.println(fatorialNR);

        int fatorialR = CalcularFatorial.fatorial(5);
        System.out.println(fatorialR);
    }
}
