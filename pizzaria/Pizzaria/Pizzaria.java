package Pizzaria;

import java.util.ArrayList;
import java.util.Scanner;
import Pizzaria.model.WorkDay;

import static Pizzaria.utils.InterfaceUtils.clear;
import static Pizzaria.view.OrderMenuView.orderMenu;
import static Pizzaria.view.PizzaMenuView.pizzaMenu;
import static Pizzaria.view.ReportMenuView.reportMenu;

public class Pizzaria {
    
    public static void main(String[] args) {
        final ArrayList<WorkDay> workdays = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        workdays.add(new WorkDay());

        while(!input.equals("5")) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Pizzas");
            System.out.println("2. Pedidos");
            System.out.println("3. Relatorios");
            System.out.println("4. Finalizar o dia");
            System.out.println("5. Sair");
            System.out.println("----------------\n");
            
            System.out.print("Opcao: ");
            input = scanner.nextLine();
            
            switch (input) {
                case "1":
                    pizzaMenu();
                    break;
                case "2":
                    orderMenu(workdays.getLast());
                    break;
                case "3":
                    reportMenu(workdays);
                    break;
                case "4":
                    workdays.add(new WorkDay());
                    break;
            }
            
            if(!input.equals("5"))
                clear();
        }
    }
    
}
