package questões.questõesAula14_e_15;

// Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer consistências, informando ao usuário nas seguintes situações:
// a. Se o usuário informar o valor de A iguala zera, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
// b. Se o delta calculado for negativo, a equação não possuí raizes reais. Informe ao usuário e encerre o programa.
// c. Se o delta for positivo, a equação possuí duas raizes reais; informe ao usuário;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Cálculo Equação do Segundo Grau");
        System.out.println("Informe valor 'a':");
        double a = scan.nextDouble();
        if(a == 0){
            System.out.println("A equação não é do segundo grau.");
        }
        else{
            System.out.println("Informe o valor 'b': ");
            double b = scan.nextDouble();
            System.out.println("Informe o valor 'c': ");
            double c = scan.nextDouble();

            double delta = (b*b) - 4 * a * c;
            if (delta < 0){
                System.out.println("A equação não possuí raizes.");
            }else if (delta == 0){
                double raiz = Math.sqrt(delta); // raiz quadrada
                double x = (-b + raiz) / 2 * a;

                System.out.println("A equação só possuí uma raiz real: " + x);
            }else if(delta > 0){
                double raiz = Math.sqrt(delta);
                double x = (-b + raiz) / 2 * a;

                double x2 =  (-b - raiz) / 2 * a; // calculo da segunda raiz real
                System.out.println("A equação possuí duas raizez reais: " + x + " e " + x2);

            }
        }
    }
}
