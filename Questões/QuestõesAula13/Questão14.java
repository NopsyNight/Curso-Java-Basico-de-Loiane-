package Questões.QuestõesAula13;

// João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário do seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com conteúdo ZERO.

import java.util.Scanner;

public class Questão14 {
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        System.out.println("--- Regulamento de Peso de Peixe ---");
        System.out.println("Informe o peso do peixe que você pescou: ");
        float pesoPeixe = scan.nextFloat();
        if (pesoPeixe <= 50){
            System.out.println("Não há excesso de peso, Tenha um bom dia! Excesso: 0Kg, Multa: R$0");
        }else{
            float excesso = pesoPeixe - 50f;
            float multa = excesso * 4;
            System.out.println("O excesso de peso do peixe foi de: " + excesso + "Kg, O Valor da multa a ser paga será de R$" + multa +".");
        }
    }
}
