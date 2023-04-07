package com.example.module3_accountname_wbe.repository;

import com.example.module3_accountname_wbe.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    Customer findById(int id);

    List<Customer> findByName(String name);
    void add(Customer customer);

    void update(Customer customer);

    void deleteById(int id);
}
