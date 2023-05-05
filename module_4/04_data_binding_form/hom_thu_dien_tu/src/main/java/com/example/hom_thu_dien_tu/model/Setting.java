package com.example.hom_thu_dien_tu.model;

import javax.persistence.*;

@Entity
public class Setting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "integer")
    private int id;
    @Column(name = "language", columnDefinition = "VARCHAR(100)")
    private String language;
    @Column(name = "page_size", columnDefinition = "integer")
    private int pageSize;
    @Column(name = "spams_filter", columnDefinition = "boolean")
    private boolean spamsFilter;
    @Column(name = "signature", columnDefinition = "VARCHAR(100)")
    private String signature;

    public Setting() {
    }

    public Setting(int id, String language, int pageSize, boolean spamsFilter, String signature) {
        this.id = id;
        this.language = language;
        this.pageSize = pageSize;
        this.spamsFilter = spamsFilter;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(boolean spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
