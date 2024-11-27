package Pizzaria.view;

import Pizzaria.model.Pizza;
import Pizzaria.model.PizzaCalabresa;
import Pizzaria.model.PizzaMarguerita;
import Pizzaria.model.PizzaPortuguesa;
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
                    break;
                case "4":
                    listAll(repository.getAll());
                    break;
                case "5":
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
        System.out.println("ID: ");
        final int id = scanner.nextInt();
        System.out.println(id);
        final Pizza pizza = repository.getByID(id);

        if(pizza != null)
            System.out.println(pizza);
        else
            System.out.println("Pizza nao encontrada!");
    }

    private static void listAll(Object[] array) {
        for(int i = 0; i < array.length; i++)
            System.out.println((i + 1) + " - " + array[i]);
    }
}
