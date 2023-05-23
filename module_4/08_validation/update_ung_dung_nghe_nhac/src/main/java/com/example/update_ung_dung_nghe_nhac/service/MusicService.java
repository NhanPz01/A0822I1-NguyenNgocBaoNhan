package com.example.update_ung_dung_nghe_nhac.service;

import com.example.update_ung_dung_nghe_nhac.model.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();
    Music findById(int id);
    List<Music> findByName(String name);
    Music add(Music music);
    Music update(int id, Music music);
    void delete(int id);
}
