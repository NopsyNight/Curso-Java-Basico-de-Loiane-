package aulas.aula31OOEncapsulamento_gett_e_sett;

// Os get e set, são basicamente um modo de você não ter que declarar ou querer esconder informações dos objetos, os get e setters podem ajudar nisso, sem ter que trocar do private pro public se caso você não queira. Que seria uma forma de encapsulamento

// O Getter Retorna um valor privado
//matheus.getNome() = matheus

// O Setter altera o valor,
// Pessoa p = new Pessoa("Matheus");
//System.out.println(p.getNome()); // lê o nome
//p.setNome("Bernardo"); // muda o nome

public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros; // número de passageiros
    private double capCombustivel; // capacidade do tanque de combustível
    private double consumoCombustivel;

    /*
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getNumPassageiros(){
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }
     */

    // Com o método get e setter do Intellij
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }
}
