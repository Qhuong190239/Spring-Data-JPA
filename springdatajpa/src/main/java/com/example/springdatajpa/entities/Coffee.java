package com.example.springdatajpa.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
// Cách tạo cột như 1 ràng buộc duy nhẩt bằng @Table
@Table(
        name = "coffees",
        schema = "coffeejpa",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "name_unique",
                        columnNames = "name"
                )
        }
)
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int price;

    @CreationTimestamp
    private LocalDateTime createTime;
    @UpdateTimestamp
    private LocalDateTime updateTime;
}
