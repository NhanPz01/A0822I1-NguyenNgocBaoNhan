package com.example.thi_module_3.repository;

import com.example.thi_module_3.model.Product;

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
