package com.example.furama_resort_management.service;

import java.util.List;

public interface TypeService<T> {
    List<T> findAll();
    T findById(int id);
}
