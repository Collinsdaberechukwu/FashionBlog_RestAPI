package com.example.mini_projectfashionblogapi.repository;

import com.example.mini_projectfashionblogapi.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepo extends JpaRepository<Likes,Long> {
}
