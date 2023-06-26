package com.example.furama_resort_management.service;

import com.example.furama_resort_management.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService extends Service<Customer> {
    Page<Customer> findByName(String name, Pageable pageable);
}
