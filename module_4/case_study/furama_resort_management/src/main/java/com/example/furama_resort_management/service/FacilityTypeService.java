package com.example.furama_resort_management.service;

import com.example.furama_resort_management.model.facility.FacilityType;

import java.util.List;

public interface FacilityTypeService {
    List<FacilityType> findAll();
    FacilityType findById(int id);
    List<FacilityType> findByName(String name);
}
