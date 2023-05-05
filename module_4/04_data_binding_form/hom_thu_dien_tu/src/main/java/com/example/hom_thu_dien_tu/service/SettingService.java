package com.example.hom_thu_dien_tu.service;


import com.example.hom_thu_dien_tu.model.Setting;

import java.util.List;

public interface SettingService {
    List<Setting> findAll();

    Setting update(int id, Setting setting);
}
