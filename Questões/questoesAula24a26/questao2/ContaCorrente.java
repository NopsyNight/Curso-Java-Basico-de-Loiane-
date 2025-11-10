package questões.questoesAula24a26.questao2;

public class ContaCorrente {
    String numeroDaConta;
    double saldo;
    String status;
    double limite;

    boolean sacar(double valor){
        if (saldo + limite >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    void depositar( double deposito){
        saldo += deposito;
    }

    void mostrarConta(){
        System.out.println("--------------");
        System.out.println("Número da conta: "+ numeroDaConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Conta especial: " + status);
        System.out.println("Limite: R$ " + limite);
        System.out.println("---------------------");
    }

}
