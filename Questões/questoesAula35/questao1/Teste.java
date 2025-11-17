package questoes.questoesAula35.questao1;

import java.util.Scanner;

// Escreva uma classe Agenda que contém vários contatos do tipo Contato, Cada Contato possui nome, telefone e email. A Agenda também possuí um nome. Crie um programa teste que peça o nome da Agenda e em seguida 3 contatos. Crie métodos que retornem uma String com a informação de cada contato e também de todos os contatos da agenda.

public class Teste {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Agenda agenda1 = new Agenda();

        agenda1.setNome_da_Agenda("Java's Lovers");

        System.out.println("Informe o nome da agenda: ");
        String nomeAgenda = scan.nextLine();

        if(nomeAgenda.equalsIgnoreCase("Java's lovers")){
            System.out.println("Agenda dos "+ agenda1.getNome_da_Agenda() + "\n");

            Contato[] contatos = new Contato[3];

            Contato contato1 = new Contato();
            contato1.setNome("Matheus Barbosa");
            contato1.setTelefone("87 99999-8888");
            contato1.setEmail("matheusbarbosasoares9@gmail.com\n");

            contatos[0] = contato1 ;

            Contato contato2 = new Contato();
            contato2.setNome("Lucas Texeira");
            contato2.setEmail("lucaspexeiradasilva@gmail.com\n");
            contato2.setTelefone("75 98494-2834");

            contatos[1] = contato2;

            Contato contato3 = new Contato();
            contato3.setNome("Romário Elias");
            contato3.setEmail("romarioeliasdasilva@gmail.com\n");
            contato3.setTelefone("87 95940-4845");

            contatos[2] = contato3;

            for (Contato c : contatos){
                if (c != null){
                    System.out.println(c.getNome() +"\n" + c.getEmail() + "" +  c.getTelefone());
                }
            }
        }
    }
}
