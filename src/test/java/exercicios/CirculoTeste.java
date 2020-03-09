package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {

    @Test
    public void criarObjetoCirculo() {
        Circulo c1 = new Circulo(3.0);
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos() {
        Circulo c1 = new Circulo(3.0);
        assertNotNull(c1.getRaio());
    }

    @Test
    public void metodoCalcularArea() {
        Circulo c1 = new Circulo(3.0);

        Double valorEsperado = Math.PI * Math.pow(3.0, 2.0);
        Double valorObtido = c1.calcularArea();

        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Circulo c1 = new Circulo(3.0);

        Double valorEsperado = 2 * Math.PI * 3.0;
        Double valorObtido   = c1.calcularPerimetro();

        assertEquals(valorEsperado, valorObtido);
    }

}
