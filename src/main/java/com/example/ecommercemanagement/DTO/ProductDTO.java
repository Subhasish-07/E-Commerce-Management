package com.example.ecommercemanagement.DTO;

import com.example.ecommercemanagement.Model.Category;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    //img name will stored in database
    private String imageName;
}

