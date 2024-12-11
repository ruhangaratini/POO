package Dependencias;

public class Calculadora {
    private final ICalculo calculo;

    public Calculadora(ICalculo calculo) {
        this.calculo = calculo;
    }

    public double efetuarCalculo(double a, double b) {
        return this.calculo.efetuar(a, b);
    }

}
