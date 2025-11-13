package questoes.questoesAula33.questao6;

// Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos para conversão aproximada das unidades de velocidade segundo a lista abaixo:

//1 minuto = 60.0 segundos.
//1 hora = 60.0 minutos.
//1 dia = 24.0 horas
//1 semana = 7.0 dias.
//1 mês = 30.0 dias
//1 ano = 365.25 dias

public class ConversaoDeUnidadesDeTempo {
    public static double conversaoSegundos(int numero){
        return numero * 60;
    }

    public static double conversaoMinutos(int numero){
        return numero * 60;
    }

    public static double conversaoHoras(int numero){
        return numero * 24;
    }

    public static double conversaoDiasSemanais(int numero){
        return numero * 7;
    }

    public static double conversoesMensais(int numero){
        return numero * 30;
    }

    public static double conversaoAnos (int numero){
        return numero * 365.25;
    }

    public static void resultados(int numero){
        System.out.println(numero + " minuto = " + conversaoSegundos(numero) + " segundos.");
        System.out.println(numero + " hora = " + conversaoMinutos(numero) + " minutos.");
        System.out.println(numero + " dia = " + conversaoHoras(numero) + " horas");
        System.out.println(numero + " semana = " + conversaoDiasSemanais(numero) + " dias." );
        System.out.println(numero + " mês = " + conversoesMensais(numero) + " dias");
        System.out.println(numero + " ano = " + conversaoAnos(numero) + " dias");
    }
}
