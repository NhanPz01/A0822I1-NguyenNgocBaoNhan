package com.example.thimodule04.service.impl;

import com.example.thimodule04.model.Bussiness;
import com.example.thimodule04.repository.BussinessRepository;
import com.example.thimodule04.service.BussinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BussinessServiceImpl implements BussinessService {
    @Autowired
    public BussinessRepository repository;

    @Override
    public List<Bussiness> findAll() {
        return repository.findAll();
    }

    @Override
    public Bussiness findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Bussiness> findByName(String name) {
        return repository.findBussinessByName(name);
    }
}
