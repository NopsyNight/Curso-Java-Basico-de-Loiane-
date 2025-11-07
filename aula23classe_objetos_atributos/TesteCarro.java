package aulas.aula23classe_objetos_atributos;

public class TesteCarro {
    public static void main(String[] args){

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroDeAssentos = 10;
        van.capacidadeTanque = 100;
        van.consumoKm = 0.2;

        // System.out.println(van);
        // "aulas.aula23classe_objetos_atributos.Carro@8efb846"

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fiat";
        fusca.numeroDeAssentos = 4;
        fusca.capacidadeTanque = 30;
        fusca.consumoKm = 0.15;
    }
}
