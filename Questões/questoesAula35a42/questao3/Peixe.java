package questoes.questoesAula35a42.questao3;

public class Peixe extends Animal{
    private String caracteristicas;

    public Peixe(String nome, String comprimento, String cor, String ambiente, double numeroDePatas, double velocidade, String caracteristicas) {
        super(nome, comprimento, cor, ambiente, numeroDePatas, velocidade);
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCaracteristicas: " + caracteristicas +
                "\n------------------------------";
    }
}
