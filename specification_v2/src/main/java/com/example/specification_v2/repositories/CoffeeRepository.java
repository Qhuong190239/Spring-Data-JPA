package com.example.specification_v2.repositories;

import com.example.specification_v2.entities.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CoffeeRepository extends JpaRepository<Coffee, Long>, JpaSpecificationExecutor<Coffee> {
}
