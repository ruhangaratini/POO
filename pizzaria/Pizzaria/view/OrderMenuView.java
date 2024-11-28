package Pizzaria.view;

import Pizzaria.model.*;
import Pizzaria.repository.PizzaRepository;

import java.util.ArrayList;
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
                    searchOrder(workDay);
                    break;
                case "3":
                    updateOrder(workDay);
                    break;
                case "4":
                    listAll(workDay.getAll());
                    break;
                case "5":
                    removeOrder(workDay);
                    break;
            }
        }
    }

    private static void addOrder(WorkDay workDay) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        PizzaRepository pizzaRepository = PizzaRepository.getInstance();

        System.out.println("Informe o cliente:");
        final Customer customer = Customer.fromUserInput();

        System.out.println("Informe o endereco de entrega:");
        final Address delivery = Address.fromUserInput();

        final Order order = new Order(customer, delivery);

        while(!input.equalsIgnoreCase("N")) {
            System.out.print("CARDAPIO\n\n");
            for(final Object pizza : pizzaRepository.getAll())
                System.out.println(pizza);

            System.out.print("Deseja adicionar pizza ao pedido? [S, N]: ");
            input = scanner.next();

            if(!input.equalsIgnoreCase("S"))
                continue;

            System.out.print("ID da pizza: ");
            Pizza pizza = pizzaRepository.getByID(scanner.nextInt());

            if(pizza == null) {
                System.out.println("Pizza nao encontrada!");
                continue;
            }

            System.out.print("Quantidade: ");
            int qtt = scanner.nextInt();

            order.add(new OrderItem(pizza, qtt));
        }

        System.out.print("Desconto em %: ");
        order.setDiscount(scanner.nextDouble());

        System.out.println(order);
        workDay.add(order);
    }

    private static void searchOrder(WorkDay workDay) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        final int id = scanner.nextInt();
        final Order order = workDay.getByID(id);

        if(order != null)
            System.out.println(order);
        else
            System.out.println("Pedido nao encontrado!");
    }

    private static void updateOrder(WorkDay workDay) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        final int orderID = scanner.nextInt();

        final Order order = workDay.getByID(orderID);

        if(order == null) {
            System.out.println("Pedido nao encontrado!");
            return;
        }

        String input = "";
        while (!input.equals("0")) {
            for(final OrderItem item : order.getAll())
                System.out.println(item);

            System.out.println("Alterar qual item [0 para sair]: ");
            input = scanner.next();

            if(input.equals("0"))
                continue;

            OrderItem item = order.getByID(Integer.parseInt(input));

            if(item == null) {
                System.out.println("Item nao encontrado");
                continue;
            }

            System.out.println("Nova quantidade: ");
            item.setQuantity(scanner.nextInt());
        }

        System.out.println("\n\n" + order);
    }

    private static void removeOrder(WorkDay workDay) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        final Order order = workDay.getByID(scanner.nextInt());

        if(order == null) {
            System.out.println("Pedido nao encontrado!");
            return;
        }

        workDay.remove(order);
        System.out.println("Pedido removido com sucesso");
    }

    private static void listAll(ArrayList<Order> items) {
        for(final Object item : items)
            System.out.println(item);
    }
}
