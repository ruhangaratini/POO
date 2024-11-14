package pizzaria.model;

public class OrderItem {
    private Pizza pizza;
    private int quantity;
    private boolean border;
    private String borderFlavor;
    private String additionalIngredients;

    public OrderItem(Pizza pizza, int quantity, boolean border, String borderFlavor, String additionalIngredients) {
        this.pizza = pizza;
        this.quantity = quantity;
        this.border = border;
        this.borderFlavor = borderFlavor;
        this.additionalIngredients = additionalIngredients;
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

    public boolean isBorder() {
        return border;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }

    public String getBorderFlavor() {
        return borderFlavor;
    }

    public void setBorderFlavor(String borderFlavor) {
        this.borderFlavor = borderFlavor;
    }

    public String getAdditionalIngredients() {
        return additionalIngredients;
    }

    public void setAdditionalIngredients(String additionalIngredients) {
        this.additionalIngredients = additionalIngredients;
    }
    
}
