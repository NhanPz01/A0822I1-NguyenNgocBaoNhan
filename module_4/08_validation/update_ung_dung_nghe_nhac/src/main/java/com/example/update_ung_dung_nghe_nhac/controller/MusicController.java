package com.example.update_ung_dung_nghe_nhac.controller;

import com.example.update_ung_dung_nghe_nhac.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicController {
    @Autowired
    private MusicService service;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("musicList", service.findAll());
        return "list";
    }
}
