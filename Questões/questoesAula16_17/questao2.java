package questões.questoesAula16_17;

// Faça um programa que leia um nome de usuário e sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

import java.util.Objects;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Informe seu nome de usuário: ");
            String nome = scan.next();

            System.out.println("Informe sua senha: ");
            String senha = scan.next();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Erro! Por favor, insira uma senha diferente do nome de usuário para sua segurança.");
            } else {
                System.out.println("Cadastro feito com sucesso! Bem-vindo(a).");
                break;
            }
        }

        // Ou... "Correção por Loianne Groner"
        /*

        boolean infoValidas = false;
        do {
           System.out.println("Entre com o nome de usuário: ");
           String nome = scan.next();

           System.out.println("Informe sua senha: ");
           String senha = scan.next();

           if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Erro! Por favor, insira uma senha diferente do nome de usuário para sua segurança.");
            } else {
            ifoValidas = true;
                System.out.println("Cadastro feito com sucesso! Bem-vindo(a).");
            }
           }while (!infoValidas);
         */
    }
}
