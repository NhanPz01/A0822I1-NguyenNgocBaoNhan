package com.example.blog_update.repository;

import com.example.blog_update.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
