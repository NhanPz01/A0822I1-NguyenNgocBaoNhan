package models;

public class Customer extends Person {
    enum Type {
        Diamond,
        Platinum,
        Gold,
        Silver,
        Member
    }
    Type customerType;
    String address;

    public Customer() {
    }

    public Customer(Type customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Type getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Type customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
