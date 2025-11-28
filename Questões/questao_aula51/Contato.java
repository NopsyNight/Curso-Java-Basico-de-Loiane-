package questoes.questao_aula51;

public class Contato {
    private String nome;
    private String telefone;
    private int identificador;
    private static int contador = 0;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.identificador = ++contador; // gerado automaticamente
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Contato: " +
                "Nome: '" + nome + "\n" +
                "Telefone: " + telefone + '\n' +
                "Identificador: '" + identificador + '\n';
    }
}
