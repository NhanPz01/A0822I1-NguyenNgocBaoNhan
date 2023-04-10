package com.example.hien_thi_gia_vi_sandwich.service;

import com.example.hien_thi_gia_vi_sandwich.model.Flavor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlavorServiceImpl implements FlavorService {
    private static List<String> choices = new ArrayList<>();
    private static List<Flavor> flavors = new ArrayList<>();

    static {
        flavors.add(new Flavor(1, "Lettuce"));
        flavors.add(new Flavor(2, "Tomato"));
        flavors.add(new Flavor(3, "Mustard"));
        flavors.add(new Flavor(4, "Sprouts"));
    }

    @Override
    public List<String> findAll() {
        return choices;
    }

    @Override
    public void add(Flavor flavor) {
        flavors.add(flavor);
    }

    @Override
    public void save(List<String> choices) {
        this.choices = choices;
    }
}
