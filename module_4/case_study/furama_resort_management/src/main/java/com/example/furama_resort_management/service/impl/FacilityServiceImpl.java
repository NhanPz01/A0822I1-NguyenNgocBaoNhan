package com.example.furama_resort_management.service.impl;


import com.example.furama_resort_management.model.facility.Facility;
import com.example.furama_resort_management.repository.facility.FacilityRepository;
import com.example.furama_resort_management.service.FacilityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Autowired
    private FacilityRepository repository;

    @Override
    public Facility findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Facility> findByCustomerName(String name) {
        return null;
    }

    @Override
    public Facility add(Facility facility) {
        if (facility.getName() == null || facility.getName().isEmpty())
            return null;

        return repository.save(facility);
    }

    @Override
    public Facility update(int id, Facility facility) {
        Facility fromDB = repository.findById(id).orElse(null);
        if (fromDB == null)
            return null;
        BeanUtils.copyProperties(facility, fromDB);
        return repository.save(fromDB);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }


    @Override
    public Page<Facility> findAll(int page, int pageSize) {
        return repository.findAll(PageRequest.of(page, pageSize));
    }

    @Override
    public Page<Facility> findByKeyWord(String keyWord, Pageable pageable) {
        return repository.findByKeyWord("%" + keyWord + "%", pageable);
    }


}
