package questoes.questoesAula35a42.questao1;

public class Teste {
    public static void main(String[] args){

        System.out.println("=== Teste de Conta Bancária com OO, Herança, Polimorfismo e etc ===");

        System.out.println("--- Teste Conta Poupança ---");

        ContaPoupança poupanca = new ContaPoupança("Matheus Barbosa", "2025-22", 500.00, 100);
        System.out.println(poupanca);

        // Saque de valor
        System.out.println("Valor atual: " + poupanca.getSaldo());
        poupanca.sacar(100.00, 500); // Saldo vai para 400.00
        System.out.println(poupanca);

        // Depositar
        System.out.println("\n-> Depositando R$50.00:");
        ContaPoupança.depositar(50, 400);
        System.out.println(poupanca);

        System.out.println("\n-> Calculando novo saldo (Taxa 0.5%):");
        double novoSaldoPoupanca = poupanca.calcularNovoSaldo(0.005);
        System.out.println("Novo Saldo após rendimento: R$" + String.format("%.2f", novoSaldoPoupanca));

        // 5. Mostrar os dados da conta do cliente
        System.out.println("\n-> Dados Finais da Conta Poupança :");
        System.out.println(poupanca);

        System.out.println("\n" + "=".repeat(40) + "\n");

        System.out.println("--- Testando Conta Especial ---");

        ContaEspecial especial = new ContaEspecial("Romário Elias", "2025-21", 100.00, 500.00);
        System.out.println(especial);

        System.out.println("\n-> Tentando sacar R$50.00 (apenas saldo):");
        especial.sacar(50.00); // Saldo vai para 50.00
        System.out.println(especial);

        // Saque 2: Usando o limite (saldo negativo)
        System.out.println("\n-> Tentando sacar R$300.00 (usa limite):");
        especial.sacar(300.00); // Saldo vai para -250.00
        System.out.println(especial);

        // Saque 3: Ultrapassando o limite (deve falhar)
        System.out.println("\n-> Tentando sacar R$400.00:");
        especial.sacar(400.00); // Saldo + Limite disponível é de R$250.00.
        System.out.println(especial);

        // 3. Depositar
        System.out.println("\n-> Depositando R$200.00:");
        especial.depositar(200.00, 200); // Saldo vai para -50.00
        System.out.println(especial);

        // 5. Mostrar os dados da conta do cliente
        System.out.println("\n-> Dados Finais da Conta Especial:");
        System.out.println(especial);

    }
}
