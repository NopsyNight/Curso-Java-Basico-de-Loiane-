package questões.questõesAula14_e_15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("--- Veja Números de Forma Decrescente ---");
        System.out.println("Informe o primeiro número: ");
        double numero1 = scan.nextDouble();
        System.out.println("Informe o segundo número: ");
        double numero2 = scan.nextDouble();
        System.out.println("Informe o terceiro número: ");
        double numero3 = scan.nextDouble();

        Double[] numeros = {numero1, numero2, numero3}; // O "D" maiúsculo serve para transforma ele em "wrapper" (Um objeto que "envolve" o tipo primitivo, ou seja, transforma esse tipo primitivo usável em recursos de classes.

        Arrays.sort(numeros, Collections.reverseOrder());
        // "Collections.reverseOrder()" Serve como no próprio nome rever a ordem da lista de crescente para decrescente.

        System.out.println("Em ordem decrescente: "+ Arrays.toString(numeros));
        // Como transformamos o double em Double, ele fica sem ser identificado como uma variável com informações como o normal "double", então Arrays.toString() serve como o próprio nome fala, transforma novamente em String.
    }
}
