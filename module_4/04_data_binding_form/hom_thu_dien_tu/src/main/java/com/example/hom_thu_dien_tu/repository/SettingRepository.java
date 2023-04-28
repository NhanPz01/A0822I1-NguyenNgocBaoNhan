package com.example.hom_thu_dien_tu.repository;

import com.example.hom_thu_dien_tu.model.Setting;

import java.util.List;

public interface SettingRepository {
    List<Setting> findAll();
    void update(Setting setting);
}
