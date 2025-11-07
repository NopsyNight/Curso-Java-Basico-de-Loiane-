package questões.questoesAula23.questao4;

// Usando o resultado do modelo "Livro" como base, crie uma classe "LivroDeBiblioteca" que representeos dados básicos de uma biblioteca, que pode ser emprestado aos leitores.

import java.util.Scanner;

public class LivroDeBiblioteca {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Livro harryPotter = new Livro();
        harryPotter.nome = "Harry Potter e a Pedra Filosofal";
        harryPotter.tipoDeCapa = "Capa Dura";
        harryPotter.numeroDePaginas = 221 ;
        harryPotter.corDaFolha = "Amarelada";
        harryPotter.autor = "J.K Rowling";
        harryPotter.preco = 30;
        harryPotter.emprestado = true;

        Livro javaBasico = new Livro();

        javaBasico.nome = "Java Básico";
        javaBasico.tipoDeCapa = "Capa Comum";
        javaBasico.numeroDePaginas = 1200 ;
        javaBasico.corDaFolha = "Branca";
        javaBasico.autor = "Loiane Groner";
        javaBasico.preco = 50;
        javaBasico.emprestado = true;

        while (true){
            System.out.println("--- Livraria ---");
            System.out.println("Nome: " + harryPotter.nome);
            System.out.println("Tipo de capa: " + harryPotter.tipoDeCapa);
            System.out.println("Número de Páginas: " + harryPotter.numeroDePaginas);
            System.out.println("Autor(a): " + harryPotter.autor);
            System.out.println("Preço: R$" + harryPotter.preco);
            System.out.println("Disponível para ser emprestado: " + harryPotter.emprestado);

            System.out.println("\nNome: " + javaBasico.nome);
            System.out.println("Tipo de capa: " + javaBasico.tipoDeCapa);
            System.out.println("Número de Páginas: " + javaBasico.numeroDePaginas);
            System.out.println("Autor(a): " + javaBasico.autor);
            System.out.println("Preço: R$" + javaBasico.preco);
            System.out.println("Disponível para ser emprestado: " + javaBasico.emprestado);

            System.out.println("Informe qual livro você quer emprestado (1 ou 2 Obs: digite 0 para sair): ");
            int opcao = scan.nextInt();

            if (opcao == 1){
                if (harryPotter.emprestado == false) {
                    System.out.println("Livro já emprestado, por favor aguarde até o livro estiver disponível novamente.");
                }
                harryPotter.emprestado = false;
            }else if (opcao == 2){
                if (javaBasico.emprestado == false) {
                    System.out.println("Livro já emprestado, por favor aguarde até o livro estiver disponível novamente.");
                }
                javaBasico.emprestado = false;
            }else if (opcao == 0){
                break;
            }else{
                System.out.println("ERRO! Informe um número Correspondente ao que foi pedido.");
            }

        }

    }
}
