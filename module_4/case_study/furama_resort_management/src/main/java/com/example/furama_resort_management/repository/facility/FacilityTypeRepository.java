package com.example.furama_resort_management.repository.facility;

import com.example.furama_resort_management.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacilityTypeRepository extends JpaRepository<FacilityType, Integer> {
    @Query(value = "select * from facility_type where name like :name;", nativeQuery = true)
    public List<FacilityType> findByName(@Param(value = "name") String name);
}
