package CalculadoraJuros;

public class ImpostoEstadual implements ICalculoImposto {

    @Override
    public double calcular(double valor) {
        return valor * 1.05;
    }

}
