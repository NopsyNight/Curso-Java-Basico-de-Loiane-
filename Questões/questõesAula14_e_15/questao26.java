package questões.questõesAula14_e_15;

// Um posto está vendendo combustíveis com a seguinte tabela de descontos:
// Álcool:
// a: até 20 litros, desconto de 3% por litro
// b acima de 20 litros, desconto de 5% por litro.
// Gasolina:
// até 20 litros, desconto de 4% por litro
// acima de 20 litros, desconto de 6% por litro
// Escreva um algorítmo que leia o número de litros vendidos, o tipo de combustível, (codificado pela segunte forma: A-álcool, G-gasolina), calcule e impra o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 e o preço do litro do álcool é R$1,90.


import java.util.Scanner;

public class questao26 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("--- Posto de Gasolina ---");

        System.out.println("Informe qual produto você quer vender (A-alcool ou G-gasolina): ");
        String produto = scan.next();

        if(produto.equalsIgnoreCase("a")){
            System.out.println("Informe quantos litros de Álcool você quer vender (R$1,90 ao Litro) : ");

            double litrosA = scan.nextDouble();

            if (litrosA <= 20 && litrosA >= 0){
                double preco = litrosA * 1.9;
                double desconto = preco * 0.03;
                double precoFinal = Math.round(preco - desconto);
                System.out.println("Por " + litrosA+ " Litros de Álcool ficará R$" + precoFinal + ".");
            }else if(litrosA > 20){
                double preco = litrosA * 1.9;
                double desconto = litrosA * 0.05;
                double precoFinal = Math.round(preco - desconto);
                System.out.println("Por " + litrosA + " Litros de Álcool ficará R$" + precoFinal + ".");
            }else if (litrosA < 0){
                System.out.println("Valor de Litros Inválido.");
            }
        }else if (produto.equalsIgnoreCase("g")){
            System.out.println("Informe quantos litros de Gasolina você quer comprar (R$2,50 ao Litro) :");
            double litrosG = scan.nextDouble();

            if (litrosG <= 20){
                double preco = litrosG * 2.5;
                double desconto = preco * 0.04;
                double precoFinal = Math.round((preco - desconto));
                System.out.println("Por " + litrosG+ " Litros de Gasolina Ficará R$" + precoFinal + ".");
            }else if(litrosG > 20){
                double preco = litrosG * 2.5;
                double desconto = preco * 0.06;
                double precoFinal = Math.round((preco - desconto));
                System.out.println("Por " + litrosG+ " Litros de Gasolina Ficará R$" + precoFinal + ".");
            }else{
                System.out.println("Valor de Litros Inválido.");
            }
        }else{
            System.out.println("Error! Tente novamente.");
            return;
        }
    }
}
