package GestaoHospitalar.model;

public class Person {
    private String name;
    private String identity;
    private String cpf;
    private String address;
    private String phone;

    public Person (String name, String identity, String cpf, String address, String phone) {
        this.name = name;
        this.identity = identity;
        this.cpf = cpf;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
            "Identity: " + this.identity + "\n" +
            "CPF: " + this.cpf + "\n" +
            "Address: " + this.address + "\n" +
            "Phone:" + this.phone;
    }
}
