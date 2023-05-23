package com.example.furama_resort_management.service.impl;

import com.example.furama_resort_management.model.customer.CustomerType;
import com.example.furama_resort_management.repository.customer.CustomerTypeRepository;
import com.example.furama_resort_management.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    private CustomerTypeRepository repository;
    @Override
    public List<CustomerType> findAll() {
        return repository.findAll();
    }

    @Override
    public CustomerType findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public CustomerType findByName(String name) {
        return repository.findByName(name);
    }
}
