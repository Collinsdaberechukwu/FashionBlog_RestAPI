package com.example.mini_projectfashionblogapi.repository;

import com.example.mini_projectfashionblogapi.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Long> {

    Admin findByUpdatedProduct(String updatedProduct);
}