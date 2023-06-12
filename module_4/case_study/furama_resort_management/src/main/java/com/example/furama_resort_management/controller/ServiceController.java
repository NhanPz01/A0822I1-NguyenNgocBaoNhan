package com.example.furama_resort_management.controller;

import com.example.furama_resort_management.dto.CreateVillaDTO;
import com.example.furama_resort_management.model.facility.Facility;
import com.example.furama_resort_management.model.facility.FacilityType;
import com.example.furama_resort_management.service.FacilityService;
import com.example.furama_resort_management.service.FacilityTypeService;
import com.example.furama_resort_management.service.RentTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ServiceController {
    @Autowired
    private FacilityService facilityService;
    @Autowired
    private FacilityTypeService facilityType;
    @Autowired
    private RentTypeService rentTypeService;

    @GetMapping("/service/detail/{id}")
    public String showDetail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("villa", facilityService.findById(id));

        return "service/detail";
    }

    @GetMapping("/service/detail/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("villa", facilityService.findById(id));
        model.addAttribute("facilityTypeList", facilityType.findAll());
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "service/edit";
    }

    @PostMapping("/service")
    public String addVilla(@Validated @ModelAttribute("villa") CreateVillaDTO villaDTO, BindingResult bindingResult, RedirectAttributes redirect, Model model, @RequestParam(defaultValue = "0") int page) {
        if (bindingResult.hasErrors()) {
            redirect.addFlashAttribute("alert", "Name could not empty");
            return "redirect:/service";
        }
        int pageSize = 5;
        System.out.println(villaDTO.getName());
        Facility villa = new Facility();
        BeanUtils.copyProperties(villaDTO, villa);
        villa.setFacilityType(new FacilityType(1, "Villa"));
        facilityService.add(villa);
        return "redirect:/service";
    }
//    @PostMapping("/service/detail/{id}/edit")
//    public String updateVilla(@ModelAttribute("villa")) {
//
//        return "redirect:/service/detail";
//    }

}
