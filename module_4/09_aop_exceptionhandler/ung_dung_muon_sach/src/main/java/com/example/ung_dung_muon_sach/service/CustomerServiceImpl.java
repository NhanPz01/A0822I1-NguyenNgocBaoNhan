package com.example.ung_dung_muon_sach.service;

import com.example.ung_dung_muon_sach.model.Customer;
import com.example.ung_dung_muon_sach.repository.CustomerRepository;
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
    public Customer add(Customer customer) {
        if (customer.getName() == null || customer.getName().isEmpty()) {
            return null;
        }
        return repository.save(customer);
    }

    @Override
    public Customer update(int id, Customer customer) {
        Customer fromDB = repository.findById(id).orElse(null);
        if (fromDB == null) {
            return null;
        }
        fromDB.setName(customer.getName());
        return repository.save(fromDB);
    }

    @Override
    public Customer delete(int id) {
        return null;
    }
}
