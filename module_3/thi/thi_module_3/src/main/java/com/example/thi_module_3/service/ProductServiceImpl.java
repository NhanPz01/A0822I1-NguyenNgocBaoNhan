package com.example.thi_module_3.service;

import com.example.thi_module_3.model.Product;
import com.example.thi_module_3.repository.ProductRepository;
import com.example.thi_module_3.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = new ProductRepositoryImpl();
    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> findByPrice(double price) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
}
