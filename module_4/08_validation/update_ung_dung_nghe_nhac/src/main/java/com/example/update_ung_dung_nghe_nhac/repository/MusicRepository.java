package com.example.update_ung_dung_nghe_nhac.repository;

import com.example.update_ung_dung_nghe_nhac.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {
    @Query(value = "select * form music-app-valid where name like :name", nativeQuery = true)
    List<Music> findByName(@Param(value = "name") String name);
}
