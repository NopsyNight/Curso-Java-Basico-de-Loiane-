package questoes.questoesAula43a45.questao3;

public class Figura3D extends FiguraGeometrica {
    private double base;
    private double altura;
    private double comprimento;

    public Figura3D(double base, double altura, double comprimento) {
        this.base = base;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}
