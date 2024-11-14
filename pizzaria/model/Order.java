package pizzaria.model;

import java.util.ArrayList;

public class Order {
    private final int id;
    private final ArrayList<OrderItem> pizzas;
    private Customer customer;
    private Double discount;
    private Address delivery;

    public Order(Customer customer, Double discount, Address delivery) {
        this.id = 1;
        this.pizzas = new ArrayList();
        this.customer = customer;
        this.discount = discount;
        this.delivery = delivery;
    }
    
    public void addPizza(Pizza pizza, int quantity) {
        this.pizzas.add(new OrderItem(pizza, quantity));
    }
    
    public void removePizza(Pizza pizza) {
        
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Address getDelivery() {
        return delivery;
    }

    public void setDelivery(Address delivery) {
        this.delivery = delivery;
    }
    
    public Double getPrice() {
        Double price = 0.0;
        for(final OrderItem item : this.pizzas)
            price += item.getPizza().getPrice() * item.getQuantity();
        
        return price - (price * (discount / 100));
    }
    
}
