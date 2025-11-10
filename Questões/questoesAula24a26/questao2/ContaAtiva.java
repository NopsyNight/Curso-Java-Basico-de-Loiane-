package questões.questoesAula24a26.questao2;

import java.util.Scanner;

// Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um limite. Desenvolva métodos para relaizar saque [verificando se o cliente pode realizar saques], depositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe.

public class ContaAtiva {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while (true) {

            ContaCorrente usuario = new ContaCorrente();

            System.out.println("Informe seu número da conta: ");
            usuario.numeroDaConta = scan.next();

            System.out.println("Informe seu saldo atual: ");
            usuario.saldo = scan.nextDouble();

            if(usuario.saldo < 0){
                System.out.println("Informe um valor positivo a conta corrente.");
                continue;
            }

            System.out.println("Informe se sua conta é especial ou não : ");
            usuario.status = scan.next();

            System.out.println("Informe o limite da sua conta: ");
            usuario.limite = scan.nextDouble();

            if(usuario.limite < 0){
                System.out.println("Informe um valor positivo a conta corrente.");
                continue;
            }

            System.out.println("Deseja depositar algo na sua conta? (sim ou não): ");
            String escolha = scan.next();

            if(escolha.equalsIgnoreCase("sim")){
                System.out.println("Informe o valor: ");
                double deposito = scan.nextDouble();
                if (deposito < 0){
                    System.out.println("Números negativos não são depositados tente de novo");
                    continue;
                }
                usuario.depositar(deposito);
                usuario.mostrarConta();

                System.out.println("Quer informar outra conta? :");
                String repetir = scan.next();
                if(repetir.equalsIgnoreCase("sim")){
                    continue;
                }else if (repetir.equalsIgnoreCase("não")){
                    break;
                }
                System.out.println("Tente novamente!");
            }else if(escolha.equalsIgnoreCase("não")){
                usuario.mostrarConta();

                System.out.println("Quer informar outra conta? :");
                String repetir = scan.next();
                if(repetir.equalsIgnoreCase("sim")){
                    continue;
                }else if (repetir.equalsIgnoreCase("não")){
                    break;
                } else{
                    System.out.println("Informe novamente");
                    }
            }else{
                System.out.println("Informe sim ou não bobão");
            }
        }
    }
}
