package com.example.thimodule04.service;

import com.example.thimodule04.model.Customer;
import com.example.thimodule04.repository.CustomerRepository;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(int id);
    List<Customer> findByName(String name);

    Customer add(Customer customer);

    void deleteById(int id);
}