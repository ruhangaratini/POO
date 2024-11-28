package Pizzaria.view;

import Pizzaria.model.Order;
import Pizzaria.model.WorkDay;

import java.util.ArrayList;
import java.util.Scanner;

import static Pizzaria.utils.InterfaceUtils.clear;

public class ReportMenuView {
    public  static void reportMenu(ArrayList<WorkDay> workDays) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        clear();

        while(!input.equals("3")) {
            System.out.println("\n----- RELATORIOS -----");
            System.out.println("1. Cliente");
            System.out.println("2. Dia");
            System.out.println("3. Sair");
            System.out.println("------------------\n");

            System.out.print("Opcao: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    reportByCustomer(workDays);
                    break;
                case "2":
                    reportAll(workDays);
                    break;
            }
        }
    }

    private static void reportByCustomer(ArrayList<WorkDay> workDays) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do cliente: ");
        final String customerName = scanner.next();

        int countOrders = 0;
        double countTotalValue = 0;

        for(final WorkDay workDay : workDays) {
            for(final Order order : workDay.getAll()) {
                if(order.getCustomer().getName().equalsIgnoreCase(customerName)) {
                    countOrders++;
                    countTotalValue += order.getPrice();
                }
            }
        }

        System.out.println(customerName);
        System.out.println("Pedidos: " + countOrders);
        System.out.printf("Valor total: %.2f%n",  countTotalValue);
    }

    public static void reportAll(ArrayList<WorkDay> workDays) {
        int countOrders = 0;
        double countTotalValue = 0;

        for(final WorkDay workDay : workDays) {
            for(final Order order : workDay.getAll()) {
                countOrders++;
                countTotalValue += order.getPrice();
            }

            System.out.println(workDay.getDay());
            System.out.println("Pedidos: " + countOrders);
            System.out.printf("Valor total: %.2f%n\n\n",  countTotalValue);
        }
    }
}
