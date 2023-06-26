package com.example.furama_resort_management.service.impl;

import com.example.furama_resort_management.model.customer.Customer;
import com.example.furama_resort_management.repository.customer.CustomerRepository;
import com.example.furama_resort_management.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repository;

    @Override
    public Page<Customer> findAll(int page, int pageSize) {
        return repository.findAll(PageRequest.of(page, pageSize));
    }

    @Override
    public Customer findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Customer add(Customer customer) {
        if (customer.getName() == null || customer.getName().isEmpty())
            return null;
        if (customer.getEmail() == null || customer.getEmail().isEmpty())
            return null;
        if (customer.getPhoneNumber() == null || customer.getPhoneNumber().isEmpty())
            return null;
        if (customer.getAddress() == null || customer.getAddress().isEmpty())
            return null;
        if (customer.getGender() == null)
            return null;
        if (customer.getDateOfBirth() == null)
            return null;
        if (customer.getIdCard() == null || customer.getIdCard().isEmpty())
            return null;
        if (customer.getCustomerType() == null)
            return null;
        return repository.save(customer);
    }

    @Override
    public Customer update(int id, Customer customer) {
        Customer fromDB = repository.findById(id).orElse(null);
        if (fromDB == null)
            return null;
        fromDB.setName(customer.getName());
        fromDB.setEmail(customer.getEmail());
        fromDB.setPhoneNumber(customer.getPhoneNumber());
        fromDB.setAddress(customer.getAddress());
        fromDB.setGender(customer.getGender());
        fromDB.setDateOfBirth(customer.getDateOfBirth());
        fromDB.setIdCard(customer.getIdCard());
        fromDB.setCustomerType(customer.getCustomerType());
        return repository.save(fromDB);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Page<Customer> findByName(String name, Pageable pageable) {
        return repository.findCustomerByNameContaining(name, pageable);
    }
}
