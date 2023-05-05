package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository repository;
    @Override
    public List<Blog> findAll() {
        return repository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> findByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    @Override
    public Blog add(Blog blog) {
        if (blog.getAuthor() == null || blog.getAuthor().isEmpty())
            return null;
        if (blog.getTitle() == null || blog.getTitle().isEmpty())
            return null;
        if (blog.getContent() == null || blog.getContent().isEmpty())
            return null;
        return repository.save(blog);
    }

    @Override
    public Blog update(int id, Blog blog) {
        Blog fromDB = repository.findById(id).orElse(null);
        if (blog == null)
            return null;
        fromDB.setAuthor(blog.getAuthor());
        fromDB.setTitle(blog.getTitle());
        fromDB.setContent(blog.getContent());
        return repository.save(fromDB);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
