package questões.questõesAula14_e_15;

// Faça um programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
// Observando os termos no plural a colocação do "e", da virgula entre outros. Exemplo:
// 326 = 3 centenas 2 dezenas e 6 unidades.
// 12 = 1 dezena e 2 unidades
// Testar com : 326, 300, 100, 320, 310, 305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1 , 7 e 16

import java.util.Scanner;

public class questao19 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("--- Descubra quantas casas tem esse número ---");
        System.out.println("Informe um número menor que (1000)");

        int numero = scan.nextInt();

        if (numero >= 1000){
            System.out.println("Error! Tente um número menor que 1000 por favor.");
        }else{
            int unidade = numero % 10;
            int dezena = (numero / 10) % 10;
            int centena = (numero / 100) % 10;

            // “se o número for 1, escreva ‘unidade’, senão escreva ‘unidades’”. Obs: pego do chatgpt pq eu queria fazer 100% bonito e bem feito, não tinha outra forma de fazer com infinito if else, ia ser chato demais.

            String unidadeTexto = unidade == 1 ? "unidade" : "unidades";
            String dezenaTexto = dezena == 1 ? "dezena" : "dezenas";
            String centenaTexto = centena == 1 ? "centena" : "centenas";

            System.out.println();
            System.out.println("Resultado:");
            System.out.println(centena + " " + centenaTexto + " , " + dezena + " " + dezenaTexto + " e " + unidade + " " + unidadeTexto);
        }
    }
}
