package questões.questoesAula27a32.questao3;

public class Aluno {
    private String nome;
    private int matricula;
    private String[] disciplinas = new String[3];
    private double[] notaFinal = new double[3];

    public Aluno(String nome, int matricula, String[] disciplinas, double[] notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = disciplinas;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[] getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double[] notaFinal) {
        this.notaFinal = notaFinal;
    }

    void mediaNota(){
        for (int i = 0; i < disciplinas.length; i++){
            if(notaFinal[i] >= 7){
                System.out.println(disciplinas[i] + ": APROVADO com nota " + notaFinal[i]);
            } else {
                System.out.println(disciplinas[i] + ": REPROVADO com nota " + notaFinal[i]);
            }
        }
    }

    void mostrarCurriculoAluno(){
        System.out.println("--------------");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: "+ matricula);

        System.out.print("Disciplinas: ");
        for (String d : disciplinas){
            System.out.print(d + ", ");
        }
        System.out.println();

        System.out.print("Notas: ");
        for (double n : notaFinal){
            System.out.print(n + " ");
        }
        System.out.println();

        mediaNota();
        System.out.println("---------------------");
    }
}
