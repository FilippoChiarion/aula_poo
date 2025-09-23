public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial > 0) {
            saldo = saldoInicial;
        } else {
            saldo = 0;
        }
    }

    // --- MÉTODOS PÚBLICOS (A Interface que o cliente usa) ---

    public double getSaldo() {
        registrarTransacao("Consulta de Saldo");
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            registrarTransacao("Depósito de R$" + valor);
        } else {
            System.out.println("Tentativa de depósito com valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (verificarFundos(valor)) {
            saldo -= valor;
            registrarTransacao("Saque de R$" + valor);
        } else {
            System.out.println("Tentativa de saque inválida.");
        }
    }

    // --- MÉTODOS PRIVADOS (O que o banco esconde) ---

    private boolean verificarFundos(double valor) {
        return valor > 0 && valor <= saldo;
    }

    private void registrarTransacao(String tipoDeTransacao) {
        System.out.println("Operação registrada: " + tipoDeTransacao);
    }
}