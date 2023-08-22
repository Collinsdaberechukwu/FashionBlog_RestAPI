package com.example.mini_projectfashionblogapi.DTOs;

import com.example.mini_projectfashionblogapi.model.Admin;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String updateProduct;
    private String password;


    public AdminDto(Admin admin){
        this.id = admin.getId();
        this.firstName=admin.getFirstName();
        this.lastName = admin.getLastName(adminDto.getLastName());
        this.email = admin.getEmail();
        this.updateProduct = admin.getUpdatedProduct();
        this.password = admin.getPassword();
    }
}
