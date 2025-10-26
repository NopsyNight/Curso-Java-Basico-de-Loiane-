package Aulas.Aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");

        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }

        // valor <= 10 - muito barato
        // se 10 < valor < 15 - pedir desconto
        // se 15 <= valor 17 - pesquisar mais
        // >= 17 - ta muito caro

        System.out.println("Entre com o preço do item: ");
        double valor = scan.nextDouble();

        if (valor <= 10){
            System.out.println("Muito barato");
        }else if (valor < 10 && valor < 15){
            System.out.println("Pedir desconto");
        }else if (valor < 15 && valor <= 17){
            System.out.println("Pesquisar um pouco mais");
        }else { // valor >= 17
            System.out.println("Seloko Num Compensa");
        }
    }
}
