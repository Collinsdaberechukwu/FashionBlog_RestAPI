package com.example.mini_projectfashionblogapi.repository;

import com.example.mini_projectfashionblogapi.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Long> {
}
