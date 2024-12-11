package CalculadoraJuros;

public class ImpostoFederal implements ICalculoImposto {

    @Override
    public double calcular(double valor) {
        return valor * 1.07;
    }

}
