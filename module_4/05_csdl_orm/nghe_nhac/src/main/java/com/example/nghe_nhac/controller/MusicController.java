package com.example.nghe_nhac.controller;

import com.example.nghe_nhac.model.Music;
import com.example.nghe_nhac.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
        model.addAttribute("music", new Music());
        return "create";
    }


    @PostMapping("/create")
    public String create(@ModelAttribute("music") Music music, RedirectAttributes redirect) {
        service.add(music);
        redirect.addFlashAttribute("musicList", service.findAll());
        redirect.addFlashAttribute("message", "Add Success !!!");
        return "redirect:/";
    }

    @PostMapping("/{id}/detail")
    public String update(@PathVariable int id, @ModelAttribute Music music, RedirectAttributes redirect) {
        service.update(id, music);
        redirect.addFlashAttribute("musicList", service.findAll());
        redirect.addFlashAttribute("message", "Updated !!!");
        return "redirect:/";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        service.delete(id);
        redirect.addFlashAttribute("musicList", service.findAll());
        redirect.addFlashAttribute("message", "Delete Success !!!");
        return "redirect:/";
    }

    @PostMapping("/")
    public String search(@RequestParam("search") String search, Model model) {
        if (service.findMusicByNameContainingOrAuthorContaining(search, search, search).isEmpty() || search.isEmpty()) {
            model.addAttribute("message", "Cannot find any result");
            model.addAttribute("musicList", service.findAll());
        } else {
            model.addAttribute("musicList", service.findMusicByNameContainingOrAuthorContaining(search, search, search));
        }
        return "list";
    }
}
