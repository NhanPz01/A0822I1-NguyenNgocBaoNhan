package com.example.thimodule04.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project {
    @Id
    private String id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "bussiness_id")
    private Bussiness bussiness;
    private Double cost;
    private String description;
    private Integer registeringTime;
    private Date createdDate;

    public Project() {
    }

    public Project(String id, String name, Bussiness bussiness, Double cost, String description, Integer registeringTime, Date createdDate) {
        this.id = id;
        this.name = name;
        this.bussiness = bussiness;
        this.cost = cost;
        this.description = description;
        this.registeringTime = registeringTime;
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bussiness getBussiness() {
        return bussiness;
    }

    public void setBussiness(Bussiness bussiness) {
        this.bussiness = bussiness;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRegisteringTime() {
        return registeringTime;
    }

    public void setRegisteringTime(Integer registeringTime) {
        this.registeringTime = registeringTime;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
