package com.example.blog_update.dao;

import com.example.blog_update.model.Category;

import javax.persistence.Column;
import java.sql.Date;

public class BlogDAO {
    private String author;
    private String title;
    private String content;

    private Category category;

    public BlogDAO() {
    }

    public BlogDAO(String author, String title, String content, Category category) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
