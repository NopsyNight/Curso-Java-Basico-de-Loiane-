package aulas.aula39OO_Heranca_Polimorfismo_sobrecarga_de_metodos;

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
}
