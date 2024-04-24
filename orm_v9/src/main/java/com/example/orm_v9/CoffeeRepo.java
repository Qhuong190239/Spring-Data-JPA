package com.example.orm_v9;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepo extends JpaRepository<Coffee, Integer> {
}
