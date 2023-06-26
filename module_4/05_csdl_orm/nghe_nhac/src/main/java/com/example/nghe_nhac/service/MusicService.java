package com.example.nghe_nhac.service;

import com.example.nghe_nhac.model.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();

    Music findById(int id);

    List<Music> findMusicByNameContainingOrAuthorContaining(String name, String author, String type);

    Music add(Music music);

    Music update(int id, Music music);

    void delete(int id);
}
