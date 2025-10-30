package questões.questoesAula16_17;

// O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99. Com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente deve pagar ele desenvolveu uma tabela que contém o número de itens que o cliente comprou e ao lado o valor da conta. Desta forma a atendente do caixa precisa apenas contar quantos itens o cliente está levando e olhar na tabela de preços. Você foi contratado para desenvolver o programa que monta esta tabela de preços, conterá os preços de 1 até 50 produtos, conforme o exemplo abaixo:
// Lojas Quase Dois - Tabela de preços
// 1 - R$ 1,99
// 2 - R$ 3,98
// ...
// 50 R$ 99,50


import java.util.Scanner;

public class questao29 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Loja Quase Dois - Tabela de preços ---");
        for (int i = 1; i <= 50; i++){
            System.out.println(i +" - R$ " + i * 1.99);
        }
    }
}
