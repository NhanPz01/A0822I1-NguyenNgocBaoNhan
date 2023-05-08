package com.example.blog_update.service;

import com.example.blog_update.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(int id);
    Category add(String categoryName);
}
