package com.example.ss_11_product_manager.service;

import com.example.ss_11_product_manager.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    void create(Product product);
    void delete(int id);
    void update(Product product);
}
