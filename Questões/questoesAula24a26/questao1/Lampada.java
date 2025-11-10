package questões.questoesAula24a26.questao1;

// Escreva uma classe lâmpada para representar uma lâmpada. Desenvolva métodos para ligar, desligar lâmpada

import java.util.Scanner;

public class Lampada {
    Boolean ligada = true;
    String decisao;

    Scanner scan = new Scanner(System.in);

    void desligarLampada(){
        System.out.println("Deseja desligar a lâmpda?");
        decisao = scan.next();

        if(decisao.equalsIgnoreCase("sim")){
            boolean ligada = false;
        }

        ligada = true;
    }

    void ligarlampada(){
        System.out.println("Deseja desligar a lâmpda?");
        decisao = scan.next();

        if(decisao.equalsIgnoreCase("sim")){
            boolean ligada = true;
        }

        ligada=false;
    }
}
