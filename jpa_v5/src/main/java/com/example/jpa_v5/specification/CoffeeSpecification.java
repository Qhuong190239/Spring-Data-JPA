package com.example.jpa_v5.specification;

import com.example.jpa_v5.entities.Coffee;
import org.springframework.data.jpa.domain.Specification;

public class CoffeeSpecification {
    public static Specification<Coffee> availableCoffee() {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.isTrue(root.get("Available")));
    }
    public static Specification<Coffee> quantityGreaterthan0() {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("Quantity"), 0));
    }
}
