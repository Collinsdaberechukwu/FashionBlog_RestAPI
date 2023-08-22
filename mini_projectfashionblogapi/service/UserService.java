package com.example.mini_projectfashionblogapi.service;

import com.example.mini_projectfashionblogapi.DTOs.LikeDto;
import com.example.mini_projectfashionblogapi.DTOs.UserDto;
import com.example.mini_projectfashionblogapi.model.Users;

public interface UserService {
    Users registerUser(UserDto userDto);

    Users postUser(UserDto userDto);
}
