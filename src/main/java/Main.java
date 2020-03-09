import exercicios.Conta;

public class Main {
    //exemplo 1-i
    public static void main(String[] args) {
        Conta Conta1 = new Conta();
        Conta1.setNumero(1);
        Conta1.depositar(150.00);
        Conta1.sacar(1150.00);
        System.out.print(Conta1.getLimite());
        System.out.print("\n");
        System.out.print(Conta1.getSaldo());

    }
}
