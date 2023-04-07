package com.example.module3_accountname_wbe.repository;

import com.example.module3_accountname_wbe.model.CustomerType;

import java.util.List;

public interface CustomerTypeRepository {
    CustomerType findById(int id);
    List<CustomerType> findAll();
    List<CustomerType> findByName(String name);
    void add(CustomerType customerType);
    void update(CustomerType customerType);
    void deleteById(int id);
}
