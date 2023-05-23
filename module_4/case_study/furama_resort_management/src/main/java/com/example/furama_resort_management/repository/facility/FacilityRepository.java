package com.example.furama_resort_management.repository.facility;

import com.example.furama_resort_management.model.facility.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilityRepository extends JpaRepository<Facility, Integer> {
}
