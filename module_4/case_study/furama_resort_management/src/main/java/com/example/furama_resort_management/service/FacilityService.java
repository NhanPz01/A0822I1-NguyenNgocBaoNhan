package com.example.furama_resort_management.service;

import com.example.furama_resort_management.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FacilityService extends Service<Facility> {
    Page<Facility> findAll(int page, int pageSize);
    Page<Facility> findByKeyWord(String keyWord, Pageable pageable);
}
