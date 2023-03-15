package com.example.ss_11_product_manager.repo;

import com.example.ss_11_product_manager.bean.Product;
import com.example.ss_11_product_manager.servlet.ProductServlet;

import java.util.List;

public interface Service {
    List<Product> findAll();
    Product find(int id);
    void create(Product product);
    void delete(int id);
    void update(Product product);
}
