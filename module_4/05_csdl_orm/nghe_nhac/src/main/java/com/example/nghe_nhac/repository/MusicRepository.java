package com.example.nghe_nhac.repository;

import com.example.nghe_nhac.model.Music;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface MusicRepository extends JpaRepository<Music, Integer> {
    List<Music> findMusicByNameContainingOrAuthorContainingOrTypeContaining(String name, String author, String type);
}