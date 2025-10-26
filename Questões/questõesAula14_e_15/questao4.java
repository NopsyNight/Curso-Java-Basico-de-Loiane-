package questões.questõesAula14_e_15;

// Faça um Programa que verifique se uma listra digitada é vogal ou consoante.

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Verifique se essa letra é vogal ou consoante (Insira somente uma letra): ");
        String pergunta = scan.next();

        switch(Character.toLowerCase(pergunta.charAt(0))){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("A letra: " + pergunta + " é vogal."); break;
            default: System.out.println("A letra: " + pergunta + " é consoante"); break;
        }
    }
}
