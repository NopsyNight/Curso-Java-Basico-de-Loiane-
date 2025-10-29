package questões.questoesAula16_17;

// Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme no exemplo abaixo:
// Tabuada do 5:
// 5 x 1 = 5
// 5 x 2 = 10
// .......
// 5 x 10 = 50

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Tabuada dos Números ---");
        System.out.println("Informe um número que você tenha interesse (inteiro): ");
        int numero = scan.nextInt();

        if(numero % 2 == 1){
           System.out.println("Informe um número inteiro.");
        }else{
            System.out.println("Tabuada do " + numero);
            for (int i = 1; i <= 10; i++){
                int multiplicacao = numero * i;
                System.out.println(numero +" * "+ i + " = " + multiplicacao);
            }
        }
    }
}
