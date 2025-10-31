package questões.questoesAula16_17;

// O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências. Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco. Após essa operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
// Lojas Tabajara
// Produto 1: R$ 2,20
// Produto 2: R$ 5,80
// produto 3: R$ 0
// Total: R$ 9.00
// Dinheiro: R$ 20,00
// Troco: R$11,00
// ....


import java.util.Scanner;

public class questao31 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while (true){
        double precoProduto;
        int contadorProdutos = 0;
        double soma = 0;

        System.out.println("--- Lojas Tabajara ---");
            do{
                System.out.println("Informe o preço do produto (escreva 0 Para finalizar a compra: ");
                precoProduto = scan.nextDouble();

                if (precoProduto != 0){
                    soma += precoProduto;
                    contadorProdutos ++;
                    System.out.println("Produto " + contadorProdutos + " : R$" + precoProduto );
                }

            }while (precoProduto != 0);

            System.out.println("Total: R$" + soma);

            System.out.println("Informe quanto dinheiro você vai pagar ao total de produtos: ");
            double pagamento = scan.nextDouble();

            if (pagamento < soma){
                System.out.println("Informe um valor maior ou igual ao total do produto.");
            }
            else{
                double troco = pagamento - soma;

                for (int i = 1; i <= contadorProdutos; i++){
                    System.out.println("Produto " + i + " : R$" + precoProduto );
                }

                System.out.println("Total: R$" + soma);
                System.out.println("Dinheiro: R$" + pagamento);
                System.out.println("Troco: R$" + troco);
                System.out.println("--- Compra Finalizada! ---");
            }
        }
    }
}
