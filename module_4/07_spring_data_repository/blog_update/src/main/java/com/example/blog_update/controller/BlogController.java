package com.example.blog_update.controller;

import com.example.blog_update.dao.BlogDAO;
import com.example.blog_update.model.Blog;
import com.example.blog_update.model.Category;
import com.example.blog_update.service.BlogService;
import com.example.blog_update.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Date;
import java.time.LocalDate;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categoryList", categoryService.findAll());
        return "create";
    }

    @GetMapping("/{id}/detail")
    public String showDetail(@PathVariable int id,
                             Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "detail";
    }

    @GetMapping("/{id}/update")
    public String showUpdate(Model model, @PathVariable int id) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("categoryList", categoryService.findAll());
        return "update";
    }
    @GetMapping("/{id}/delete")
    public String showDelete(Model model, @PathVariable int id) {
        model.addAttribute("blog", blogService.findById(id));
        return "delete";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("blog") BlogDAO blogDAO,
                         RedirectAttributes redirect) {
        Blog blog = new Blog();
        Date initDate = Date.valueOf(LocalDate.now());
        blog.setAuthor(blogDAO.getAuthor());
        blog.setTitle(blogDAO.getTitle());
        blog.setContent(blogDAO.getContent());
        blog.setCategory(blogDAO.getCategory());
        blog.setInitTime(initDate);
        blogService.add(blog);
        redirect.addFlashAttribute("blogList", blogService.findAll());
        redirect.addFlashAttribute("message", "Add Success !!!");
        return "redirect:/";
    }

    @PostMapping("/{id}/update")
    public String update(RedirectAttributes redirect, @PathVariable int id, @ModelAttribute Blog blog) {
        blogService.update(id, blog);
        redirect.addFlashAttribute("message", "Update Success !!!");
        redirect.addFlashAttribute("blogList", blogService.findAll());
        return "redirect:/";
    }
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        blogService.deleteById(id);
        redirect.addFlashAttribute("message", "Delete Success !!!");
        return "redirect:/";
    }
}