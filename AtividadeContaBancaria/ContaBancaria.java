public class ContaBancaria {
    
    private int numeroConta;
    private String titular;
    private double saldo;

    
    public ContaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    public double getSaldo() {
        return saldo;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }
}
