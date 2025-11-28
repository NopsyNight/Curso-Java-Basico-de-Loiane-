package questoes.questoesAula43a45.questao3;

public class Circulo extends Figura2D implements DimensaoSuperficial {

    public Circulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void CalcularArea(double base, double altura) {
        double area = 3.14 * (base * 2);
        System.out.println("A área do círculo é: " + area + "cm \n");
    }
}
