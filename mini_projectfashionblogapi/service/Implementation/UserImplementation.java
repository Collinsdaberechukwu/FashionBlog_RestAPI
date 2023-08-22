package com.example.mini_projectfashionblogapi.service.Implementation;

import com.example.mini_projectfashionblogapi.DTOs.UserDto;
import com.example.mini_projectfashionblogapi.model.Users;
import com.example.mini_projectfashionblogapi.repository.UserRepo;
import com.example.mini_projectfashionblogapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class UserImplementation implements UserService {
    private final UserRepo userRepo;
    @Override
    public Users registerUser(UserDto userDto) {
        Users users = new Users();
        users.setFirstName(userDto.getFirstName());
        users.setLastName(userDto.getLastName());
        users.setUserName(userDto.getUserName());
        users.setEmail(userDto.getEmail());
        users.setPassword(userDto.getPassword());

       return userRepo.save(users);
    }

    @Override
    public Users postUser(UserDto userDto) {
        Users posts = new Users();
        posts.setFirstName(userDto.getFirstName());
        posts.setLastName(userDto.getLastName());
        posts.setPassword(userDto.getPassword());
        posts.setUserName(userDto.getUserName());
        posts.setEmail(userDto.getEmail());

       return userRepo.save(posts);
    }
}
