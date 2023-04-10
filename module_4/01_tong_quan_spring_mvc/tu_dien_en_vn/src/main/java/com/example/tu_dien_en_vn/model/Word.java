package com.example.tu_dien_en_vn.model;

public class Word {
    private int id;
    private String enMeaning;
    private String vnMeaning;

    public Word() {
    }

    public Word(int id, String enMeaning, String vnMeaning) {
        this.id = id;
        this.enMeaning = enMeaning;
        this.vnMeaning = vnMeaning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnMeaning() {
        return enMeaning;
    }

    public void setEnMeaning(String enMeaning) {
        this.enMeaning = enMeaning;
    }

    public String getVnMeaning() {
        return vnMeaning;
    }

    public void setVnMeaning(String vnMeaning) {
        this.vnMeaning = vnMeaning;
    }
}
