package questoes.questoesAula43a45.questao3;

public class Cubo extends Figura3D implements DimensaoVolumetrica {

    public Cubo(double base, double altura, double comprimento) {
        super(base, altura, comprimento);
    }

    @Override
    public void calcularVolume(double base, double altura, double comprimento) {
        double volumeCubo = base * altura * comprimento;
        System.out.println("O Volume do Cubo é: " + volumeCubo + "cm \n");
    }
}
