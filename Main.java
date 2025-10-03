public class Main {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(100);

        conta.depositar(50);   // saldo = 150
        conta.sacar(80);       // saldo suficiente
        conta.sacar(100);      // vai disparar o aspecto de saldo insuficiente
    }
}