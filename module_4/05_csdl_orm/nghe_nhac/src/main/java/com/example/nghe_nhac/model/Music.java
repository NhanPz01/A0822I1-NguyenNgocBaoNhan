package com.example.nghe_nhac.model;

import javax.persistence.*;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;
    private String type;
    private String link;

    public Music() {
    }

    public Music(String name, String author, String type, String link) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.link = link;
    }

    public Music(Integer id, String name, String author, String type, String link) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.type = type;
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
