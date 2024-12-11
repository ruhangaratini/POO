package Dependencias;

public class Dependencias {

    public static void main(String[] args) {
        final Soma soma = new Soma();
        final Subtracao subtracao = new Subtracao();

        final Calculadora calc = new Calculadora(subtracao);

        System.out.println(calc.efetuarCalculo(1, 2));
    }

}
