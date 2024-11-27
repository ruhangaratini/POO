package Pizzaria.model;

public class OrderItem {
    private Pizza pizza;
    private int quantity;
    private boolean border;
    private String observation;

    public OrderItem(Pizza pizza, int quantity, boolean border, String observation) {
        this.pizza = pizza;
        this.quantity = quantity;
        this.border = border;
        this.observation = observation;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean hasBorder() {
        return border;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }

    public String getObservation() { return this.observation; }

    public void setObservation(String observation) { this.observation = observation; }

}
