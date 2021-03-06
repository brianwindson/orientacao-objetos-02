package exercicios;

public class Conta {
    private Integer numero = 0;
    private Double saldo = 0.00;
    private Double limite = 0.00;

    public void depositar(Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        } else saldo = saldo + valor;
    }

    public void sacar(Double valor) {
        if (saldo + limite < valor) {
            throw new IllegalArgumentException("Saldo e/ou Limite insuficiente");

        } else saldo = saldo - valor;
    }

    public void transferir(Conta conta, Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        } else if (saldo + limite < valor) {
            throw new IllegalArgumentException("Saldo e/ou Limite insuficiente");
        } else {
            saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getLimite() {
        return limite;
    }
}

