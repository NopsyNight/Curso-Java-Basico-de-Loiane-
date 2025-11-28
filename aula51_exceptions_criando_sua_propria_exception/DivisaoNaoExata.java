package aulas.aula51_exceptions_criando_sua_propria_exception;

public class DivisaoNaoExata extends Exception{

    private int num;
    private int denominador;

    public DivisaoNaoExata(int num, int denominador) {
        super();
        this.num = num;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Resultado de: " + num +
                "/" + denominador + " não é um inteiro.";
    }
}
