public class Main {
    public static void main(String[] args) {
        
        ContaBancaria c1 = new ContaBancaria(1001, "Ana Silva", 500.0);
        System.out.println("Saldo inicial (c1): R$ " + c1.getSaldo());

        c1.depositar(150.0);
        System.out.println("Após depósito de R$150: R$ " + c1.getSaldo());

        boolean ok1 = c1.sacar(700.0);
        System.out.println("Tentativa de saque de R$700: " + (ok1 ? "sucesso" : "falha"));
        System.out.println("Saldo final (c1): R$ " + c1.getSaldo());

        System.out.println(); 

        
        ContaBancaria c2 = new ContaBancaria(1002, "Carlos Souza", 1000.0);
        System.out.println("Saldo inicial (c2): R$ " + c2.getSaldo());

        c2.depositar(300.0);
        System.out.println("Após depósito de R$300: R$ " + c2.getSaldo());

        boolean ok2 = c2.sacar(500.0);
        System.out.println("Tentativa de saque de R$500: " + (ok2 ? "sucesso" : "falha"));
        System.out.println("Saldo final (c2): R$ " + c2.getSaldo());
    }
}
