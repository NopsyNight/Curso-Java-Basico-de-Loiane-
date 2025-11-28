package questoes.questao_aula51;

public class NumeroNaoCorrespondenteException extends Exception {
    private int opc;

    public NumeroNaoCorrespondenteException(int opc) {
        this.opc = opc;
    }

    @Override
    public String toString() {
        return "O número digitado não corresponde ao menu, tente novamente!";

    }
}
