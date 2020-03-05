import exercicios.Conta;

public class Main {
    //exemplo 1-i
    public static void main(String[] args) {
    Conta Conta1 = new Conta();
    Conta1.setNumero(1);
    Conta1.setLimite(1000.00);
   //onta1.depositar(500.00);
    Conta1.sacar(1100.00);
    System.out.print(Conta1.getLimite());
    System.out.print("\n");
    System.out.print(Conta1.getSaldo());

    }
}
