package questoes.questoesAula35.questao2;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas = new double[4];

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }

    public boolean isAprovado() {
        return calcularMedia() >= 7;
    }

    public String getNome() { return nome; }
}
