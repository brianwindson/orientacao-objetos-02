package exercicios;

public class Conta {
    private  Integer numero;
    private Double saldo = 0.00;
    private Double limite = 0.00;


    public void depositar(Double valor) {
        saldo = saldo + valor;
    }

    public void sacar(Double valor) {
        saldo = saldo - valor;
        if ((saldo + limite) < 0 ) {
            throw IllegalArgumentException
        }
    }

    public void transferir(Conta conta, Double valor) {
        saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setNumero(Integer valor) {
        this.numero = valor;

    }

    public void setLimite(Double valor) {
        this.limite = valor;
    }

    public Double getLimite() {
        return limite;
    }
}

