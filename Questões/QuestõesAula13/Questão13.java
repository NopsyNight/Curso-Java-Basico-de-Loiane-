package Questões.QuestõesAula13;

// Tendo como dados de entrada da altura e sexo de uma pessoa, costrua um algoritmo que calcule seu peso ideal, utilizando as seguintes formulas:
// Para homens: (72.7 * altura) - 58
// Para mulheres: (62.1 * altura) - 44.7
// Peça o peso altual da pessoa e diga se está dentro, acima ou abaixo do peso.

import java.util.Scanner;

public class Questão13 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Cálculo do Peso Ideal Para Homens e Mulheres ---");
        System.out.println("Informe sua altura: ");
        float altura = scan.nextFloat();
        System.out.println("Informe se você é Homem ou Mulher: ");
        String sexo = scan.next();

        // Seguindo o cálculo precisará do if e else, pois não há como deixar os dois cálculos sem o programa saber quem é mulher ou homem.
        if (sexo.equalsIgnoreCase("Homem")) {
            float calculoH = (72.7f * altura) - 58f;
            System.out.println("Seu peso ideal é: " + calculoH + "Kg.");

            System.out.println("Informe seu peso ideal: ");
            float pesoAtual = scan.nextFloat();

            if(pesoAtual == calculoH){

              System.out.println("Você está no peso ideal :D");
            }
            else if (pesoAtual > calculoH){

                System.out.println("Você não está no peso ideal. Está acima do peso, tente melhorar sua rotina alimentar e consuma mais frutas e menos carboidratos e açúcares!");
            }else if (pesoAtual < calculoH){

                System.out.println("Você não está no peso ideal. Está muito abaixo do peso, tente se alimentar mais, dando valor a mais carboidratos! ");
            }else{

                System.out.println("Erro! Tente novamente!");
            }
        }
        // Cálculo Mulher
        else if (sexo.equalsIgnoreCase("Mulher")){ //"equalsIgnoreCase" serve para ser igual, e ignorar se a palavra está capitalizada, Maiúsculas ou mínusculas.
            float calculoM = (62.1f * altura) - 44.7f;

            System.out.println("Seu peso ideal é: " + calculoM + "Kg.");

            System.out.println("Informe seu peso atual: ");
            float pesoAtual = scan.nextFloat();

            if(pesoAtual == calculoM){
                System.out.println("Você está no peso ideal :D");
            }
            else if (pesoAtual > calculoM){
                System.out.println("Você não está no peso ideal. Está acima do peso, tente melhorar sua rotina alimentar e consuma mais frutas e menos carboidratos e açúcares!");
            }else if (pesoAtual < calculoM){

                System.out.println("Você não está no peso ideal. Está muito abaixo do peso, tente se alimentar mais, dando valor a mais carboidratos! ");
            }else{
                System.out.println("Erro! Tente novamente!");
            }
        }
    }
}
