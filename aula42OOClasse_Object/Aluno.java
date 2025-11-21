package aulas.aula42OOClasse_Object;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    private String curso;
    private double[] notas;

    public void verificarAcesso(){

        // super.nome = "Matheus"; Não é possível.

        // this.nomeVisibilidade = "xdxdxdxd";
        // super.nomeVisibilidade = "xdxdxd";
    }

    public Aluno(){
        super();
    }


    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        // super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer(){
        // super.setCpf("3459494343"); // acesso a super classe.

        // this.setCpf("345345345"); // acesso comum da classe.
    }

    public String obterEtiquetaEndereco(){ // Aqui loiane explica que podemos ter interesse em modificar um pouco o método para algum tipo de classe específica.
        // return endereco;
        String s = "Endereço do ALuno: ";
        // s += this.getEndereco();
        return s;
    }

    // @Override
    public void imprimirEtiquetaEdereco() {

        System.out.println(this.obterEtiquetaEndereco());
    }

    /*public String toString(){ // ta sobrescrevendo o método to String da Classe Object
        String s = curso + "\n";
        for (double nota : notas){
            s += nota + " ";

        }
        return s;
    }
     */ // Não é produtivo fazer isso na mão para diversos toStrings


    @Override
    public String toString() {
        return "Aluno: " +
                "curso = '" + curso + '\'' +
                ",\nnotas = " + Arrays.toString(notas) +
                ' ';
    }

    @Override // Faz a comparação dos atributos do curso e aluno
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(curso, aluno.curso) && Objects.deepEquals(notas, aluno.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curso, Arrays.hashCode(notas));
    }
}
