package com.example.furama_resort_management.model.customer;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    private CustomerType customerType;
    @Column(name = "name", columnDefinition = "VARCHAR(45)")
    private String name;
    @Column(name = "date_of_birth", columnDefinition = "DATE")
    private Date dateOfBirth;
    private Boolean gender;
    @Column(name = "id_card", columnDefinition = "VARCHAR(45)")
    private String idCard;
    @Column(name = "phone_number", columnDefinition = "VARCHAR(45)")
    private String phoneNumber;
    @Column(name = "email", columnDefinition = "VARCHAR(45)")
    private String email;
    @Column(name = "address", columnDefinition = "VARCHAR(45)")
    private String address;

    public Customer() {
    }

    public Customer(Integer id, CustomerType customerType, String name, Date dateOfBirth, Boolean gender, String idCard, String phoneNumber, String email, String address) {
        this.id = id;
        this.customerType = customerType;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
