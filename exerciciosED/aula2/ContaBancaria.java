package exerciciosED.aula2;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;

    // Construtor
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Saldo inicial
    }
    // Método para depositar dinheiro
    public void depositar(double valor) {
        try {
            if (valor <= 0) {
                throw new RuntimeException("O valor a depositar deve ser positivo");
            }
            this.saldo += valor;
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        try {
            if (saldo < valor) {
                throw new RuntimeException("Saldo insuficiente para saque");
            }
            this.saldo -= valor;
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

    // Método para consultar o saldo
    public double consultarSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    // Método para exibir os dados da conta
    public String exibirDadosConta() {
        return "Titular: " + getTitular() + ", Número da conta: " + getNumeroConta() + ", Saldo: R$ " + consultarSaldo();
    }
}
