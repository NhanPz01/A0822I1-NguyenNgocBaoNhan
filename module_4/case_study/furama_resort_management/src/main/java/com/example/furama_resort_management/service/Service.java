package com.example.furama_resort_management.service;

import java.util.List;

public interface Service<T> {
    List<T> findAll();
    T findById(int id);
    List<T> findByCustomerName(String name);
    T add(T customer);
    T update(int id, T customer);
    void delete(int id);
}
