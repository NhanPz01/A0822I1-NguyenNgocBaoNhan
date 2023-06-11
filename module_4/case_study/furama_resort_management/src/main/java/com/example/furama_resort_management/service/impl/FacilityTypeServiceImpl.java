package com.example.furama_resort_management.service.impl;

import com.example.furama_resort_management.model.facility.FacilityType;
import com.example.furama_resort_management.repository.facility.FacilityTypeRepository;
import com.example.furama_resort_management.service.FacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacilityTypeServiceImpl implements FacilityTypeService {
    @Autowired
    private FacilityTypeRepository repository;
    @Override
    public List<FacilityType> findAll() {
        return repository.findAll();
    }

    @Override
    public FacilityType findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<FacilityType> findByName(String name) {
        return repository.findByName(name);
    }
}
