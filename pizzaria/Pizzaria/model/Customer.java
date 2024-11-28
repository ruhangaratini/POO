package Pizzaria.model;

import java.util.Scanner;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public static Customer fromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        return new Customer(scanner.next());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
