package com.example.blog.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "integer")
    private int id;
    @Column(name = "author", columnDefinition = "VARCHAR(100)")
    private String author;
    @Column(name = "title", columnDefinition = "VARCHAR(100)")
    private String title;
    @Column(name = "content", columnDefinition = "VARCHAR(100)")
    private String content;

    public Blog() {
    }

    public Blog(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public Blog(int id, String author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
