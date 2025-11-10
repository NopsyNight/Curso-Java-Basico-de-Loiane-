package questões.questoesAula24a26.questao3;

public class Aluno {
    String nome;
    int matricula;
    String[] disciplinas = new String[3];
    double[] notaFinal = new double[3];

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
            System.out.print(d + " ");
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
