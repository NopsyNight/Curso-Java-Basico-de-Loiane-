package questões.questoesAula16_17;

// Faça um programa que peça n pessoas a sua idade, ao final o programa deve verificar se a média da idade da turna varia entre 0 e 25, 26 e 60 e maior que 60; e então dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

import java.util.Scanner;

public class questao25 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double somaIdades = 0;

        int contador = 0;

        while(true){
            System.out.println("Informe a idade: ");
            double idade = scan.nextDouble();

            if (idade < 0){
                System.out.println("ERROR! Não informe idade negativa.");
                continue;
            }else if (idade > 125){
                System.out.println("Não existe ninguém no mundo com +125 Anos registrado, registre uma Idade menor que essa.");
                continue;
            }else{
                contador++;
                somaIdades += idade;

                System.out.println("Tem mais aluno para colocar idade? :");
                String pergunta = scan.next();
                if (pergunta.equalsIgnoreCase("sim")){
                    continue;
                } else if (pergunta.equalsIgnoreCase("não")){
                    break;
                }
            }
        }
        double media_idade = somaIdades / contador;

        if (media_idade > 0 && media_idade <= 26){
            System.out.println("A idade média da turma é " + media_idade + " sendo uma turma Jovem.");
        }else if (media_idade > 26 && media_idade <= 60){
            System.out.println("A idade média da turma é " + media_idade + " sendo uma turma Adulta.");
        }else{
            System.out.println("A idade média da turma é " + media_idade + " sendo uma turma Idosa.");
        }

    }
}
