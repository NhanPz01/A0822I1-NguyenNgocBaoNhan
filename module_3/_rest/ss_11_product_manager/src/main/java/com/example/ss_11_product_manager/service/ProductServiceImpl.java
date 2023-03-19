package com.example.ss_11_product_manager.service;

import com.example.ss_11_product_manager.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Desk"));
        productMap.put(2, new Product(2, "Table"));
        productMap.put(3, new Product(3, "Lamp"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void create(Product product) {
        if (!productMap.containsKey(product.getId())) {
            productMap.put(product.getId(), product);
        }
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }

    @Override
    public void update(Product product) {
        if (productMap.containsKey(product.getId())) {
            productMap.put(product.getId(), product);
        }
    }
}
