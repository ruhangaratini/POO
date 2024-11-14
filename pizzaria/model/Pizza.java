package pizzaria.model;

import java.util.Scanner;
import pizzaria.repository.PizzaRepository;

public class Pizza {
    private int id;
    private String flavor;
    private Double price;
    private String description;
    private String ingredients;

    public Pizza(int id, String flavor, Double price, String description, String ingredients) {
        this.id = id;
        this.flavor = flavor;
        this.price = price;
        this.description = description;
        this.ingredients = ingredients;
    }
    
    public static Pizza fromUserInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nSabor: ");
        final String flavor = scanner.nextLine();
        
        System.out.println("Preco: ");
        final Double price = scanner.nextDouble();
        
        System.out.println("Descricao: ");
        final String description = scanner.nextLine();
        
        System.out.println("Ingredientes: ");
        final String ingredients = scanner.nextLine();
        
        return new Pizza(
            PizzaRepository.getInstance().generateID(),
            flavor,
            price,
            description,
            ingredients 
        );
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    
}
