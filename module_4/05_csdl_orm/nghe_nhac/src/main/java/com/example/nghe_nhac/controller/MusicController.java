package com.example.nghe_nhac.controller;

import com.example.nghe_nhac.model.Music;
import com.example.nghe_nhac.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;

@Controller
public class MusicController {
    @Autowired
    private MusicService service;
    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("musicList", service.findAll());
        return "list";
    }

    @GetMapping("/{id}/detail")
    public String showDetail(@PathVariable int id, Model model) {
        model.addAttribute("music", service.findById(id));
        return "detail";
    }
    @GetMapping("/{id}/delete")
    public String showDelete(@PathVariable int id, Model model) {
        model.addAttribute("music", service.findById(id));
        return "delete";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        return "create";
    }

    @PostMapping("/create")
    public String create(@RequestBody Music music, Model model) {
        service.add(music);
        model.addAttribute("message", "Add Success !!!");
        return "list";
    }

    @PostMapping("/{id}/detail")
    public String update(@PathVariable int id, @RequestBody Music music, RedirectAttributes redirect) {
        service.update(id, music);
        redirect.addFlashAttribute("message", "Updated !!!");
        return "redirect:/id/detail";
    }

//    @PostMapping("/{id}")
//    public String delete() {
//
//    }
}
