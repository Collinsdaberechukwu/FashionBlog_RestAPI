package com.example.mini_projectfashionblogapi.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DesignProductDto {

    private String description;
    private Double price;
    private String name;
}
