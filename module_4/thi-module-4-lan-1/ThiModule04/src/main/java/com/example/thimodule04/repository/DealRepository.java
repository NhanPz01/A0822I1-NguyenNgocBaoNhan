package com.example.thimodule04.repository;

import com.example.thimodule04.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealRepository extends JpaRepository<Deal, Integer> {
    @Query(value = "select * from giao_dich where id like :id", nativeQuery = true)
    public Deal findByDealId(@Param("id") String id);
    @Query(value = "select * from giao_dich join khach_hang on khach_hang.id = giao_dich.customer_id where name like :name and deal_type like :type", nativeQuery = true)
    public List<Deal> findByTwo(@Param("name") String name, @Param("type") String type);
    @Query(value = "select * from giao_dich join khach_hang on khach_hang.id = giao_dich.customer_id where name like :name", nativeQuery = true)
    public List<Deal> findByOne(@Param("name") String name);
    @Query(value = "select * from giao_dich join khach_hang on khach_hang.id = giao_dich.customer_id where deal_type like :type", nativeQuery = true)
    public List<Deal> findByType(@Param("type") String type);
}
