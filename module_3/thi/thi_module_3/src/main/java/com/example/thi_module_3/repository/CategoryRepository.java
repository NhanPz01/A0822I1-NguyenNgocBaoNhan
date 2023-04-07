package com.example.thi_module_3.repository;

import com.example.thi_module_3.model.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();
    Category findById(int id);
}
