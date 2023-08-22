package com.example.mini_projectfashionblogapi.service;

import com.example.mini_projectfashionblogapi.DTOs.CommentDto;

public interface CommentService {
    CommentDto commentedByUser(String firstName);
}
