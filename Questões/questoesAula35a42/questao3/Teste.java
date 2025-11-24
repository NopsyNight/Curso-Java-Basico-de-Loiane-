package questoes.questoesAula35a42.questao3;

public class Teste {
    public static void main(String[] args){
        Mamifero leopardo = new Mamifero("Leopardo", "130", "Amarelo com pontas pretas", "Terreno", 4, 20, "Carne");
        Mamifero camelo = new Mamifero("Camelo", "150", "Amarelo", "Deserto", 4, 2, "Folhas e gramas");
        Peixe tubarao = new Peixe("Tubarão", "300", "Cinzento", "Mar", 0, 1.5, "Barbatanas e cauda");
        Mamifero urso_do_canada = new Mamifero("Urso do Canadá", "180", "Vermelho", "Florestas", 4 , 0.5, "Mel");

        System.out.println("Zoo: ");
        System.out.println(leopardo);
        System.out.println(camelo);
        System.out.println(tubarao);
        System.out.println(urso_do_canada);
    }
}
