package questões.questõesAula14_e_15;

// Faça um programa que peça 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
// Dicas:
// Três lados formam um triângulo quando a soma de quaisquer dois lados for mais que o terceiro;
// Triângulo Equilátero: Três lados iguais;
// Triângulo Isósceles: Quaisquer dois lados iguais;
// Triângulo Escaleno: três lados diferentes;

import java.util.Scanner;
import java.util.Arrays;

public class questao15 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Cálculo Para Formar Um Triângulo ---");
        System.out.println("Informe o primeiro lado: ");
        double lado1 = scan.nextDouble();
        System.out.println("Informe o segundo lado: ");
        double lado2 = scan.nextDouble();
        System.out.println("Informe o terceiro lado: ");
        double lado3 = scan.nextDouble();

        double[] lados = {lado1, lado2, lado3};

        Arrays.sort(lados);

        boolean trianguloReal = lados[2] < lados[0] + lados[1];

        if(trianguloReal && (lado1 == lado2 && lado1 == lado3)){
            System.out.println("É possível formar seu triângulo e ele é caracterizado como um: Triângulo Equilátero.");
        }else if(trianguloReal && (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)){
            System.out.println("É possível formar seu triângulo e ele é caracterizado como um: Triângulo Isósceles.");
        }else if (trianguloReal){
            System.out.println("É possível formar seu triângulo e ele é caracterizado como um: Triângulo Escaleno.");
        }else{
            System.out.println("Não é possível formar seu triângulo.");
        }
    }
}
