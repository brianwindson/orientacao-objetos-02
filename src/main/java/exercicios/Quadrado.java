package exercicios;

public class Quadrado {
    public Double lado;

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public Double calcularArea() {
        return lado * lado;
    }

    public Double calcularPerimetro() {
        return 4 * lado;
    }
}

