package Pizzaria.model;

import Pizzaria.repository.DAO;

public abstract class Pizza implements Entity {
    private int id;
    private String flavor;
    private Double price;
    private String description;
    private String ingredients;
    private PizzaSize size;

    public Pizza(String flavor, Double price, String description, String ingredients, PizzaSize size) {
        this.flavor = flavor;
        this.price = price;
        this.description = description;
        this.ingredients = ingredients;
        this.size = size;
    }

    @Override
    public int getID() { return this.id; }

    @Override
    public void setID(DAO repository) { this.id = repository.generateID(); }

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

    public PizzaSize getSize() { return size; }

    public void setSize(PizzaSize size) { this.size = size; }

}
