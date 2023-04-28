package com.example.hom_thu_dien_tu.repository;

import com.example.hom_thu_dien_tu.model.Setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SettingRepositoryImpl implements SettingRepository {
    public static List<Setting> settings = new ArrayList<>();
    public static List<Integer> pageSize = new ArrayList<>();

    static {
        pageSize.add(5);
        pageSize.add(10);
        pageSize.add(15);
        pageSize.add(25);
        pageSize.add(50);
        pageSize.add(100);
        settings.add(new Setting(1, "English", pageSize.get(pageSize.indexOf(5)), true, "NhanPz 1"));
        settings.add(new Setting(2, "Vietnamese", pageSize.get(pageSize.indexOf(25)), false, "NhanPz 2"));
    }

    @Override
    public List<Setting> findAll() {
        return settings;
    }

    @Override
    public void update(Setting setting) {
        for (Setting s : settings) {
            if (s.getId() == setting.getId()) {
                s.setLanguage(setting.getLanguage());
                s.setPageSize(setting.getPageSize());
                s.setSpamsFilter(setting.getSpamsFilter());
                s.setSignature(setting.getSignature());
            }
        }
    }
}
