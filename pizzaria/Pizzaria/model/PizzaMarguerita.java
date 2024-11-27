package Pizzaria.model;

import java.util.Scanner;

public class PizzaMarguerita extends Pizza {

    public PizzaMarguerita(Double price, PizzaSize size) {
        super("Portuguesa", price, "Pizza sabor marguerita", "Tomate, Majericao, ...", size);
    }

    @Override
    public String toString() {
        return "Pizza Marguerita - " + this.getSize().toString();
    }

    public static PizzaMarguerita fromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preco: ");
        final Double price = scanner.nextDouble();

        System.out.println("Tamanho [P, M, G]: ");
        final String inputSize = scanner.next();

        return new PizzaMarguerita(price, switch (inputSize.toUpperCase()) {
            case "P" -> PizzaSize.SMALL;
            case "G" -> PizzaSize.BIG;
            default -> PizzaSize.MEDIUM;
        });
    }
}
