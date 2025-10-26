package questões.questõesAula14_e_15;

// Faça um programa que verifique se uma letra digita é "F" ou "M" Conforme o usuário escrever: F - Feminino, M - Masculino, e se não for nenhum dos dois, coloque Sexo Inválido.

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um sexo: ");
        String sexo = scan.next();

        switch(Character.toLowerCase(sexo.charAt(0))){ // "Character.toLowerCase" serve para colocar um caractere em minúscula e "charAt" serve para apenas captrar o primeiro caractere
            case 'm': System.out.println("Masculino"); break;
            case 'f': System.out.println("Feminino"); break;
            default: System.out.println("Sexo inválido");
        }
    }
}
