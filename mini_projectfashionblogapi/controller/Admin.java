package com.example.mini_projectfashionblogapi.controller;

import com.example.mini_projectfashionblogapi.DTOs.AdminDto;
import com.example.mini_projectfashionblogapi.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/admins")
public class Admin {

    private final AdminService adminService;

    @PostMapping("post")
    public ResponseEntity<AdminDto> postDesign(@RequestBody AdminDto adminDto){
        adminService.postDesign(adminDto);
        return new ResponseEntity<>(adminDto, HttpStatus.CREATED);
    }

    @PutMapping ("/put/products")
    public ResponseEntity<AdminDto> deleteProduct(@RequestBody AdminDto adminDto){
        adminService.deleteProduct(adminDto);
        return  new ResponseEntity<>(adminDto,HttpStatus.CREATED);
    }
}
