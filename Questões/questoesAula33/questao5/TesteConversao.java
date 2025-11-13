package questoes.questoesAula33.questao5;


import java.util.Scanner;

public class TesteConversao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número para descobri suas conversões: ");
        int numero = scan.nextInt();

        ConversaoDeUnidadesDeVolume.resultados(numero);
    }
}
