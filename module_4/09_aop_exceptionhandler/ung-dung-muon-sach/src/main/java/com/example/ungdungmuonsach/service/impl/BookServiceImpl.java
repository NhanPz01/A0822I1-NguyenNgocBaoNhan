package com.example.ungdungmuonsach.service.impl;

import com.example.ungdungmuonsach.model.Book;
import com.example.ungdungmuonsach.repository.BookRepository;
import com.example.ungdungmuonsach.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository repository;
    @Override
    public Page<Book> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Book findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Page<Book> findByTitle(String title, Pageable pageable) {
        return repository.findBookByTitleContaining(title, pageable);
    }

    @Override
    public Boolean isAvailable(Book book) {
        if (book.getAmount() == null)
            return null;
        return book.getAmount() > 0;
    }

    @Override
    public void borrow(Book book) {
        if (isAvailable(book)) {
            book.setAmount(book.getAmount() - 1);
        }
    }
}
