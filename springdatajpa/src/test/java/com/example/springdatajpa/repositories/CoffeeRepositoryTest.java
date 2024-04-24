package com.example.springdatajpa.repositories;

import com.example.springdatajpa.entities.Coffee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DataJpaTest
class CoffeeRepositoryTest {

    @Autowired
    private CoffeeRepository coffeeRepository;

    @Test
    void saveMethod() {
        // Create products
        Coffee coffee = new Coffee();
        coffee.setName("Traditional Coffee");
        coffee.setPrice(50);
        // Save products
        Coffee savedObject = coffeeRepository.save(coffee);
        // Display products
        System.out.println(savedObject.getId());
        System.out.println(savedObject.toString());

    }
}