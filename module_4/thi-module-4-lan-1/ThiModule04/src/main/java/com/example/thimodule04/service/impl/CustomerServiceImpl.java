package com.example.thimodule04.service.impl;

import com.example.thimodule04.model.Customer;
import com.example.thimodule04.repository.CustomerRepository;
import com.example.thimodule04.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Customer add(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
