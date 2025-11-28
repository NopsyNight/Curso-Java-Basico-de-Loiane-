package questoes.questoesAula43a45.questao3;

public class Cilindro extends Figura3D implements DimensaoVolumetrica {

    public Cilindro(double base, double altura, double comprimento) {
        super(base, altura, comprimento);
    }


    @Override
    public void calcularVolume(double base, double altura, double comprimento) {
        double volume = 3.14 * (base * 2) * altura;
        System.out.println("O volume do cilíndro é: " + volume + "cm \n");
    }
}
