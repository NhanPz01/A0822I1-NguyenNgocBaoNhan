package com.example.hom_thu_dien_tu.repository;

import com.example.hom_thu_dien_tu.model.Setting;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface SettingRepository extends JpaRepository<Setting, Integer> {
}
