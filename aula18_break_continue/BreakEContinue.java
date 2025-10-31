package aulas.aula18_break_continue;

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Entre com um número: ");
        int numero = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for (int i = numero ; i <= max; i++){
            if (i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }
        }*/

        // Curiosidade Go to, não mais utilizado nas linguagens de alto nível.
        /*for (int i = 0; i <=4 ; i++){
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if (i == 1){
                            break rotulo1;
                        }
                        if (i == 2){
                            break rotulo2;
                        }if (i == 3){
                            break rotulo3;
                        }
                        System.out.println("Rotulo3");
                    }
                    System.out.println("Rotulo2");
                }
                System.out.println("Rotulo1");
            }
            System.out.println(i);
        }*/

        // Uso do Continue
        // complemento o break, continue o loop na próxima interação, ou seja, quando for pedido o continue, ele vai ignorar tudo que está abaixo do código, e repetir o codigo novamente após o pedido do continue

        System.out.println("Entre com um número: ");
        int numero = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for (int i = numero ; i <= max; i++){
            if (i % 7 == 0){
                continue;
            }
            System.out.println("O valor de i é " + i); // Vai ignorar todos os números múltiplos de 7.
        }
    }
}
