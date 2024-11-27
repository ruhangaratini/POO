package Pizzaria.model;

import Pizzaria.repository.DAO;

import java.util.ArrayList;

public class Order implements Entity {
    private int id;
    private final ArrayList<OrderItem> pizzas;
    private Customer customer;
    private Double discount;
    private Address delivery;

    public Order(Customer customer, Double discount, Address delivery) {
        this.pizzas = new ArrayList<OrderItem>();
        this.customer = customer;
        this.discount = discount;
        this.delivery = delivery;
    }
    
    public void addItem(Pizza pizza, int quantity, boolean border, String observation) {
        this.pizzas.add(new OrderItem(pizza, quantity, border, observation));
    }
    
    public void removeItem(Pizza pizza) {
        
    }

    @Override
    public int getID() { return this.id; }

    @Override
    public void setID(DAO repository) { this.id = repository.generateID(); }


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
