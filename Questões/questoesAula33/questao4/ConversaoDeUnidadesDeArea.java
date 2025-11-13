package questoes.questoesAula33.questao4;

// Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para conversão das unidades de área segundo a lista abaixo:

//1 metro quadrado = 10.76 Pés Quadrados.
//1 pé quadrado = 929.0 Centímetros Quadrados.
//1 milha quadrada = 640.0 acres
//1 acre = 43.56 pés quadrados.

public class ConversaoDeUnidadesDeArea {

    public static double conversaoCentimetrosQuadrados(int numero){
        return numero * 10.76;
    }

    public static double conversaoPesQuadrados(int numero){
        return numero * 929;
    }

    public static double conversaoMilhasQuadradas(int numero){
        return numero * 640;
    }

    public static double conversaoAcres (int numero){
        return numero * 43.560;
    }

    public static void resultados(int numero){
        System.out.println(numero + " metro quadrado = " + conversaoCentimetrosQuadrados(numero) + " Pés Quadrados.");
        System.out.println(numero + " pé quadrado = " + conversaoPesQuadrados(numero) + " Centímetros Quadrados.");
        System.out.println(numero + " milha quadrada = " + conversaoMilhasQuadradas(numero) + " acres");
        System.out.println(numero + " acre = " + conversaoAcres(numero) + " pés quadrados." );
    }
}
