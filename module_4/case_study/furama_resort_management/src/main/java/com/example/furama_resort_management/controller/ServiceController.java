package com.example.furama_resort_management.controller;

import com.example.furama_resort_management.dto.CreateVillaDTO;
import com.example.furama_resort_management.model.facility.Facility;
import com.example.furama_resort_management.model.facility.FacilityType;
import com.example.furama_resort_management.service.FacilityService;
import com.example.furama_resort_management.service.FacilityTypeService;
import com.example.furama_resort_management.service.RentTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
        model.addAttribute("facility", facilityService.findById(id));

        return "service/detail";
    }

    @GetMapping("/service/detail/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("facility", facilityService.findById(id));
        model.addAttribute("facilityTypeList", facilityType.findAll());
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "service/edit";
    }

    @GetMapping("/service/searching")
    public String searchFacility(@RequestParam("search") String search, Model model, @RequestParam(defaultValue = "0") int page) {
        int pageSize = 10;
        CreateVillaDTO villa = new CreateVillaDTO();
        Facility house = new Facility();
        house.setFacilityType(new FacilityType(2, "House"));
        Facility room = new Facility();
        room.setFacilityType(new FacilityType(3, "Room"));
        Page<Facility> result = facilityService.findByKeyWord(search, PageRequest.of(page, pageSize));
        if (result == null || result.isEmpty()) {
            model.addAttribute("facilityList", facilityService.findAll(page, pageSize));
        } else {
            model.addAttribute("facilityList", facilityService.findByKeyWord(search, PageRequest.of(page, pageSize)));
        }
        model.addAttribute("rentTypes", rentTypeService.findAll());
        model.addAttribute("villa", villa);
        model.addAttribute("house", house);
        model.addAttribute("room", room);
        model.addAttribute("alert", null);
        return "home/service";
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

    @PostMapping("/service/detail/edit/{id}")
    public String updateFacility(@ModelAttribute("villa") Facility facility, @PathVariable("id") Integer id, RedirectAttributes redirect) {
        facilityService.update(id, facility);
        return "redirect:/service/detail/{id}";
    }

    @PostMapping("/service/detail/{id}")
    public String deleteFacility(@PathVariable("id") Integer id, RedirectAttributes redirect) {
        facilityService.delete(id);
        return "redirect:/service";
    }


}
