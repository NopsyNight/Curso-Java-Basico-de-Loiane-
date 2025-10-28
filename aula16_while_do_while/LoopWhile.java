package aulas.aula16_while_do_while;

public class LoopWhile {
    public static void main(String [] args){

        // While:

        int i = 1; // count ou cont
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i ++; // i = i + 1; ou i += 1;
        }

        System.out.println(i); // i = 11;

        // Do While:

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);

        System.out.println(i); // i = 15
    }
}
