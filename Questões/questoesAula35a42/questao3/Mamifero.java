package questoes.questoesAula35a42.questao3;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, String comprimento, String cor, String ambiente, double numeroDePatas, double velocidade, String alimento) {
        super(nome, comprimento, cor, ambiente, numeroDePatas, velocidade);
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlimento: " + alimento +
                "\n------------------------------";
    }
}
