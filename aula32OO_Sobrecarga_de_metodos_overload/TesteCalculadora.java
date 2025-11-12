package aulas.aula32OO_Sobrecarga_de_metodos_overload;

public class TesteCalculadora {
    public static void main(String[] args){

        MinhaCalculadora calc = new MinhaCalculadora();

        calc.soma(1, 2); // Importa soma inteiro
        calc.soma(1.0, 2.0);// Importa soma double
    }
}
