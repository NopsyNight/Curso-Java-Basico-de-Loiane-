package questoes.questoesAula43a45.questao2;

public class Cubo extends Figura3D implements DimensaoVolumetrica{

    @Override
    public void calcularVolume(double base, double altura, double comprimento) {
        double volumeCubo = base * altura * comprimento;
        System.out.println("O Volume do Cubo é: " + volumeCubo);
    }
}
