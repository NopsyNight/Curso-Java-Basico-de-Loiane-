package questões.questoesAula23.questao5;

// Criar uma classe para representar uma conta corrente que possuí um número, um saldo, um status que informa se ela é especial ou não, um limite.

public class ContaCorrente {
    int numero;
    double saldo;
    boolean status;
    double limite;

    boolean sacar(double valor){
        if (saldo + limite >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    void depositar(double valor){
        saldo += valor;
    }

    void mostrarConta(){
        System.out.println("Numero da conta: "+ numero);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Conta especial: " + (status ? "Sim" : "Não"));
        System.out.println("Limite: R$ " + limite);
        System.out.println("---------------------");
    }
}
