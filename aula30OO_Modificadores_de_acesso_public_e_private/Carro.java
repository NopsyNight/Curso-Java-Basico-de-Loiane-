package aulas.aula30OO_Modificadores_de_acesso_public_e_private;

// No java, temos dois modificadores de acesso o Public e Private
// Temos o Protected que é usado para herança
// Existe o default, que é quando não tem nada de segurança
// E o public que será introduzido.
// E temos o Private, que somente a classe pode vê-lo

class Carro {

    String marca;
    String modelo;
    int numPassageiros; // número de passageiros
    double capCombustivel; // capacidade do tanque de combustível
    double consumoCombustivel; // consumo de combustível por km

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " +
                this.capCombustivel * this.consumoCombustivel + " km");
    }

    private double divideKMPorConsumoCombustivel(double km){
        return km/this.capCombustivel;
    } //Somente a própria classe pode vê-lo.

    public double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }

    public double calculaCombustivel(double km) {
        return //Não tem como colocar o this "this.km"
                km / consumoCombustivel;
    }

    // Loiane explica que o public, qualquer classe de qualquer outra pasta, pode pegar essa classe declarada e importar para essa pasta, como é feito nas aulas 27, 28, 29 e a 30.

    // Quando retiramos o "public", as outras pastas não conseguirão importar a classe "Carro" da aula 30, por conta que o acesso está somente a própria classe criada.
}
