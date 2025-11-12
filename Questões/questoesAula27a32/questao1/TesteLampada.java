package questões.questoesAula27a32.questao1;

public class TesteLampada {
    public static void main(String[] args){
        Lampada lampada = new Lampada(false, "LED", "Branca", 12);

        lampada.mostrarEstado();
        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
    }
}
