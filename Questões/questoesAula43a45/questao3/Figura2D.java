package questoes.questoesAula43a45.questao3;

public class Figura2D extends FiguraGeometrica {
    private double base;
    private double altura;

    public Figura2D(double base, double altura) {
        this.base = base;
        this.altura = altura;
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
}
