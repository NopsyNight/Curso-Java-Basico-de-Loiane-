package aulas.aula29OO_this;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros; // número de passageiros
    double capCombustivel; // capacidade do tanque de combustível
    double consumoCombustivel; // consumo de combustível por km

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(){ }

    public Carro(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }

    public Carro(String marca, String modelo){
        this("Fiat", "Ducato" , 10);
        System.out.println("Chamando o construtor com 2 parâmetros");
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " +
                this.capCombustivel * this.consumoCombustivel + " km");
    }

    double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km) {
        return //Não tem como colocar o this "this.km"
         km / consumoCombustivel;
    }

    // O this tem dois usos
    // 1º Fazer referências aos métodos e atributos da classe;
    // 2º Você chama os contrutores da classe.
}
