package com.example.jpa_v5.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coffeeID", referencedColumnName = "id")
    private Brands brands;
}
