package aulas.aula25OO_metodos_de_retorno;

public class Carro {
    String marca;
    String modelo;
    String cor;
    int numeroDeAssentos;
    double capacidadeTanque;
    double consumoKm;

    // metodo simples
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capacidadeTanque * consumoKm + "km");
    }

    // método com retorno
    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");
        return capacidadeTanque * consumoKm;
    }

    // método com parâmetro
    double calcularCombustivel(double km){
        double qtdCombustivel = km/consumoKm;

        return qtdCombustivel;
    }
}
