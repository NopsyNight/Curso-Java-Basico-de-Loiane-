package questoes.questoesAula33.questao1;

import java.util.Scanner;

public class TesteContador {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número ao contador: ");
        int numero = scan.nextInt();

        System.out.println("O valor do contador agora é: " + Contador.adicionar(numero));

        System.out.println("Deseja retornar o valor original? (sim ou não)");
        String escolha = scan.next();

        if (escolha.equalsIgnoreCase("sim")){
            System.out.println(Contador.retornar(numero));
            System.out.println("O contador ficou: " + Contador.getContagem());
        }else if (escolha.equalsIgnoreCase("não")){
            System.out.println("Informe se você quer zerar o contador: ");
            String escolha2 = scan.next();

            if (escolha2.equalsIgnoreCase("sim")){
                System.out.println("O contador ficou no final: " + Contador.zerar(numero));
            }
            System.out.println("O contador ficou: " + Contador.getContagem());
        }else{
            System.out.println("Informe (sim ou não)");
        }
    }
}
