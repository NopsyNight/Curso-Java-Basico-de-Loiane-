package questoes.questoesAula35a42.questao2;

public class Contribuintes {
    private String nome;
    private double salario;
    private boolean pessoaFisica;

    public Contribuintes(String nome,double salario, boolean pessoaFisica) {
        this.salario = salario;
        this.pessoaFisica = pessoaFisica;
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(boolean pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void impostoDeRenda(double salario){
        if (salario > 0 && salario <= 1400){
            System.out.println("Não há imposto a se pagar.\n");
        }
        else if (salario > 1400 && salario <= 2100){
            double imposto = (salario * 0.1);
            System.out.println("O Imposto a se pagar é de: R$" + imposto+"\n");
        }else if (salario >2100 && salario <= 2800){
            double imposto = (salario * 0.15);
            System.out.println("O Imposto a se pagar é de: R$" + imposto+"\n");
        }else if (salario > 2800 && salario <= 3600){
            double imposto = (salario * 0.25);
            System.out.println("O Imposto a se pagar é de: R$" + imposto+"\n");
        }else if (salario > 3600){
            double imposto = (salario * 0.30);
            System.out.println("O Imposto a se pagar é de: R$" + imposto+"\n");
        }else {
            System.out.println("Número negativo não aceita.");
        }
    }

    @Override
    public String toString() {
        return "Contribuinte: " +
                "Nome: " + getNome()+
                ", Pessoa Física: " + (pessoaFisica ? "Pessoa Física" : "Pessoa Jurídica") +
                ", Salario Bruto: " + getSalario() +
                "}";
    }
}
