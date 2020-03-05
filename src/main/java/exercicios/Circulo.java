package exercicios;

public class Circulo {
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }
    public Double calcularArea() {
        return (Math.PI * Math.pow(raio, 2.0));
    }

    public Double calcularPerimetro() {
        return ( 2 * Math.PI * raio );
    }

    public void setRaio(Double raio) {
        if ( raio > 0.0 ) this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }
}
