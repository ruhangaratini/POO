package Pizzaria.view;

import Pizzaria.model.*;
import Pizzaria.repository.PizzaRepository;

import java.util.Scanner;

import static Pizzaria.utils.InterfaceUtils.clear;

public class PizzaMenuView {
    public static void pizzaMenu() {
        PizzaRepository repository = PizzaRepository.getInstance();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        clear();

        while(!input.equals("6")) {
            System.out.println("\n----- PIZZAS -----");
            System.out.println("1. Adicionar");
            System.out.println("2. Buscar");
            System.out.println("3. Atualizar");
            System.out.println("4. Listar");
            System.out.println("5. Remover");
            System.out.println("6. Sair");
            System.out.println("------------------\n");

            System.out.print("Opcao: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    addPizza(repository);
                    break;
                case "2":
                    searchPizza(repository);
                    break;
                case "3":
                    updatePizza(repository);
                    break;
                case "4":
                    listAll(repository.getAll());
                    break;
                case "5":
                    removePizza(repository);
                    break;
            }
        }
    }

    private static void addPizza(PizzaRepository repository) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1] Calabresa\n[2] Portuguesa\n[3] Marguerita\n\nOpcao: ");

        switch (scanner.nextLine()) {
            case "1":
                repository.add(PizzaCalabresa.fromUserInput());
                break;
            case "2":
                repository.add(PizzaPortuguesa.fromUserInput());
                break;
            case "3":
                repository.add(PizzaMarguerita.fromUserInput());
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
    }

    private static void searchPizza(PizzaRepository repository) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        final int id = scanner.nextInt();
        final Pizza pizza = repository.getByID(id);

        if(pizza != null)
            System.out.println(pizza);
        else
            System.out.println("Pizza nao encontrada!");
    }

    private static void updatePizza(PizzaRepository repository) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        final int id = scanner.nextInt();

        final Pizza pizza = repository.getByID(id);

        if(pizza == null) {
            System.out.println("Pizza nao encontrada!");
            return;
        }

        System.out.println(pizza);
        System.out.print("\nNovo preco: ");
        pizza.setPrice(scanner.nextDouble());

        System.out.print("\nNovo tamanho [P, M, G] (tamanho padrao - M): ");
        pizza.setSize(switch (scanner.next().toUpperCase()) {
            case "P" -> PizzaSize.SMALL;
            case "G" -> PizzaSize.BIG;
            default -> PizzaSize.MEDIUM;
        });

        System.out.println("\n\n" + pizza);
    }

    private static void removePizza(PizzaRepository repository) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        final Pizza pizza = repository.getByID(scanner.nextInt());

        if(pizza == null) {
            System.out.println("Pizza nao encontrada!");
            return;
        }

        repository.remove(pizza);
        System.out.println("Pizza removida com sucesso");
    }

    private static void listAll(Object[] items) {
        for(final Object item : items)
            System.out.println(item);
    }
}
