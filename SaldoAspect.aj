public aspect SaldoAspect {
    pointcut saque(Conta c, double valor): 
        execution(* Conta.sacar(double)) && target(c) && args(valor);

    before(Conta c, double valor): saque(c, valor) {
        if (c.getSaldo() < valor) {
            System.out.println("[ERRO] Saldo insuficiente para saque de " + valor);
            throw new RuntimeException("Saldo insuficiente");
        }
    }
}