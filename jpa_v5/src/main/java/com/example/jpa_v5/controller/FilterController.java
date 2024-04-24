package com.example.jpa_v5.controller;

import com.example.jpa_v5.entities.Coffee;
import com.example.jpa_v5.repositories.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter")
public class FilterController {
    @Autowired
    private CoffeeRepository coffeeRepository;

    @GetMapping("/{name}")
    public Coffee getCoffeeByName() {}
}
