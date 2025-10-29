package questões.questoesAula16_17;

// Faça a alteração do porgrama anterior permitindo ao usuário informar as populações e a taxa de crescimento iniciais. Valide a entrada e permita repetir a operação.

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("-- Quer Descobrir quantos anos demoram para uma população A superar uma população B??? ---");

            System.out.println("Informe o número da população A: ");
            double populacaoA = scan.nextDouble();
            if (populacaoA <= 0){
                System.out.println("Informe um número positivo para a população.");
                continue;
            }else{
                System.out.println("Informe o número da porcentagem em crescimento: ");
                double porcentagemAnualA = scan.nextDouble() / 100; // transforma em percentual. exemplo: 10% = 10 / 100 = 0.1;

                if (porcentagemAnualA == 0){
                    System.out.println("A população não terá crescimento. Insira outro número novamente.");
                    continue;
                }else if (porcentagemAnualA < 0){
                    System.out.println("Informe um número positivo.");
                }else{
                    System.out.println("Informe o número da população B: ");
                    double populacaoB = scan.nextDouble();
                    if(populacaoB <= 0){
                        System.out.println("Informe um número positivo para a população.");
                        continue;
                    }else{
                        System.out.println("Informe o número da taxa de crescimento da população B:");
                        double porcentagemAnualB = scan.nextDouble() / 100;
                        if (porcentagemAnualB <= 0){
                            System.out.println("Informe um número positivo.");
                        }else{
                            int anos = 0;

                            do {
                                populacaoA += populacaoA * porcentagemAnualA;
                                populacaoB += populacaoB * porcentagemAnualB;
                                anos++;
                            } while (populacaoA <= populacaoB);

                            System.out.println("\nSe passarão " + anos + " anos para a população A ultrapassar ou igualar a população B.");
                            System.out.println("População final de A: " + populacaoA + " habitantes.");
                            System.out.println("População final de B: " + populacaoB + " habitantes.");

                            System.out.println("Quer tentar de novo? (Insira Sim ou não): ");
                            String pergunta = scan.next();

                            if (pergunta.equalsIgnoreCase("sim")){
                                continue;
                            }else if (pergunta.equalsIgnoreCase("não")){
                                System.out.println("Tenha um bom dia!");
                                break;
                            }else{
                                System.out.println("ERROR! tente novamente.");
                            }
                        }
                    }
                }
            }
        }
    }
}
