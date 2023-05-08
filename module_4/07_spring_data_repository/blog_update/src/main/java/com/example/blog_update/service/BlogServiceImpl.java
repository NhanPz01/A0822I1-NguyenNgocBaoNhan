package com.example.blog_update.service;

import com.example.blog_update.model.Blog;
import com.example.blog_update.repository.BlogRepository;
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
    public Blog add(Blog blog) {
        if (blog.getTitle() == null || blog.getTitle().isEmpty())
            return null;
        if (blog.getAuthor() == null || blog.getAuthor().isEmpty())
            return null;
        if (blog.getContent() == null || blog.getContent().isEmpty())
            return null;
        return repository.save(blog);
    }

    @Override
    public Blog update(int id, Blog blog) {
        Blog fromDB = repository.findById(id).orElse(null);
        if (fromDB == null)
            return null;
        fromDB.setTitle(blog.getTitle());
        fromDB.setContent(blog.getContent());
        fromDB.setAuthor(blog.getAuthor());
        fromDB.setCategory(blog.getCategory());
        return repository.save(fromDB);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
