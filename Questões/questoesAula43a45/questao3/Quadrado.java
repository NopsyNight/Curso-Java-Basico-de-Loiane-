package questoes.questoesAula43a45.questao3;

public class Quadrado extends Figura2D implements DimensaoSuperficial {
    public Quadrado(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void CalcularArea(double base, double altura) {
        double area_quadrado = base * altura;
        System.out.println("A área do quadrado: " + area_quadrado + "cm \n");
    }
}
