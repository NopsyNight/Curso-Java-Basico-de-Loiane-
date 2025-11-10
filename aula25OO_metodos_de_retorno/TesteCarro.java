package aulas.aula25OO_metodos_de_retorno;

public class TesteCarro {
    public static void main(String[] args){

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroDeAssentos = 10;
        van.capacidadeTanque = 100;
        van.consumoKm = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fiat";
        fusca.numeroDeAssentos = 4;
        fusca.capacidadeTanque = 30;
        fusca.consumoKm = 0.15;


        van.exibirAutonomia();

        double autonomia = van.obterAutonomia(); // atribui o metodo de retorno a uma variável

        System.out.println("a autonomia do carro é: " + autonomia);
        System.out.println("a autonomia do carro é: " + van.obterAutonomia()); // chamando o método com a classe

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
        System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
  }
}