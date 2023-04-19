package com.example.product_management.service;

import com.example.product_management.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(int id);

    List<Product> findByName(String name);

    void add(Product product);

    void update(Product product);

    void delete(int id);
}
