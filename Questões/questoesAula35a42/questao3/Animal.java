package questoes.questoesAula35a42.questao3;

public class Animal {
    private String nome;
    private String comprimento;
    private String cor;
    private String ambiente;
    private double numeroDePatas = 4;
    private double velocidade;


    public Animal(String nome, String comprimento, String cor, String ambiente ,double numeroDePatas, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
        this.numeroDePatas = numeroDePatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(double numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    @Override
    public String toString() {
        return  "------------------------------"+
                "\nAnimal: " +  nome +
                "\nComprimento: " + comprimento + " cm" +
                "\nCor:" + cor  +
                "\nAmbiente: " + ambiente +
                "\nNumero de Patas: " + numeroDePatas +
                "\nVelocidade: " + velocidade + " m/s";
    }
}
