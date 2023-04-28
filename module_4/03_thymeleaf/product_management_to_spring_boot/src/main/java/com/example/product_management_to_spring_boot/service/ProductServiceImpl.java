package com.example.product_management_to_spring_boot.service;

import com.example.product_management_to_spring_boot.model.Product;
import com.example.product_management_to_spring_boot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Product> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void add(Product product) {
        this.repository.save(product);
    }

    @Override
    public void update(Product product) {
        this.repository.save(product);
    }

    @Override
    public void delete(int id) {
        this.repository.deleteById(id);
    }
}
