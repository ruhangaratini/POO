package Pizzaria.model;

import java.util.Scanner;

public class Address {
    private String city;
    private String street;
    private String neighborhood;
    private String number;

    public Address(String city, String street, String neighborhood, String number) {
        this.city = city;
        this.street = street;
        this.neighborhood = neighborhood;
        this.number = number;
    }

    public static Address fromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cidade: ");
        final String city = scanner.next();

        System.out.println("Rua: ");
        final String street = scanner.next();

        System.out.println("Bairro: ");
        final String neighborhood = scanner.next();

        System.out.println("Numero: ");
        final String number = scanner.next();

        return new Address(city, street, neighborhood, number);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return String.format("Cidade: %s\nBairro: %s\nRua: %s\nNumero: %s",
            this.city, this.neighborhood, this.street, this.number);
    }
}
