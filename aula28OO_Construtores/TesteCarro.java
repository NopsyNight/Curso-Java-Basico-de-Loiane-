package aulas.aula28OO_Construtores;

public class TesteCarro {
    public static void main(String[] args){

        // Modo simples
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "ducato";
        van.capCombustivel = 1;
        van.numPassageiros = 2;

        System.out.println(van.numPassageiros);

        // Com Construtores
        Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);

        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.capCombustivel);

    }
}
