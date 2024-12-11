package CalculadoraJuros;

public class Calculadora {
    private final ICalculoImposto calc;

    public Calculadora(ICalculoImposto calc) {
        this.calc = calc;
    }

    public double efetuarCalculo(double valor) {
        return this.calc.calcular(valor);
    }

}
