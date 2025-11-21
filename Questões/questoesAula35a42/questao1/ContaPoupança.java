package questoes.questoesAula35a42.questao1;

public class ContaPoupança extends ContaBancaria{
    private double diaRendimento;

    public ContaPoupança(String nomeCliente, String numConta, double saldo, double diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double calcularNovoSaldo(double taxaRendimento) {
        // Assume que o dia atual corresponde ao diaRendimento
        // Se a lógica fosse completa, checaríamos a data atual.
        if (taxaRendimento > 0) {
            double novoSaldo = getSaldo() + (getSaldo() * taxaRendimento);
            setSaldo(novoSaldo);
            return novoSaldo;
        }
        return getSaldo();
    }

    @Override
    public String toString() {
        return "ContaPoupança{" +
                "\n Cliente: " + getNomeCliente() +
                "\n Conta: " + getNumConta() +
                "\n Saldo Atual: " + getSaldo() +
                "\n Rendimento diário: " + diaRendimento +
                '}';
    }

    @Override
    public boolean sacar(double valor) {
        return false;
    }
}
