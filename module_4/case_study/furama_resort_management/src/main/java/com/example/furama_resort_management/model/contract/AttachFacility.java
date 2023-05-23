package com.example.furama_resort_management.model.contract;

import javax.persistence.*;

@Entity
@Table(name = "attach_facility")
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", columnDefinition = "VARCHAR(45)")
    private String name;
    private Double cost;
    @Column(name = "unit", columnDefinition = "VARCHAR(10)")
    private String unit;
    @Column(name = "status", columnDefinition = "VARCHAR(45)")
    private String status;

    public AttachFacility() {
    }

    public AttachFacility(Integer id, String name, Double cost, String unit, String status) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.unit = unit;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
