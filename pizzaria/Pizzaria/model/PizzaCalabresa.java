package Pizzaria.model;

import java.util.Scanner;

public class PizzaCalabresa extends Pizza {

    public PizzaCalabresa(Double price, PizzaSize size) {
        super("Calabresa", price, "Pizza sabor calabresa", "Calabresa, ...", size);
    }

    @Override
    public String toString() {
        return this.getID() + " Pizza Calabresa - R$" + this.getPrice() + " - " + this.getSize().toString();
    }

    public static PizzaCalabresa fromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preco: ");
        final Double price = scanner.nextDouble();

        System.out.println("Tamanho [P, M, G] (tamanho padrao - M): ");
        final String inputSize = scanner.next();

        return new PizzaCalabresa(price, switch (inputSize.toUpperCase()) {
            case "P" -> PizzaSize.SMALL;
            case "G" -> PizzaSize.BIG;
            default -> PizzaSize.MEDIUM;
        });
    }

}
