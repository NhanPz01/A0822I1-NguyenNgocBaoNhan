package com.example.product_management_to_spring_boot.model;
import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "integer")
    private Integer id;
    @Column(name = "name", columnDefinition = "VARCHAR(45)", nullable = false)
    private String name;
    @Column(name = "price", columnDefinition = "DOUBLE", nullable = false)
    private double price;
    @Column(name = "color", columnDefinition = "VARCHAR(45)", nullable = false)
    private String color;

    public Product() {
    }

    public Product(Integer id, String name, double price, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
