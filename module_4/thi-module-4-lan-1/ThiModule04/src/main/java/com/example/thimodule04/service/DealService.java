package com.example.thimodule04.service;

import com.example.thimodule04.model.Deal;

import java.util.List;

public interface DealService {
    List<Deal> findAll();
    Deal findById(String id);
    Deal add(Deal deal);
    void deleteById(Deal deal);
    List<Deal> findByOne(String name);
    List<Deal> findByTwo(String name, String type);
    List<Deal> findByType(String type);
}
