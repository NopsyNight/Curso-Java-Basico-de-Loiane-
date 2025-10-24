package Questões.QuestõesAula13;

// Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de internet (em Mbps), calcule e informe o tempo aproxima de download do arquivo usando este link (em minutos).

import java.util.Scanner;

public class Questão18 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("--- Download de Arquivos ---");
        System.out.println("Informe o tamanho do arquivo (Em MB): ");
        double arquivo = scan.nextDouble();
        System.out.println("Informe quanto de velocidade você tem (Em Mbps): ");
        double velocidadeInternet = scan.nextDouble();

        double mbpsParaMb = velocidadeInternet / 8;

        double tempoDeDonwload = arquivo / mbpsParaMb;

        double tempoDeDownloadMinutos = Math.ceil(tempoDeDonwload / 60);

        System.out.println("O donwload estará aproximadamente completo em: " + tempoDeDownloadMinutos + " Minutos!");

    }
}
