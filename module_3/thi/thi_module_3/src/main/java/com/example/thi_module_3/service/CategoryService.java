package com.example.thi_module_3.service;

import com.example.thi_module_3.model.Category;

import java.util.List;

public interface CategoryService extends Service<Category> {
    List<Category> findAll();
    Category findById(int id);
}
