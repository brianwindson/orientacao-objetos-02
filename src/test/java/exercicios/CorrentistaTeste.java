package exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {

    @Test
    public void criarObjetoCorrentista() {
        Correntista c1 = new Correntista("SP3039439", "Guilherme", "gui@gmail.com", 1127596841);
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos() {
        Correntista c1 = new Correntista("SP3039439", "Guilherme", "gui@gmail.com", 1127596841);

        assertNotNull(c1.getCodigo());
        assertNotNull(c1.getNome());
        assertNotNull(c1.getEmail());
        assertNotNull(c1.getTelefone());
    }

}
