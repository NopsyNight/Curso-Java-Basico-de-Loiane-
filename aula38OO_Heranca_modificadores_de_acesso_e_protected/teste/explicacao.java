package aulas.aula38OO_Heranca_modificadores_de_acesso_e_protected.teste;

public class explicacao {
    // Com a alteração do pacote, com o diretorio diferente, a classe Aluno não vai ter mais acesso a classe Pessoa. quando está default.
    // Quando está público, isso altera, podendo ter acesso.
    // Em resumo:
    // Public = Liberou para qualquer local, podendo ser usado da forma como quiser.
    // Private, como o próprio nome já diz, é privado e somente a própria classe que declara o atributo pode usar o acesso.
    // O default somente classes do próprio pacote, e ele sempre é o comum a ser sentenciado a um atributo quando ele não tem private ou public.
    // O protected é igual ao default, so que a diferença é que as subclasses como o Aluno que está em teste, elas terão acesso.

}
