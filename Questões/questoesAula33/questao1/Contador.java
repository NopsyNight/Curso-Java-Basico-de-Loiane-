package questoes.questoesAula33.questao1;

// Escreva uma classe chamada Contador, que tem um atributo estático que é incrementado sempre que a classe for instanciada. Crie métodos para zerar, incrementar e retornar o valor do contador. Desenvolva um programa para testar essa classe.

public class Contador {
    private static int contagem = 0;

    public Contador() {
    }

    public static int getContagem() {
        return contagem;
    }

    public static void setContagem(int contagem) {
        Contador.contagem = contagem;
    }

    public static int adicionar(int numero){
        return contagem += numero;
    }

    public static int zerar(int numero){
        return numero = 0;
    }

    public static int retornar(int numero){
        return numero = 0;
    }

}
