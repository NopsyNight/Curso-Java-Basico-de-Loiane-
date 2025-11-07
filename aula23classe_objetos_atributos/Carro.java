package aulas.aula23classe_objetos_atributos;

public class Carro {
    String marca;
    String modelo;
    String cor;
    int numeroDeAssentos;
    double capacidadeTanque;
    double consumoKm;

    // Agora, os objetos criados a partir dessa classe podem ser carros diferentes:

    /*
    Carro corolla = new Carro();
    corolla.marca = "Toyota";
    corolla.modelo = "Corolla";
    corolla.cor = "Preto";
    corolla.numeroDeAssentos = 5;

    Carro civic = new Carro();
    civic.marca = "Honda";
    civic.modelo = "Civic";
    civic.cor = "Prata";
    civic.numeroDeAssentos;
     */

    // Até agora no curso, loiane descreve como fizemos uma programação Estruturada, só em uma classe fazendo todo o programa, só que o java é estruturado para Orientação à Objetos.
    // Certo, mas o que é um Objeto e uma Classe no java?
    // Pense em um carro, um carro ele possui vários tipos de detalhes que somente possuí nele:
    // Cor, Marca, Modelo, Número de Assentos, Capacidade de tanque de combustível, Consumo de combustível por Km e etc.
    // O objeto é basicamente uma rede de informações sobre o determinado objeto.
    // Uma classe é como um molde ou modelo que define quais características e comportamentos um objeto terá.
    // Um objeto é uma instância dessa classe, ou seja, algo concreto criado a partir desse modelo, contendo valores reais para seus atributos.


    // Em resumo:
    // Classe = Receita de bolo
    // Objeto = O bolo pronto que você fez usando a receita
    //Você pode fazer vários bolos (objetos) usando a mesma receita (classe), mas cada um pode ter diferenças (cor, sabor, formato…).
}
