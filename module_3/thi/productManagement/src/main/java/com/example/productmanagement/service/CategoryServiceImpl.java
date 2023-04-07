package com.example.productmanagement.service;

import com.example.productmanagement.model.Category;
import com.example.productmanagement.repository.CategoryRepository;
import com.example.productmanagement.repository.CategoryRepositoryImpl;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository = new CategoryRepositoryImpl();
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id);
    }
}
