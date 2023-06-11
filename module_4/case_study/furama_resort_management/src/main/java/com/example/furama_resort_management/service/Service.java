package com.example.furama_resort_management.service;


import org.springframework.data.domain.Page;

import java.util.List;

public interface Service<T> {
    Page<T> findAll(int page, int pageSize);
    T findById(int id);
    List<T> findByCustomerName(String name);
    T add(T t);
    T update(int id, T customer);
    void delete(int id);
}
