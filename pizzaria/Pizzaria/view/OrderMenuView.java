package Pizzaria.view;

import Pizzaria.model.*;
import Pizzaria.repository.PizzaRepository;

import java.util.Scanner;

import static Pizzaria.utils.InterfaceUtils.clear;

public class OrderMenuView {
    public static void orderMenu(WorkDay workDay) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        clear();

        while(!input.equals("6")) {
            System.out.println("\n----- PEDIDOS -----");
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
                    addOrder(workDay);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
            }
        }
    }

    private static void addOrder(WorkDay workDay) {
        Scanner scanner = new Scanner(System.in);
        PizzaRepository pizzaRepository = PizzaRepository.getInstance();

        System.out.println("Informe o cliente:");
        final Customer customer = Customer.fromUserInput();

        System.out.println("Informe o endereco de entrega:");
        final Address delivery = Address.fromUserInput();

        final Order order = new Order(customer, delivery);

        System.out.println("CARDAPIO\n\n");

        for(final Object pizza : pizzaRepository.getAll())
            System.out.println(pizza);

        String input = "";

        while(!input.equals("N")) {
            System.out.println("Deseja adicionar pizza ao pedido? [S, N]");
            input = scanner.next();

            if(!input.equals("S"))
                continue;

            System.out.println("ID da pizza: ");
            Pizza pizza = pizzaRepository.getByID(scanner.nextInt());

            if(pizza == null) {
                System.out.println("Pizza nao encontrada!");
                continue;
            }

            System.out.print("Quantidade: ");
            int qtt = scanner.nextInt();

            order.addItem(new OrderItem(pizza, qtt));
        }

        System.out.println(order);
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
