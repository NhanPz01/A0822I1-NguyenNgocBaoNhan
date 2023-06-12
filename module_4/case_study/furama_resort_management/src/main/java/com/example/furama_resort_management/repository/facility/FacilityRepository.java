package com.example.furama_resort_management.repository.facility;

import com.example.furama_resort_management.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilityRepository extends PagingAndSortingRepository<Facility, Integer> {
    @Query(value = "SELECT DISTINCT * FROM facility JOIN rent_type ON facility.rent_type = rent_type.id JOIN facility_type ON facility.facility_type = facility_type.id WHERE facility.name LIKE %:keyword% OR facility.area LIKE %:keyword% OR facility.cost LIKE %:keyword% OR facility.max_people LIKE %:keyword% OR facility.standard_room LIKE %:keyword% OR facility.description_other_convenience LIKE %:keyword% OR facility.pool_area LIKE %:keyword% OR facility.number_of_floors LIKE %:keyword% OR facility.facility_free LIKE %:keyword% OR rent_type.name LIKE %:keyword% OR facility_type.name LIKE %:keyword%",
            countQuery = "SELECT COUNT(*) FROM facility JOIN rent_type ON facility.rent_type = rent_type.id JOIN facility_type ON facility.facility_type = facility_type.id WHERE facility.name LIKE %:keyword% OR facility.area LIKE %:keyword% OR facility.cost LIKE %:keyword% OR facility.max_people LIKE %:keyword% OR facility.standard_room LIKE %:keyword% OR facility.description_other_convenience LIKE %:keyword% OR facility.pool_area LIKE %:keyword% OR facility.number_of_floors LIKE %:keyword% OR facility.facility_free LIKE %:keyword% OR rent_type.name LIKE %:keyword% OR facility_type.name LIKE %:keyword%",
            nativeQuery = true)
    public Page<Facility> findByKeyWord(@Param("keyword") String keyword, Pageable pageable);

}
