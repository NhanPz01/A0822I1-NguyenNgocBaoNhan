package com.example.module3_accountname_wbe.service;

import com.example.module3_accountname_wbe.model.Customer;

import java.util.List;

public interface CustomerService extends Service<Customer> {
    List<Customer> findByName(String name);
}
