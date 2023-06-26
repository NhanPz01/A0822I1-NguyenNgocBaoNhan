package com.example.thimodule04.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "giao_dich")
public class Deal {
    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private Date dealDate;
    private String dealType;
    private Double cost;
    private Double area;

    public Deal() {
    }

    public Deal(String id, Customer customer, Date dealDate, String dealType, Double cost, Double area) {
        this.id = id;
        this.customer = customer;
        this.dealDate = dealDate;
        this.dealType = dealType;
        this.cost = cost;
        this.area = area;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
