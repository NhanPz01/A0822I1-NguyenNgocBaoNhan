package com.example.thi_module_3.service;

import com.example.thi_module_3.model.Category;
import com.example.thi_module_3.repository.CategoryRepository;
import com.example.thi_module_3.repository.CategoryRepositoryImpl;

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

    @Override
    public void add(Category category) {

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void deleteById(int id) {

    }
}
