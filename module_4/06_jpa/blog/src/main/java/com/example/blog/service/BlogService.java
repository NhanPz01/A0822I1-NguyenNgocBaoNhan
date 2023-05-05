package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog findById(int id);
    List<Blog> findByAuthor(String author);
    Blog add(Blog blog);
    Blog update(int id, Blog blog);
    void delete(int id);
}
