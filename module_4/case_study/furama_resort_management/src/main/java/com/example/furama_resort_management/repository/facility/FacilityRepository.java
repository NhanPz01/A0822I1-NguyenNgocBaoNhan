package com.example.furama_resort_management.repository.facility;

import com.example.furama_resort_management.model.facility.Facility;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilityRepository extends PagingAndSortingRepository<Facility, Integer> {
}
