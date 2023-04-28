package com.example.nghe_nhac.model;

import javax.persistence.*;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "integer")
    private int id;
    @Column(name = "name", columnDefinition = "VARCHAR(100)", nullable = false)
    private String name;
    @Column(name = "author", columnDefinition = "VARCHAR(100)", nullable = false)
    private String author;
    @Column(name = "type", columnDefinition = "VARCHAR(100)", nullable = false)
    private String type;
    @Column(name = "link", columnDefinition = "VARCHAR(100)", nullable = false)
    private String link;

    public Music() {
    }

    public Music(int id, String name, String author, String type, String link) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.type = type;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
