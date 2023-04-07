package com.example.thi_module_3.service;

import com.example.thi_module_3.model.Product;

import java.util.List;

public interface ProductService extends Service<Product> {
    List<Product> findByName(String name);
    List<Product> findByPrice(double price);
}
