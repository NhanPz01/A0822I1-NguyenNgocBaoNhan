package com.example.product_management.service;

import com.example.product_management.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1, "Chair", 10000, "Red, Yellow"));
        products.add(new Product(2, "Chair", 12000, "Blue, White"));
        products.add(new Product(3, "Table", 20000, "Red"));
        products.add(new Product(4, "Desk", 100000, "Green, Yellow"));
    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> searchedProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                searchedProducts.add(product);
            }
        }
        return searchedProducts;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void update(Product product) {
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setColor(product.getColor());
            }
        }
    }

    @Override
    public void delete(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
            }
        }
    }
}
