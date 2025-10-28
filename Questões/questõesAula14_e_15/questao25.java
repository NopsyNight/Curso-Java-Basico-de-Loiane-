package questões.questõesAula14_e_15;

// Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//1. "Telefonou para Vítima?"
//2. "Esteve no local do crime?"
//3. "Mora perto da vítima?"
//4. "Devia para vítima?"
//5. "Já trabalhou com a vítima?"

import java.util.Scanner;

public class questao25 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int nivelSuspeito = 0;

        System.out.println("--- Interrogatório ---");

        System.out.println("Informe se você telefonou para vítima (sim ou não): ");
        String pergunta1 = scan.next();
        if (pergunta1.equalsIgnoreCase("sim")){
             nivelSuspeito += 1;
        }

        System.out.println("Informe se você esteve no local do crime (sim ou não): ");
        String pergunta2 = scan.next();
        if (pergunta2.equalsIgnoreCase("sim")){
            nivelSuspeito += 1;
        }

        System.out.println("Informe se você mora perto da vítima (sim ou não): ");
        String pergunta3 = scan.next();
        if (pergunta3.equalsIgnoreCase("sim")){
            nivelSuspeito += 1;
        }

        System.out.println("Infrome se você devia para vítima (sim ou não): ");
        String pergunta4 = scan.next();
        if (pergunta4.equalsIgnoreCase("sim")){
             nivelSuspeito += 1;
        }

        System.out.println("Informe se você já trabalhou com a vítima (sim ou não): ");
        String pergunta5 = scan.next();
        if (pergunta5.equalsIgnoreCase("sim")) {
            nivelSuspeito += 1;
        }

        if (nivelSuspeito >=2){
            System.out.println("Você é Suspeito");
        }else if (nivelSuspeito <= 4){
            System.out.println("Você é Cúmplice");
        }else if (nivelSuspeito == 5){
            System.out.println("Você é Assassino.");
        }else{
            System.out.println("Você é Inocente.");
        }
    }
}
