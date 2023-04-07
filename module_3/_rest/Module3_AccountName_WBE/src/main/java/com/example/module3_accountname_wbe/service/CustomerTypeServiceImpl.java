package com.example.module3_accountname_wbe.service;

import com.example.module3_accountname_wbe.model.CustomerType;
import com.example.module3_accountname_wbe.repository.CustomerTypeRepository;
import com.example.module3_accountname_wbe.repository.CustomerTypeRepositoryImpl;

import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    private CustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(int id) {
        return customerTypeRepository.findById(id);
    }

    @Override
    public void add(CustomerType customerType) {
        customerTypeRepository.add(customerType);
    }


    @Override
    public void update(CustomerType customerType) {
        customerTypeRepository.update(customerType);
    }

    @Override
    public void deleteById(int id) {
        customerTypeRepository.deleteById(id);
    }
}
