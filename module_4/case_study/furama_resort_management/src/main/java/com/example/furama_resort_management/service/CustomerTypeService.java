package com.example.furama_resort_management.service;

import com.example.furama_resort_management.model.customer.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAll();
    CustomerType findById(int id);
    CustomerType findByName(String name);
}
