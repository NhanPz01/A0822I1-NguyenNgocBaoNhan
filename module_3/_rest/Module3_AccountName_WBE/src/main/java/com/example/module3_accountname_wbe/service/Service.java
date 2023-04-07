package com.example.module3_accountname_wbe.service;

import com.example.module3_accountname_wbe.model.Customer;

import java.util.List;

public interface Service<T> {
    List<T> findAll();
    T findById(int id);
    void add(T t);
    void update(T t);
    void deleteById(int id);
}
