import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Criando uma nova conta bancária ---");
        ContaBancaria minhaConta = new ContaBancaria("Filippo Chiarion", 500.0);
        System.out.println("Conta criada para " + minhaConta.getTitular());
        System.out.println("Saldo inicial: R$" + minhaConta.getSaldo());

        // Depósito
        System.out.print("Digite o valor para depositar: ");
        double valorDeposito = sc.nextDouble();
        minhaConta.depositar(valorDeposito);

        // Saque
        System.out.print("Digite o valor para sacar: ");
        double valorSaque = sc.nextDouble();
        minhaConta.sacar(valorSaque);

        // Resultado final
        double saldoFinal = minhaConta.getSaldo();
        System.out.println("\nO saldo final da conta é: R$" + saldoFinal);

        sc.close();
    }
}