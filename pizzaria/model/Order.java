package pizzaria.model;

import java.util.ArrayList;

public class Order {
    private final ArrayList<OrderItem<Pizza>> pizzas;
    private Customer customer;
    private Double discount;
    private Address delivery;

    public Order(Customer customer, Double discount, Address delivery) {
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
        for(final OrderItem<Pizza> item : this.pizzas)
            price += item.getPizza().getPrice() * item.getQuantity();
        
        return price - (price * (discount / 100));
    }
    
}
