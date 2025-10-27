package questões.questõesAula14_e_15;

// Faça um programa que peça um número correspondente a um determinado ano, e em seguida informe se este ano é ou não bissexto.

import java.util.Scanner;
import java.time.Year;  // importa Uma API do horário e ano.

public class questao17 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano a ser verificado: ");
        int ano = scan.nextInt();

        if (Year.isLeap(ano)){ // "Year.isLeap" significa se ele é bissexto ou não, uso da API.
            System.out.println(ano + " é bissexto ");
        }else{
            System.out.println(ano + " não é bissexto");
        }
    }
}
