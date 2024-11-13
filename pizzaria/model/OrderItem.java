package pizzaria.model;

public class OrderItem {
    private Pizza pizza;
    private int quantity;

    public OrderItem(Pizza item, int quantity) {
        this.pizza = item;
        this.quantity = quantity;
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
    
}
