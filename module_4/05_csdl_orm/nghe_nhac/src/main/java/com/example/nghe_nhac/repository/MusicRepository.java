package com.example.nghe_nhac.repository;

import com.example.nghe_nhac.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface MusicRepository extends JpaRepository<Music, Integer> {
    @Query(value = "select * from music where name like :name", nativeQuery = true)
    List<Music> findByName(@Param(value = "name") String name);

    @Query(value = "select * from music where author like :author", nativeQuery = true)
    List<Music> findByAuthor(@Param(value = "author") String author);
}
