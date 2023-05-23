package com.example.ung_dung_muon_sach.service;

import com.example.ung_dung_muon_sach.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    Customer add(Customer customer);
    Customer update(int id, Customer customer);
    Customer delete(int id);
}
