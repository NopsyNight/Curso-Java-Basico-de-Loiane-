package aulas.Aula40OO_Heranca_classes_abstratas;

public class Professor extends Pessoa {
    private double salario;
    private String nomeDoCurso;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco(){

        String s = "Endereço do Professor: ";
        s+= super.getEndereco();
        return s;
    }

    @Override
    public void imprimirEtiquetaEdereco() {

        System.out.println("Imprimindo endereço do Professor");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
