public abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo: " + saldo);
    }

    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
}