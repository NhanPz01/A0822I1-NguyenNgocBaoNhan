package com.example.nghe_nhac.service;

import com.example.nghe_nhac.model.Music;
import com.example.nghe_nhac.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicRepository repository;

    @Override
    public List<Music> findAll() {
        return repository.findAll();
    }

    @Override
    public Music findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Music> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Music> findByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    @Override
    public Music add(Music music) {
        if (music.getName() == null || music.getName().isEmpty())
            return null;
        if (music.getLink() == null || music.getLink().isEmpty())
            return null;
        return repository.save(music);
    }

    @Override
    public Music update(int id, Music music) {
        Music fromDB = repository.findById(id).orElse(null);
        if (fromDB == null)
            return null;
        fromDB.setName(music.getName());
        fromDB.setAuthor(music.getAuthor());
        fromDB.setType(music.getType());
        fromDB.setLink(music.getLink());
        return repository.save(fromDB);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
