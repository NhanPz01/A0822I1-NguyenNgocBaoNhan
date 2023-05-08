package com.example.blog_update.service;

import com.example.blog_update.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog findById(int id);
    Blog add(Blog blog);
    Blog update(int id, Blog blog);
    void deleteById(int id);
}
