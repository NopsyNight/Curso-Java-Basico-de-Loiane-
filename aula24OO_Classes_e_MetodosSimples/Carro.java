package aulas.aula24OO_Classes_e_MetodosSimples;

public class Carro {
    String marca;
    String modelo;
    String cor;
    int numeroDeAssentos;
    double capacidadeTanque;
    double consumoKm;

    void exibirAutonomia(){ // Void é um tipo de retorno vazio, que não retorna um valor
        System.out.println("A autonomia do carro é: " + capacidadeTanque * consumoKm + " km");
    }
}
