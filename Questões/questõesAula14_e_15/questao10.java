package questões.questõesAula14_e_15;

// Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Verspetino ou N-Noturno. Imprima a mensagem "Bom dia", "Boa Tarde", "Boa Noite" ou "Valor Inválido", conforme o caso.

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe em que turno você estuda (M para Matutino, V para Verspetino ou N para Noturno): ");
        String turno = scan.next();

        switch (turno){
            case "m": ;
            case "M": System.out.println("Bom Dia!"); break;
            case "n":
            case "N": System.out.println("Boa Tarde!");break;
            case "V":
            case "v": System.out.println("Boa Noite!"); break;
            default: System.out.println("Valor Inválido");break;
        }
    }
}
