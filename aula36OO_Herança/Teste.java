package aulas.aula36OO_Herança;

public class Teste {
    public static void main(String[] args){

        /*Aluno aluno = new Aluno();

        Professor professor = new Professor();

        Pessoa pessoa = new Pessoa();

        // pessoa.get

        aluno.setNome("Matheus");
        aluno.getNome();
         */

        // professor.setTelefoneCelular(TelefoneCelular);

        Pessoa aluno = new Aluno();
        // Declaramos uma classe Pessoa e instanciamos a classe aluno junto a Pessoa.

        // você não terá acesso aos atributos específicos do aluno, somente acesso comum da classe.

        Pessoa professor = new Professor();

        // professor.getSalario(); Não funciona

    }
}
