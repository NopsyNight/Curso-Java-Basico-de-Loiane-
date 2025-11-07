package questões.questoesAula23.questao1;

public class SuperMercado {
    public static void main(String[] args){

        Lampada lampadaFluorescente = new Lampada();
        lampadaFluorescente.marca = "Philips";
        lampadaFluorescente.preco = 12.6;
        lampadaFluorescente.formato = "Incandescente";

        Lampada led = new Lampada();
        led.marca = "Lorenzetti";
        led.preco = 10;
        led.formato = "LED";

        Lampada abajur = new Lampada();
        abajur.marca = "Yamura";
        abajur.preco = 15;
        abajur.formato = "Abajur";

        System.out.println("--- SuperMercado ---");
        System.out.println("Temos esses tipos de lâmpadas: ");
        System.out.println(lampadaFluorescente.marca);
        System.out.println(lampadaFluorescente.preco);
        System.out.println(lampadaFluorescente.formato);
        System.out.println(led.marca);
        System.out.println(led.marca);
        System.out.println(led.marca);
        System.out.println(abajur.marca);
        System.out.println(abajur.preco);
        System.out.println(abajur.formato);
    }
}
