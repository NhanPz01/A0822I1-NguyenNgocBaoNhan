package com.example.thimodule04.controller;

import com.example.thimodule04.dto.CreateDTO;
import com.example.thimodule04.model.Bussiness;
import com.example.thimodule04.model.Project;
import com.example.thimodule04.service.BussinessService;
import com.example.thimodule04.service.ProjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    public BussinessService bussinessService;
    @Autowired
    public ProjectService projectService;
    @GetMapping("/")
    public String showMain(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("bussinessList", bussinessService.findAll());
        model.addAttribute("projectList", projectService.findAll(page, 5));
        return "home";
    }

    @GetMapping("/add")
    public String showCreate(Model model) {
        CreateDTO project = new CreateDTO();
        project.setCreatedDate(Date.valueOf(LocalDate.now()));
        System.out.println(project.getCreatedDate());
        model.addAttribute("project", project);
        model.addAttribute("businessList", bussinessService.findAll());
        return "create";
    }
//
//    @GetMapping("/{id}/detail")
//    public String getDetail(@PathVariable("id") String id, Model model) {
//        model.addAttribute("deal", deal.findById(id));
//        return "home/detail";
//    }
//
//    @GetMapping("/{id}/delete")
//    public String showDelete(@PathVariable("id") String id, Model model) {
//        model.addAttribute("deal", deal.findById(id));
//        return "home/delete";
//    }
//
//    @GetMapping("/search")
//    public String search(@RequestParam("search") String name, @RequestParam("type") String type, Model model) {
//        if (type == null) {
//            model.addAttribute("dealList", deal.findByOne(name));
//        } else if (name == null) {
//            model.addAttribute("dealList", deal.findByType(type));
//        } else {
//            model.addAttribute("dealList", deal.findByTwo(name, type));
//        }
//        return "redirect:/";
//    }
//
    @PostMapping("/add")
    public String create(@Valid @ModelAttribute("project") CreateDTO dto, BindingResult bindingResult, RedirectAttributes redirect, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("project.createdDate", Date.valueOf(LocalDate.now()));
            model.addAttribute("businessList", bussinessService.findAll());
            return "create";
        }
        Project newProject = new Project();
        BeanUtils.copyProperties(dto, newProject);
        List<Bussiness> businesses = bussinessService.findByName(dto.getBusinessName());
        newProject.setBussiness(businesses.get(0));
        projectService.add(newProject);
        redirect.addFlashAttribute("message", "Thêm thành công");
        return "redirect:/";
    }
//
//    @PostMapping("/delete/{id}")
//    public String delete(@PathVariable("id") String id, RedirectAttributes redirect) {
//        deal.deleteById(deal.findById(id));
//        redirect.addFlashAttribute("deleteStatus", "OK");
//        return "redirect:/";
//    }
}
