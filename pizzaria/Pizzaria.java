package pizzaria;

import java.util.Scanner;
import pizzaria.model.Pizza;
import pizzaria.repository.PizzaRepository;

public class Pizzaria {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
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
                    break;
                case "3":
                    break;
                case "4":
                    break;
            }
            
            if(!input.equals(5))
                clear();
        }
    }
    
    public static void clear() {
        for(int i = 0; i < 20; i++)
            System.out.println();
    }
    
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
                    repository.add(Pizza.fromUserInput());
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
    
}
