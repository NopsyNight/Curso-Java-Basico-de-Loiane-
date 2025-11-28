package aulas.aula49_exceptions_stacktrace_throws;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args){

        System.out.println("Entre com um número decimal: ");
        try{
            double num = lerNumero();
            System.out.println("Você digitou: " + num);
        }
        catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }

    }

    public static double lerNumero() throws Exception{
        Scanner scan = new Scanner(System.in);

        double num = scan.nextDouble();
        return num;

        // Em vez de apenas utilizar o try e cacth, o throws seria uma forma de pular essa etapa de erro e reduzir o código
    }
}
