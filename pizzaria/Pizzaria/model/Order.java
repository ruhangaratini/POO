package Pizzaria.model;

import Pizzaria.repository.DAO;

public class Order extends DAO<OrderItem> implements Entity {
    int id;
    private Customer customer;
    private Double discount;
    private Address delivery;

    public Order(Customer customer, Address delivery) {
        this.customer = customer;
        this.delivery = delivery;
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
    
    public double getPrice() {
        double price = 0.0;
        for(final OrderItem item : this.getAll())
            price += item.getPizza().getPrice() * item.getQuantity();
        
        return price - (price * (discount / 100));
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append(this.id).append("\n");
        text.append("Cliente: ").append(this.customer.getName());

        for(final OrderItem item : this.getAll())
            text.append(item.toString()).append("\n");

        text.append("Desconto: ").append(this.discount).append("%\n");
        text.append("Valor total: R$").append(this.getPrice()).append("\n\n");

        return text.toString();
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }
}
