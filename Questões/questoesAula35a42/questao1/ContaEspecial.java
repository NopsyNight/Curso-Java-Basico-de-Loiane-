package questoes.questoesAula35a42.questao1;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta Especial: " +
                "\n  Cliente: " + getNomeCliente() +
                "\n  Conta: " + getNumConta() +
                "\n  Saldo Atual: R$" + String.format("%.2f", getSaldo()) +
                "\n  Limite: R$" + String.format("%.2f", limite);
    }

    @Override
    public boolean sacar(double valor) {
        double saldoTotalDisponivel = getSaldo() + this.limite;

        if (valor > 0 && valor <= saldoTotalDisponivel) {
            // O saldo pode ficar negativo, desde que não ultrapasse o limite.
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            System.out.println("Erro: Saldo + Limite insuficiente para sacar R$" + valor);
            return false;
        }
    }
}
