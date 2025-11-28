package questoes.questoesAula43a45.questao3;

public class Teste {
    public static void main(String[] args){
        // Dimensões Superficiais
        Triangulo triangulo = new Triangulo(10, 10);
        Quadrado quadrado = new Quadrado(10, 10);
        Circulo circulo = new Circulo(10, 10);

        // Dimensões Volumétricas
        Cubo cubo = new Cubo(11, 11, 7);
        Piramide piramide = new Piramide(11, 11, 7);
        Cilindro cilindro = new Cilindro(11, 11, 7);


        if (triangulo instanceof Triangulo){
            System.out.println("É do tipo Triangulo");
            triangulo.CalcularArea(10,10);
        }
        if(quadrado instanceof Quadrado){
            System.out.println("É do tipo Quadrado");
            quadrado.CalcularArea(10, 10);

        }
        if (circulo instanceof Circulo){
            System.out.println("É do tipo Circulo");
            circulo.CalcularArea(10,10);
        }

        if (cubo instanceof Cubo){
            System.out.println("É do tipo Cubo");
            cubo.calcularVolume(11, 11, 7);
        }
        if (piramide instanceof Piramide){
            System.out.println("É do tipo Piramide");
            piramide.calcularVolume(11, 11, 7);
        }
        if (cilindro instanceof Cilindro){
            System.out.println("É do tipo Cilindro");
            cilindro.calcularVolume(11, 11, 7);
        }
    }
}
