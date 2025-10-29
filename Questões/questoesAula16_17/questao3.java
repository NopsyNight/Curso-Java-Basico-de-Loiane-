package questões.questoesAula16_17;

// Faça um programa que leia e valide as seguintes informações:
// Nome: maior que 3 caracteres;
// Idade: entre 0 e 150;
// Salário: maior que zero;
// Sexo: "F" ou "M";
// Estado Civil: 's', 'c', 'v', 'd'.

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        boolean infoVálida = false; // Quando a opção é verdadeira no for vai abrir a linha pra prosseguir o código

        String nome;
        do {
            System.out.println("Entre com o nome: ");

            nome = scan.next();
            if (nome.length() >= 3){
                infoVálida = true;
            } else{
                System.out.println("Nome precisa no mínimo de 3 caracteres.");
            }
        } while (!infoVálida);

        infoVálida = false;

        int idade;

        do {
            System.out.println("Entre com sua idade (Entre 1 à 150");

            idade = scan.nextInt();

            if (idade < 0 || idade > 150){
                System.out.println("Informe uma idade entre os números pedidos na pergunta.");
            }else{
                infoVálida = true;
            }
        } while (!infoVálida);

        infoVálida = false;

        double salario;

        do {
            System.out.println("Informe seu salário: ");

            salario = scan.nextDouble();

            if (salario > 0){
                infoVálida = true;
            } else{
                System.out.println("Informe um salário válido");
            }
        } while (!infoVálida);

        infoVálida = false;

        String sexo;

        do {
            System.out.println("Informe seu sexo com 'f' ou 'M' :");

            sexo = scan.next();

            if (sexo.equalsIgnoreCase("m" ) || sexo.equalsIgnoreCase("f")){
                infoVálida = true;
            }else{
                System.out.println("ERRO! Tente informar o sexo correto.");
            }

        } while(!infoVálida);

        infoVálida = false;

        String estadoCivil;

        do {
            System.out.println("Informe seu Estado Civil ('s', 'c', 'v', 'd') : ");

            estadoCivil = scan.next();
            if (estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("d")){
                infoVálida = true;
            }else{
                System.out.println("ERRO! Tente novamente.");
            }

        } while (!infoVálida);

        System.out.println("Seu nome é: " + nome
                          +"\nIdade: " + idade
                          + "\nSalário: " + salario
                          + "\nSexo: " + sexo
                          + "\nEstado Civil: " + estadoCivil);
    }
}
