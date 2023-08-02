package com.example.ungdungmuonsach.service;

import com.example.ungdungmuonsach.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {
    Page<Book> findAll(Pageable pageable);
    Book findById(int id);
    Page<Book> findByTitle(String title, Pageable pageable);
    Boolean isAvailable(Book book);
    void borrow(Book book);
}
