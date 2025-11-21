package aulas.Aula40OO_Heranca_classes_abstratas;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    public void verificarAcesso(){

        // super.nome = "Matheus"; Não é possível.

        this.nomeVisibilidade = "xdxdxdxd";
        super.nomeVisibilidade = "xdxdxd";


    }

    public Aluno(){
        super();
    }


    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        super(nome, endereco, telefone);
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
        super.setCpf("3459494343"); // acesso a super classe.

        this.setCpf("345345345"); // acesso comum da classe.
    }

    public String obterEtiquetaEndereco(){ // Aqui loiane explica que podemos ter interesse em modificar um pouco o método para algum tipo de classe específica.
        // return endereco;
        String s = "Endereço do ALuno: ";
        s += this.getEndereco();
        return s;
    }

    // @Override
    public void imprimirEtiquetaEdereco() {

        System.out.println(this.obterEtiquetaEndereco());
    }
}
