package com.example.furama_resort_management.service;

import com.example.furama_resort_management.model.facility.Facility;
import org.springframework.data.domain.Page;

public interface FacilityService extends Service<Facility> {
    Page<Facility> findAll(int page, int pageSize);
}
