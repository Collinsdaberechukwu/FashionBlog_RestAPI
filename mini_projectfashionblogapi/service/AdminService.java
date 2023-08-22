package com.example.mini_projectfashionblogapi.service;

import com.example.mini_projectfashionblogapi.DTOs.AdminDto;
import com.example.mini_projectfashionblogapi.model.Admin;

public interface AdminService {
    Admin postDesign(AdminDto adminDto);
    void  deleteProduct(AdminDto adminDto,Long id);
//    AdminDto updateProduct(AdminDto adminDto);
}
