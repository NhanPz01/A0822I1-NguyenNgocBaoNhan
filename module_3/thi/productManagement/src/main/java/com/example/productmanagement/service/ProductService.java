package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;

import java.util.List;

public interface ProductService extends Service<Product> {
    List<Product> findByName(String name);
    List<Product> findByPrice(double price);
}
