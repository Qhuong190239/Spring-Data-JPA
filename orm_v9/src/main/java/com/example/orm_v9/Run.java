package com.example.orm_v9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Run implements CommandLineRunner {
    @Autowired
    private CoffeeRepo coffeeRepo;

    @Override
    public void run(String[] args) {
        Coffee cappuccino = new Coffee();
        cappuccino.setId(1);
        cappuccino.setName("Cappuccino");
        cappuccino.setPrice(5.0f);
        coffeeRepo.save(cappuccino);

        Coffee latte = new Coffee();
        latte.setId(2);
        latte.setName("Latte");
        latte.setPrice(8.0f);
        coffeeRepo.save(latte);
    }
}
