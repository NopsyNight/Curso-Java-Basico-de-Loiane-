package questoes.questoesAula35a42.questao2;

public class Teste {
    public static void main(String[] args){
        System.out.println("--- RECEITA FEDERAL ---");
        // Matheus
        Contribuintes matheus = new Contribuintes("Matheus Barbosa",2700, true);

        System.out.println(matheus);

        matheus.impostoDeRenda(1200);

        // Talita
        Contribuintes talita = new Contribuintes("Talita de Aquino", 10000, true);
        System.out.println(talita);

        talita.impostoDeRenda(10000);

        // Romário
        Contribuintes romario = new Contribuintes("Romario Elias", 6000, true);
        System.out.println(romario);

        romario.impostoDeRenda(6000);

        // Microsoft
        Contribuintes microsoft = new Contribuintes("Microsoft", 1000000, false);
        System.out.println(microsoft);

        microsoft.impostoDeRenda(1000000);

        // Riot Games
        Contribuintes riotGames = new Contribuintes("Riot Games", 2650000, false);
        System.out.println(riotGames);

        riotGames.impostoDeRenda(2650000);
        // Hypixel
        Contribuintes hypixel = new Contribuintes("Hypixel Studios", 250000, false);
        System.out.println(hypixel);

        hypixel.impostoDeRenda(250000);
    }
}
