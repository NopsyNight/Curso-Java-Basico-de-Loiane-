package questoes.questoesAula33.questao5;

// Escreva a classe ConversaoDeUnidadesDeVolume com métodos estáticos para conversão das unidades de volume sedgundo a lista abaixo.

//1 litro = 1000.0 centímetros cúbicos.
//1 metro cúbico = 1000.0 litros.
//1 metro cúbico = 35.32 pés cúbicos
//1 galão americano = 231.0 polegadas cúbicas.
//1 galão americano = 3785.0 litros

public class ConversaoDeUnidadesDeVolume {
    public static double conversaoCentimetrosCubicos(int numero){
        return numero * 1000;
    }

    public static double conversaoLitros(int numero){
        return numero * 1000;
    }

    public static double conversaoPesCubicos(int numero){
        return numero * 35.32;
    }

    public static double conversaoPolegadasCubicas (int numero){
        return numero * 231;
    }

    public static double conversaoLitrosGalaoAmericano(int numero){
        return numero * 3785;
    }
    public static void resultados(int numero){
        System.out.println(numero + " litro = " + conversaoCentimetrosCubicos(numero) + " centímetros cúbicos.");
        System.out.println(numero + " metro cúbico = " + conversaoLitros(numero) + " litros.");
        System.out.println(numero + " metro cúbico = " + conversaoPesCubicos(numero) + " pés cúbicos");
        System.out.println(numero + " galão americano = " + conversaoPolegadasCubicas(numero) + " polegadas cúbicas." );
        System.out.println(numero + " galão americano = " + conversaoLitrosGalaoAmericano(numero) + " litros");
    }
}
