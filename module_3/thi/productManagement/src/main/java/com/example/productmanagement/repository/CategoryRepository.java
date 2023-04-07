package com.example.productmanagement.repository;

import com.example.productmanagement.model.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();
    Category findById(int id);
}
