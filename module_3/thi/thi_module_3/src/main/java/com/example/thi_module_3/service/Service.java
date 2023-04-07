package com.example.thi_module_3.service;

import java.util.List;

public interface Service<T> {
    List<T> findAll();
    T findById(int id);
    void add(T t);
    void update(T t);
    void deleteById(int id);
}
