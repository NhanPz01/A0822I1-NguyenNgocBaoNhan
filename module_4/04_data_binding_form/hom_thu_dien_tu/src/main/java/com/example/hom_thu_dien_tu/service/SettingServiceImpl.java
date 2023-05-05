package com.example.hom_thu_dien_tu.service;

import com.example.hom_thu_dien_tu.model.Setting;
import com.example.hom_thu_dien_tu.repository.SettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettingServiceImpl implements SettingService {
    @Autowired
    private SettingRepository repository;
    @Override
    public List<Setting> findAll() {
        return repository.findAll();
    }

    @Override
    public Setting update(int id, Setting setting) {
        Setting fromDB = repository.findById(id).orElse(null);
        if (fromDB == null)
            return null;
        fromDB.setLanguage(setting.getLanguage());
        fromDB.setPageSize(setting.getPageSize());
        fromDB.setSpamsFilter(setting.isSpamsFilter());
        fromDB.setSignature(setting.getSignature());
        return repository.save(fromDB);
    }
}
