package pizzaria.model;

public class Address {
    private String cep;
    private String city;
    private String state;
    private String street;
    private String neighborhood;
    private String number;

    public Address(String cep, String city, String state, String street, String neighborhood, String number) {
        this.cep = cep;
        this.city = city;
        this.state = state;
        this.street = street;
        this.neighborhood = neighborhood;
        this.number = number;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        return String.format("Estado: %s\nCidade: %s\nBairro: %s\nRua: %s\nNumero: %s\nCEP: %s", 
            this.state, this.city, this.neighborhood, this.street, this.number, this.cep);
    }
}
