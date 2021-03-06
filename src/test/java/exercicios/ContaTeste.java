package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
    private Conta conta;

    @BeforeEach
    public void beforeEach() {
        Conta Conta1 = new Conta();
        Conta1.setNumero(1);
        Conta1.depositar(1000.00);
    }

    @AfterEach
    public void afterEach() {
        conta = null;
    }

    @Test
    public void criarObjetoConta() {
        assertNotNull(conta);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(conta.getLimite());
        assertNotNull(conta.getNumero());
        assertNotNull(conta.getSaldo());
    }

    @Test
    public void metodoGetSaldo() {
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    public void metodoSacarValorValido1() {
        conta.sacar(1.0);

        assertEquals(-1, conta.getSaldo());
    }

    @Test
    public void metodoSacarValorValido1000() {
        conta.sacar(1000.00);

        assertEquals(-1000.0, conta.getSaldo());
    }

    @Test
    public void metodoSacarValorInvalido1001() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta.sacar(1001.0));
        assertEquals("Saldo e/ou Limite insuficiente", exception.getMessage());
    }

    @Test
    public void metodoSacarValorInvalido1500() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta.sacar(1500.0));
        assertEquals("Saldo e/ou Limite insuficiente", exception.getMessage());
    }

    @Test
    public void metodoGetLimite() {
        assertEquals(1000.0, conta.getLimite());
    }


}

    @Test
    public void metodoDepositoValorValido100() {
        conta.depositar(100.0);
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    public void metodoDepositoValorInvalido0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta.depositar(0.0));
        assertEquals("Valor inválido", exception.getMessage());
    }

    @Test
    public void metodoDepositoValorInvalidoNegativo100() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta.depositar(-100.0));
        assertEquals("Valor inválido", exception.getMessage());
    }

    @Test
    public void metodoTransferirValorValido300() {
        Conta Conta2 = new Conta();
        Conta2.setNumero(1);
        Conta2.depositar(1000.00);
        conta.transferir(Conta2, 300.00);

        assertEquals(200.0, conta.getSaldo());
        assertEquals(300.0, Conta2.getSaldo());
    }

}