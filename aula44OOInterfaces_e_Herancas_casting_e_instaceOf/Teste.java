package aulas.aula44OOInterfaces_e_Herancas_casting_e_instaceOf;

public class Teste {
    public static void main(String[] args){
        /* Cavalo cavalo = new Cavalo();
        Mamifero cavaloMamifero = cavalo; //Upcasting

        // Upcasting nada mais nada menos que é a troca de escala de uma subclasse para uma super classe ou vice versa.
        Mamifero cavalo2 = (Mamifero) new Cavalo(); // Outro tipo de upcasting

        // Downcasting
        // Basicamente o contrário, irá descer a subclasse da hierarquia

        Mamifero cavalo3 = new Cavalo();
        Cavalo cavalo4 = (Cavalo) cavalo3;
        //                Erro de class castingo
        // As vezes o downcasting pode dar erro por conta da hierárquia de atributos que podem ter erros como procurar certos tipos de infomações, o que pode ajudar ou atrapalhar na hora de montar um código.
         */

        // Instance OF

        // Operador interessante para descobrir qual classe é a instância daquele objeto.

        Cavalo cavalo = new Cavalo();
        Papagaio papagaio = new Papagaio();

        if (cavalo instanceof Cavalo){
            System.out.println("É do tipo Cavalo");
        }
        if (papagaio instanceof Papagaio){
            System.out.println("É do tipo Papagaio");
        }
    }
}
