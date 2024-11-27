package Pizzaria.model;

public class Customer {
    private final int id;
    private String name;
    private int age;
    private Address address;

    public Customer(String name, int age, Address address) {
        this.id = 1;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
}
