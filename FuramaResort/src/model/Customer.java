package model;

import util.ConstantUtil.Gender;
import util.ConstantUtil.CustomerType;

public class Customer extends Person {
    private int customerId;
    private CustomerType customerType;
    private String address;

    public Customer() {
    }

    public Customer(int customerId, String fullName, String dateOfBirth, Gender gender, String personId, String phoneNumber, String email, CustomerType customerType, String address) {
        super(fullName, dateOfBirth, gender, personId, phoneNumber, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", this.customerId, super.toString(), this.customerType.name(), this.address);
    }
}
