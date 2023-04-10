package com.example.hien_thi_gia_vi_sandwich.model;

public class Flavor {
    private int id;
    private String name;

    public Flavor() {
    }

    public Flavor(int id, String name) {
        this.id = id;
        this.name = name;
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
}
