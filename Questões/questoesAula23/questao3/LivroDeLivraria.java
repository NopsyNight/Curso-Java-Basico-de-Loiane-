package questões.questoesAula23.questao3;

// Usando o resultado do exercício anterior como base, crie uma classe "LivroDeLivraria", que represente os dados básicos de um livro que está à venda em uma livraria.

public class LivroDeLivraria {
    public static void main(String[] args){
        Livro harryPotter = new Livro();

        harryPotter.nome = "Harry Potter e a Pedra Filosofal";
        harryPotter.tipoDeCapa = "Capa Dura";
        harryPotter.numeroDePaginas = 221 ;
        harryPotter.corDaFolha = "Amarelada";
        harryPotter.autor = "J.K Rowling";
        harryPotter.preco = 30;

        Livro javaBasico = new Livro();

        javaBasico.nome = "Java Básico";
        javaBasico.tipoDeCapa = "Capa Comum";
        javaBasico.numeroDePaginas = 1200 ;
        javaBasico.corDaFolha = "Branca";
        javaBasico.autor = "Loiane Groner";
        javaBasico.preco = 50;

        System.out.println("--- Livraria ---");
        System.out.println("Nome: " + harryPotter.nome);
        System.out.println("Tipo de capa: " + harryPotter.tipoDeCapa);
        System.out.println("Número de Páginas: " + harryPotter.numeroDePaginas);
        System.out.println("Autor(a): " + harryPotter.autor);
        System.out.println("Preço: R$" + harryPotter.preco);

        System.out.println("\nNome: " + javaBasico.nome);
        System.out.println("Tipo de capa: " + javaBasico.tipoDeCapa);
        System.out.println("Número de Páginas: " + javaBasico.numeroDePaginas);
        System.out.println("Autor(a): " + javaBasico.autor);
        System.out.println("Preço: R$" + javaBasico.preco);
    }

}
