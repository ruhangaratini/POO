package Pizzaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Pizzaria.model.WorkDay;
import Pizzaria.repository.PizzaRepository;

import static Pizzaria.utils.InterfaceUtils.clear;
import static Pizzaria.view.PizzaMenuView.pizzaMenu;

public class Pizzaria {
    
    public static void main(String[] args) {
        final List<WorkDay> workdays = new ArrayList<WorkDay>();
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
                    orderMenu();
                    break;
                case "3":
                    reportMenu();
                    break;
                case "4":
                    workdays.add(new WorkDay());
                    break;
            }
            
            if(!input.equals("5"))
                clear();
        }
    }


    private static void orderMenu() {

    }

    private static void reportMenu() {

    }
    
}
