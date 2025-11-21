package aulas.Aula40OO_Heranca_classes_abstratas;

public class Teste {
    public static void main(String[] args){

        // Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        // pessoa.setEndereco("Rua 1, número 1");
        aluno.setEndereco("Rua 1, número 1");
        professor.setEndereco("Rua 1, número 1");

        // System.out.println(pessoa.obterEtiquetaEndereco());
        // System.out.println(aluno.obterEtiquetaEndereco());
        // System.out.println(professor.obterEtiquetaEndereco());

        // A classe Pessoa é a super classe da classe aluno quanto professor, ou seja, a classe aluno e professor estão estendendo a classe professor

        // Em vez da gente utilizar o exemplo a cima, podemos colocar public "abstract" class Pessoa não irá funciona o exemplo acima.

        // Quando colocado abstract, a classe não poderá mais ter instâncias.

        // Somente classes filhas podem instanciar a classe abstrata

        aluno.imprimirEtiquetaEdereco(); // Chamará o método do aluno
        professor.imprimirEtiquetaEdereco(); // Chamará o método do aluno

    }
}
