package aulas.aula24OO_Classes_e_MetodosSimples;

public class TesteCarro { // é uma classe com método simples
    public static void main(String[] args){
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroDeAssentos = 10;
        van.capacidadeTanque = 100;
        van.consumoKm = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia(); // Sempre usar um verbo
    }
}
