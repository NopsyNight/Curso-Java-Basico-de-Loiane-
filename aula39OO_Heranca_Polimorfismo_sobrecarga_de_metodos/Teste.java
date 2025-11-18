package aulas.aula39OO_Heranca_Polimorfismo_sobrecarga_de_metodos;

public class Teste {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, número 1");
        aluno.setEndereco("Rua 1, número 1");
        professor.setEndereco("Rua 1, número 1");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());

        // Loiane explica a questão das heranças, com as classes Aluno e Professor tendo acesso ao método "obterEtiquetaEndereco())", mesmo que não estejam sentenciadas nas suas classes graças ao polimorfismo e herança.


        // Quando trocado os métodos referentes as classes, quando imprimir o chamado dos métodos referente as classes, vai aparecer o método que está declarado na classe junto com o método da classe que herdará.
    }
}
