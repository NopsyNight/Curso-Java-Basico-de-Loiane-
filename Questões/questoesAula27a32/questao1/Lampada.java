package questões.questoesAula27a32.questao1;

public class Lampada {
    private Boolean ligada;
    private String modelo;
    private String cor;
    private int potencia;

    public Lampada(Boolean ligada, String modelo, String cor, int potencia) {
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
        this.ligada = false;
    }

    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("A lâmpada foi ligada.");
        }else{
            System.out.println("A lâmpada já está ligada.");
        }
    }

    public void desligar(){
        if (ligada) {
            ligada = false;
            System.out.println("A lâmpada está desligando.");
        }else{
            System.out.println("A lâmpada está desligada");
        }
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    public boolean isLigada(){
        return ligada;
    }

    public void setLigada(Boolean ligada) {
        this.ligada = ligada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}

