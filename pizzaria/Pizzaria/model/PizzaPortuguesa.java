package Pizzaria.model;

import java.util.Scanner;

public class PizzaPortuguesa extends Pizza {

    public PizzaPortuguesa(Double price, PizzaSize size) {
        super("Portuguesa", price, "Pizza sabor portuguesa", "Queijo, ...", size);
    }

    @Override
    public String toString() {
        return this.getID() + " Pizza Portuguesa - R$" + this.getPrice() + " - " + this.getSize().toString();
    }

    public static PizzaPortuguesa fromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preco: ");
        final Double price = scanner.nextDouble();

        System.out.println("Tamanho [P, M, G] (tamanho padrao - M): ");
        final String inputSize = scanner.next();

        return new PizzaPortuguesa(price, switch (inputSize.toUpperCase()) {
            case "P" -> PizzaSize.SMALL;
            case "G" -> PizzaSize.BIG;
            default -> PizzaSize.MEDIUM;
        });
    }
}
