package questões.questoesAula27a32.questao2;

public class ContaCorrente {
    private String nomeDoUsuario;
    private String numeroDaConta;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente(String nomeDoUsuario, String numeroDaConta, double saldo, boolean especial, double limite) {
        this.nomeDoUsuario = nomeDoUsuario;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    boolean sacar(double valor){
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente! Seu limite é de R$" + limite);
            return false;
        }
    }

    void depositar(double deposito){
        saldo += deposito;
    }

    void mostrarConta(){
        System.out.println("--------------");
        System.out.println("Nome do Usuário: "+ nomeDoUsuario);
        System.out.println("Número da conta: "+ numeroDaConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Conta especial: " + especial);
        System.out.println("Limite: R$ " + limite);
        System.out.println("---------------------");
    }
}
