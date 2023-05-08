package com.example.blog_update.model;


import javax.persistence.*;
import java.util.Date;

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
    @Column(name = "content", columnDefinition = "LONGTEXT")
    private String content;
    @Column(name = "init_time", columnDefinition = "DATE")
    private java.sql.Date initTime;

    @ManyToOne
    @JoinColumn(name = "id_category", columnDefinition = "INTEGER")
    private Category category;

    public Blog() {
    }

    public Blog(String author, String title, String content, Category category) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.category = category;
    }

    public Blog(int id, String author, String title, String content, Category category) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getInitTime() {
        return initTime;
    }

    public void setInitTime(Date initTime) {
        this.initTime = (java.sql.Date) initTime;
    }
}
