package com.example.productmanagement.service;

import com.example.productmanagement.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(int id);
}
