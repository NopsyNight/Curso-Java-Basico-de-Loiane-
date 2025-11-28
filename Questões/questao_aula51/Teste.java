package questoes.questao_aula51;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("--- AGENDAMENTO ---");
            System.out.println("1. Consultar Contato");
            System.out.println("2. Adicionar Contato");
            System.out.println("0. Sair");
            System.out.print(">>> ");
            try{
                int opc = scan.nextInt();

                if (opc == 1){
                    System.out.print("Digite o ID do contato: ");
                    int id = scan.nextInt();

                    try {
                        Contato contato = agenda.consultar(id);
                        System.out.println("Encontrado: "+ contato);
                    } catch (ContatoNaoExisteException e){
                        System.out.println(e.getMessage());
                    }
                }else if (opc == 2){
                    scan.nextLine();

                    System.out.print("Nome: ");
                    String nome = scan.next();

                    System.out.print("Telefone: ");
                    String telefone = scan.next();
                    try {
                        agenda.adicionarContato(nome, telefone);
                        System.out.println("Contato adicionado!");
                    } catch (AgendaCheiaException e){
                        System.out.println(e.getMessage());
                    }
                }else if (opc == 0){
                    System.out.println("Saindo...");
                    break;
                }
                else{
                    throw new NumeroNaoCorrespondenteException(opc);
                }
            }catch (NumeroNaoCorrespondenteException e){
                e.printStackTrace();
            }
        }
    }
}
