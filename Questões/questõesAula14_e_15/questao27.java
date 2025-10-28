package questões.questõesAula14_e_15;

// Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//            Até 5 KG                         Acima de 5 Kg
// Morango    R$ 2,50 por Kg                   R$ 2,20 por Kg
// Maçã       R$ 1,80 por Kg                   R$ 1,50 por Kg
// Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
// Escreva um algorítmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maçãs adquiridas e escreva o valor a ser pago pelo cliente.


import java.util.Scanner;

public class questao27 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Fruteira ---");
        System.out.println("Informe quantos Kg de Morango você quer comprar: ");
        double morangoQtd = scan.nextDouble();
        System.out.println("Informe quantos Kg de Maçã você quer comprar: ");
        double macaQtd = scan.nextDouble();

        double precomorango = 0;

        double precomaca = 0;
        if (morangoQtd <= 5){
             precomorango = morangoQtd * 2.5;
        }else {
             precomorango = morangoQtd * 2.2;
        }

        if (macaQtd <= 5){
             precomaca = macaQtd * 1.80;
        }else {
             precomaca = macaQtd * 1.5;
        }

        double kgTotal = macaQtd + morangoQtd;
        double precototal = precomorango + precomaca;

        if (kgTotal > 8 || precototal > 25){
            double desconto = precototal * 0.1;
            double precoFinalDesc = precototal - desconto;

            System.out.println("Foram vendidas:\n" +
                    morangoQtd+ " Kg de Morangos e \n" +
                    macaQtd +" Kg de Maçãs \n" +
                    "Seus respectivos preços: \n" +
                    "R$"+ precomorango+ " \n" +
                    "R$"+ precomaca+
                    "\nCom o desconto de 10% por R$25 ou 8Kg\n" +
                    "Ficará no preço final: R$" + Math.round((precoFinalDesc) * 100) /100);
        }else{
            System.out.println("Foram vendidas:\n" +
                    morangoQtd+ " Kg de Morangos e \n" +
                    macaQtd +" Kg de Maçãs \n" +
                    " Seus respectivos preços: \n" +
                    " R$"+ precomorango+
                    " R$"+ precomaca+
                    " O Preço final será: R$" + Math.round((precototal) * 100) /100);
        }
    }
}
