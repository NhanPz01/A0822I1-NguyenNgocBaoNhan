package com.example.productmanagement.repository;

import com.example.productmanagement.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(int id);
    void add(Product product);
    void update(Product product);
    void deleteById(int id);
    List<Product> findByName(String name);
    List<Product> findByPrice(double price);
}
