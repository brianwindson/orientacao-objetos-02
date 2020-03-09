package exercicios;

public class Conta2 {
    private Integer numero;
    private Double saldo = 0.00;
    private Double limite = 0.00;


    public void depositar(Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        } else saldo = saldo + valor;
    }

    public void sacar(Double valor) {
        saldo = saldo - valor;
        if (saldo < 0) {
            limite = limite + saldo;
            this.saldo = 0.00;
            if (limite < valor) {
                throw new IllegalArgumentException("Saldo e/ou Limite insuficiente");
            }
        } else {
            saldo = saldo - valor;
        }
    }

    public void transferir(Conta2 conta, Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido.");
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

    private void setSaldo(Double valor) {
        this.saldo = valor;
    }

    public void setNumero(Integer valor) {
        this.numero = valor;
        setLimite(1000.00);

    }

    private void setLimite(Double limite) {
        this.limite = limite;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getLimite() {
        return limite;
    }
}

z