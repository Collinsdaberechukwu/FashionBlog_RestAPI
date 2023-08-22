package com.example.mini_projectfashionblogapi.service;

import com.example.mini_projectfashionblogapi.DTOs.LikeDto;
import com.example.mini_projectfashionblogapi.model.Likes;

public interface LikeService {
    Likes  likeContent(LikeDto likeDto);
}
