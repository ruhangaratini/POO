package Pizzaria.model;

import java.util.ArrayList;

public class Order {
    private final ArrayList<OrderItem> pizzas;
    private Customer customer;
    private Double discount;
    private Address delivery;

    public Order(Customer customer, Address delivery) {
        this.pizzas = new ArrayList<OrderItem>();
        this.customer = customer;
        this.delivery = delivery;
    }
    
    public void addItem(OrderItem orderItem) {
        this.pizzas.add(orderItem);
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
