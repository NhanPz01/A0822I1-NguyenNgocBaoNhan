package com.example.ung_dung_muon_sach.service;

import com.example.ung_dung_muon_sach.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(int id);
    List<Book> findByName(String name);
    Book add(Book book);
    Book update(int id, Book book);
    void delete(int id);
}
