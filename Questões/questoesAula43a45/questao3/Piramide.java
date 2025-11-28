package questoes.questoesAula43a45.questao3;

public class Piramide extends Figura3D implements DimensaoVolumetrica {

    public Piramide(double base, double altura, double comprimento) {
        super(base, altura, comprimento);
    }

    @Override
    public void calcularVolume(double base, double altura, double comprimento) {
        double volumePiramide = (((base * altura) / 2) * altura) / 3;
        System.out.println("O volume da Pirâmide é: " + volumePiramide + "cm \n");
    }
}
