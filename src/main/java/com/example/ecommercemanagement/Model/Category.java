package com.example.ecommercemanagement.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.log4j.Log4j;

@Entity
@Data

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private int id;
    @Column(name = "name")
    private String name;
}
