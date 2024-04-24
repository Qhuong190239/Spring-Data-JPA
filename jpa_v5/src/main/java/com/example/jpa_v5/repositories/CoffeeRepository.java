package com.example.jpa_v5.repositories;

import com.example.jpa_v5.entities.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CoffeeRepository extends JpaRepository<Coffee, Long>, JpaSpecificationExecutor<Coffee> {

}
