package questões.questoesAula20;

// Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizados por mês, dia e hora (só 8 horas por dia).

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        String[][][] agendaMarcada = new String[12][30][8];

        while (true){
            System.out.println("--- Marcação de Agenda ---");
            System.out.println("1. Agendar");
            System.out.println("2. Consultar Agenda");
            System.out.println("0. Sair");
            System.out.print(">>> ");

            int opcao = scan.nextInt();
            if(opcao == 1){

                System.out.println("Digite o mês (1-12): ");
                int mes = scan.nextInt() - 1 ;

                if (mes < 0 || mes >= 12) {
                    System.out.println("Mês inválido!");
                    continue;
                }

                System.out.print("Digite o dia (1-30): ");
                int dia = scan.nextInt() - 1;

                if (dia < 0 || dia >= 30) {
                    System.out.println("Dia inválido!");
                    continue;
                }

                System.out.print("Digite a hora (8-16): ");
                int hora = scan.nextInt();

                if(hora < 8 || hora > 16){
                    System.out.println("Informe dentro do horário pedido");
                    continue;
                }

                int idxHora = hora - 8;
                scan.nextLine();
                System.out.print("Digite o compromisso: ");
                String compromisso = scan.nextLine();

                agendaMarcada[mes][dia][idxHora] = compromisso;
                System.out.println("Compromisso agendado!");


            }else if (opcao == 2){
                System.out.println("Digite o mês (1-12): ");
                int mes = scan.nextInt() - 1 ;

                if (mes < 0 || mes >= 12) {
                    System.out.println("Mês inválido!");
                    continue;
                }

                System.out.print("Digite o dia (1-30): ");
                int dia = scan.nextInt() - 1;

                if (dia < 0 || dia >= 30) {
                    System.out.println("Dia inválido!");
                    continue;
                }

                System.out.print("Digite a hora (8-16): ");
                int hora = scan.nextInt();

                if(hora < 8 || hora > 16){
                    System.out.println("Informe dentro do horário pedido");
                    continue;
                }

                int idxHora = hora - 8;

                String compromisso = agendaMarcada[mes][dia][idxHora];

                if(compromisso == null){
                    System.out.println("Não há nenhum compromisso informado.");
                }else{
                    System.out.println("Compromisso: " + compromisso);
                }
            }else if (opcao == 0){
                System.out.println("Até logo.");
                break;
            }else{
                System.out.println("ERROR! tente novamente.");
            }
    }
 }
}
