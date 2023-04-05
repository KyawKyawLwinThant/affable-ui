package com.example.sampleaffablebean.ds;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "last_update")
    private LocalDate lastUpdate;
    @JoinColumn(name = "category_id")
    @ManyToOne
    private Category category;












}
