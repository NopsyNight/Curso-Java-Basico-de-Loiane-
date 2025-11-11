package aulas.aula28OO_Construtores;

// Construtor Simples e vazio:

public class Carro {
    String marca;
    String modelo;
    int numPassageiros; // número de passageiros
    double capCombustivel; // capacidade do tanque de combustível
    double consumoCombustivel; // consumo de combustível por km

    public Carro(){
        System.out.println("Classe Carro instanciado");
        numPassageiros = 4;
    }

    public Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " +
                capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km) {
        return km / consumoCombustivel;
    }
}
