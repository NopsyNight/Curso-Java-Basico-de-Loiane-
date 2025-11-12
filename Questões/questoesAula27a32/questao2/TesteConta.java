package questões.questoesAula27a32.questao2;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        ContaCorrente matheus = new ContaCorrente("Matheus Barbosa","12121", 1000,false,100);

        System.out.println("Informe se você quer depositar algo: ");
        String escolha = scan.next();

        if (escolha.equalsIgnoreCase("sim")){
            System.out.println(">>> ");
            double deposito = scan.nextDouble();

            matheus.depositar(deposito);
        }

        System.out.println("Deseja sacar algo? :");
        String decisao = scan.next();

        if (decisao.equalsIgnoreCase("sim")){
            System.out.println(">>> ");
            double valor = scan.nextDouble();
            matheus.sacar(valor);
        }

        System.out.println("Informe se sua conta é Especial ou não: ");
        String opc = scan.next();

        if(opc.equalsIgnoreCase("não")){
            matheus.mostrarConta();
        }else if (opc.equalsIgnoreCase("sim")){
            matheus.setEspecial(true);
            matheus.mostrarConta();
        }else{
            System.out.println("Informe somente sim ou não");
        }
    }
}
