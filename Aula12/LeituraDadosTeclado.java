package Aulas.Aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();

        System.out.println("Sua altura é: " + altura);*/

        // Código de Loiane não funciona mais nos dias de hoje 2025

        /*
        System.out.println("Digite seu Nome completo, sua idade, quantidade de filhos,  sua altura e se possuí algum animal de estimação:");

        String nomeCompleto = scan.nextLine();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Nome Completo " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Se possuí Pet: " + temPet);
         */

        // Código Atual Funcional
        System.out.println("Digite seu Nome completo:");
        String nomeCompleto = scan.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();

        System.out.println("Digite a quantidade de filhos:");
        byte qtdFilhos = scan.nextByte();

        System.out.println("Digite sua altura:");
        float altura = scan.nextFloat();

        System.out.println("Possui algum animal de estimação (true/false):");
        boolean temPet = scan.nextBoolean();

        scan.nextLine();

        System.out.println("\nVocê digitou os seguintes valores:");
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Possui Pet: " + temPet);

    }
}
