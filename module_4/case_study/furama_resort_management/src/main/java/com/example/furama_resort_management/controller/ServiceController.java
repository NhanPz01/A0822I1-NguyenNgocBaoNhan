package com.example.furama_resort_management.controller;

import com.example.furama_resort_management.dto.CreateVillaDTO;
import com.example.furama_resort_management.model.facility.Facility;
import com.example.furama_resort_management.model.facility.FacilityType;
import com.example.furama_resort_management.service.FacilityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private FacilityService facility;
    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable("id") Integer id, RedirectAttributes redirect, Model model) {
        model.addAttribute("villa", facility.findById(id));

        return "service/detail";
    }

    @PostMapping("/")
    public String addVilla(@Validated @ModelAttribute("villa") CreateVillaDTO villaDTO, BindingResult bindingResult, RedirectAttributes redirect, Model model, @RequestParam(defaultValue = "0") int page) {
        if (villaDTO.getName().equals("")) {
            model.addAttribute("alert", "Content could not be blank");
            return "redirect:/service";
        }
        int pageSize = 5;
        System.out.println(villaDTO.getName());
        Facility villa = new Facility();
        villa.setFacilityType(new FacilityType(1, "Villa"));
        BeanUtils.copyProperties(villaDTO, villa);
        facility.add(villa);
        return "redirect:/service";
    }
//    @PostMapping("/detail/{id}/edit")
//    public String updateVilla(@ModelAttribute("villa")) {
//
//        return "redirect:/service/detail";
//    }
}
