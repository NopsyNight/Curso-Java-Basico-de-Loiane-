package questoes.questoesAula43a45.questao3;

public class Triangulo extends Figura2D implements DimensaoSuperficial {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void CalcularArea(double base, double altura) {
        double area_triangulo = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area_triangulo + "cm \n");
    }
}
