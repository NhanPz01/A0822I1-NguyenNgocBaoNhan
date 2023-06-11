package com.example.furama_resort_management.service.impl;

import com.example.furama_resort_management.model.facility.RentType;
import com.example.furama_resort_management.repository.facility.RentTypeRepository;
import com.example.furama_resort_management.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    private RentTypeRepository repository;

    @Override
    public List<RentType> findAll() {
        return repository.findAll();
    }

    @Override
    public RentType findById(int id) {
        return repository.findById(id).orElse(null);
    }
}
