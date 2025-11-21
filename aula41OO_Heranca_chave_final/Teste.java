package aulas.aula41OO_Heranca_chave_final;

public class Teste {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();
       //  Pessoa aluno = new Aluno();
        // Pessoa professor = new Professor();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // Nessa aula a professora introduz a chave final, a chave final é parecida com a abstract, porém a diferença vem que a classe que possui final, não pode ser estendida para outras classes filhas.

        // Quando o Final é utilizado em uma variável como:

        final String valorImutavel = "ValorInicial";

        // valorImutavel = "novoValor";
        // Esse valor não pode ser mudado, sendo Imutável.

        // exemplo 2:

        System.out.println(Constantes.URL_BLOG);

        // Constantes.URL_Blog = "xdxdxd"; Não sendo possível alterar pois é final.

        System.out.println(Constantes.URL_CURSO_COMPLETO);
    }
}
