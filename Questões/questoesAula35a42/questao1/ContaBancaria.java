package questoes.questoesAula35a42.questao1;

public abstract class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void sacar(double valor, double saldo){
        if (valor > saldo) {
            System.out.println("Não é possível sacar pois o valor do saque é superior ao valor do saldo");
        }else{
            System.out.println("O saque de  " + valor + " foi realizado com sucesso");
        }
    }

    public static double depositar (double valor, double saldo){
        if (valor < 0){
            System.out.println("Informe um número positivo para depositar ao banco");
        }
        return valor += saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "Nome do Cliente: '" + nomeCliente + '\'' +
                ", Número da Conta: '" + numConta + '\'' +
                ", Saldo Atual: " + saldo +
                '}';
    }

    public abstract boolean sacar(double valor);
}
