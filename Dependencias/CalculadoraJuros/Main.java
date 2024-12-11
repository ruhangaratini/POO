package CalculadoraJuros;

public class Main {

    public static void main(String[] args) {
        final ImpostoEstadual impostoEstadual = new ImpostoEstadual();
        final ImpostoFederal impostoFederal = new ImpostoFederal();

        final Calculadora calc = new Calculadora(impostoEstadual);

        System.out.printf("%.2f%n", calc.efetuarCalculo(10.99));
    }

}
