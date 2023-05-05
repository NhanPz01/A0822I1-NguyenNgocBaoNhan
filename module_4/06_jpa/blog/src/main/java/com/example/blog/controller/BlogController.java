package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import com.sun.corba.se.impl.util.RepositoryId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private BlogService service;
    @GetMapping("/")
    public String showMain(Model model) {
        model.addAttribute("blogList", service.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String showCreate() {
        return "create";
    }
    @GetMapping("/{id}/detail")
    public String showDetail(Model model, @PathVariable int id) {
        model.addAttribute("blog", service.findById(id));
        return "detail";
    }
    @GetMapping("/{id}/update")
    public String showUpdate(Model model, @PathVariable int id) {
        model.addAttribute("blog", service.findById(id));
        return "update";
    }
    @GetMapping("/{id}/delete")
    public String showDelete(Model model, @PathVariable int id) {
        model.addAttribute("blog", service.findById(id));
        return "delete";
    }
    @PostMapping("/create")
    public String create(@RequestParam String author,
                         @RequestParam String title,
                         @RequestParam String content,
                         RedirectAttributes redirect) {
        service.add(new Blog(author, title, content));
        redirect.addFlashAttribute("blogList", service.findAll());
        redirect.addFlashAttribute("message", "Add Success !!!");
        return "redirect:/";
    }
    @PostMapping("/{id}/update")
    public String update(RedirectAttributes redirect, @PathVariable int id, @ModelAttribute Blog blog) {
        service.update(id, blog);
        redirect.addFlashAttribute("message", "Update Success !!!");
        redirect.addFlashAttribute("blog", service.findById(id));
        return "redirect:/{id}/detail";
    }
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        service.delete(id);
        redirect.addFlashAttribute("message", "Delete Success !!!");
        return "redirect:/";
    }
}
