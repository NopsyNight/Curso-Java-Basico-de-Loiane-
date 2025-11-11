package aulas.aula28OO_Construtores;

public class Carro2 {
    String marca;
    String modelo;
    int numPassageiros; // número de passageiros
    double capCombustivel; // capacidade do tanque de combustível
    double consumoCombustivel; // consumo de combustível por

    public Carro2(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel; // Gerado com a IDE que pega as variáveis da classe e integra ao arquivo pedido
    }

    public Carro2(){

    }
}
