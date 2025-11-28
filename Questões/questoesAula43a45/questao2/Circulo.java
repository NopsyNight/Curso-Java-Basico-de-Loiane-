package questoes.questoesAula43a45.questao2;

public class Circulo extends Figura2D implements DimensaoSuperficial{

    @Override
    public void CalcularArea(double base, double altura) {
        double area = 3.14 * (base * 2);
        System.out.println("A área do círculo é: " + area);
    }
}
