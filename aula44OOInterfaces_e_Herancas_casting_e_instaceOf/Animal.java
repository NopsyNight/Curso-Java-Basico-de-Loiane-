package aulas.aula44OOInterfaces_e_Herancas_casting_e_instaceOf;

public abstract class Animal {
    private String nome;

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
