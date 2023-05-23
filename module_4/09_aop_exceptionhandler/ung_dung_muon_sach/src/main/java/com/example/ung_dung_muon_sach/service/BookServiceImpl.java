package com.example.ung_dung_muon_sach.service;

import com.example.ung_dung_muon_sach.model.Book;
import com.example.ung_dung_muon_sach.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository repository;
    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Book findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Book> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Book add(Book book) {
        if (book.getName() == null || book.getName().isEmpty()) {
            return null;
        }
        if (book.getAmount() < 0) {
            return null;
        }
        return repository.save(book);
    }

    @Override
    public Book update(int id, Book book) {
        Book fromDB = repository.findById(id).orElse(null);
        if (fromDB == null) {
            return null;
        }
        fromDB.setName(book.getName());
        fromDB.setAmount(book.getAmount());
        return repository.save(fromDB);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
