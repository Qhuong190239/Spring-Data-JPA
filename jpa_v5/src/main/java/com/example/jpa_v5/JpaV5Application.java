package com.example.jpa_v5;

import com.example.jpa_v5.entities.Coffee;
import com.example.jpa_v5.repositories.CoffeeRepository;
import com.example.jpa_v5.specification.CoffeeSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@SpringBootApplication
public class JpaV5Application {

    public static void main(String[] args) {

        CoffeeRepository coffeeRepository = null;
//        SpringApplication.run(JpaV5Application.class, args);
        Specification<Coffee> specification = Specification.where(CoffeeSpecification.availableCoffee())
                .and(CoffeeSpecification.quantityGreaterthan0());

        List<Coffee> coffees = coffeeRepository.findAll(specification, JpaSort.unsorted());
        coffees.forEach(System.out::println);
    }

}
