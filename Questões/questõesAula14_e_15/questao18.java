package questões.questõesAula14_e_15;

// Faça um programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.

import java.util.Scanner;

public class questao18 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma data no formato dd/mm/aaaa");
        String data = scan.next();

        String[] partes = data.split("/");

        if (partes.length != 3){
            System.out.println("Formato inválido. Use dd/mm/aaaa");
            return;
        }

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        boolean dataValida = true;

        if (mes < 1 || mes > 12){
            dataValida = false;
            System.out.println("Mês inválido");
        }else {
            int diasNoMes;

            // Define quantos dias tem cada mês
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                diasNoMes = 31;
            }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
                diasNoMes = 30;
            }else{
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
                    diasNoMes = 29;
                } else {
                    diasNoMes = 28;
                }
            }
            if (dia < 1 || dia > diasNoMes){
                dataValida = false;
                System.out.println("Dia inválido");
            }
        }

        if (dataValida){
            System.out.println("A data " + data + "é válida.");
        }else {
            System.out.println("A data " + data + "é inválida.");
        }
    }
}
