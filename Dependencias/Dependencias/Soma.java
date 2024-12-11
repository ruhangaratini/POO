package Dependencias;

public class Soma implements ICalculo {

    @Override
    public double efetuar(double a, double b) {
        return a + b;
    }

}
