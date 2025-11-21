package aulas.aula42OOClasse_Object;

public class Teste {
    public static void main(String[] args){

        Aluno aluno = new Aluno();

        aluno.setCurso("Game Dev");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);
        // aulas.aula42OOClasse_Object.Aluno@8efb846

        // Os dados: curso, notas[], ficam guardados na parte "Aluno@8efb846", loiane diz que ainda explicará como funciona a questão da memória do Java sobre os atributos.

        String s1 = "afdsdfsdf";
        String s2 = "afdsdfsdf";

        // System.out.println(s1 == s2);

        // retorna falso pois o operador compara as referências e não os valores.

        System.out.println(s1.equals(s2)); // retorna verdadeiro pois pega as strings e compara entre elas.

        Aluno aluno2 = new Aluno();
        aluno.setCurso("Sistemas de Informação");
        double[] notas2 = {10, 9, 8, 7};
        aluno.setNotas(notas2);

        // System.out.println(aluno == aluno2);
        System.out.println(aluno.equals(aluno2)); // Ainda retorna falso pois compara os atributos.


    }
}
