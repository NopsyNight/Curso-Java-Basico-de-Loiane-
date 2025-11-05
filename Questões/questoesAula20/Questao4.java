package questões.questoesAula20;

// Faça um programa armazenar em uma matriz os Compromissos de uma agenda pessoal. Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos associar uma tarefa específica (compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida com o compromisso, ou então, o usuário também pode consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[][] agendaMarcada = new String[30][24];

        while (true){
            System.out.println("--- Marcação de Agenda ---");
            System.out.println("1. Agendar");
            System.out.println("2. Consultar Agenda");
            System.out.println("0. Sair");
            System.out.print(">>> ");

            int opcao = scan.nextInt();
            if(opcao == 1){
                System.out.print("Digite o dia (1-30): ");
                int dia = scan.nextInt() - 1;

                System.out.print("Digite a hora (0-23): ");
                int hora = scan.nextInt();

                scan.nextLine();
                System.out.print("Digite o compromisso: ");
                String compromisso = scan.nextLine();

                agendaMarcada[dia][hora] = compromisso;
                System.out.println("Compromisso agendado!");

            }else if (opcao == 2){
                System.out.print("Digite o dia (1-30): ");
                int dia = scan.nextInt() - 1;

                System.out.print("Digite a hora (0-23): ");
                int hora = scan.nextInt();

                String compromisso = agendaMarcada[dia][hora];

                if(compromisso == null){ // "Null" é para identificar quando não há nada na variável.
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
