package com.example.hien_thi_gia_vi_sandwich.service;

import com.example.hien_thi_gia_vi_sandwich.model.Flavor;

import java.util.List;

public interface FlavorService {
    List<String> findAll();
    void add(Flavor flavor);
    void save(List<String> choices);
}
