package com.example.mini_projectfashionblogapi.controller;

import com.example.mini_projectfashionblogapi.DTOs.UserDto;
import com.example.mini_projectfashionblogapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("api/us")
public class UserController {
    private final UserService userService;

    @GetMapping("register")
    public ResponseEntity<UserDto> registerUser(@RequestBody UserDto userDto){
        userService.registerUser(userDto);
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }
    @PostMapping("post")
    public ResponseEntity<UserDto> postUser(@RequestBody UserDto userDto){
        userService.postUser(userDto);
        return  new ResponseEntity<>(userDto,HttpStatus.CREATED);
    }
}
//return new ResponseEntity<>(userDto, HttpStatus.CREATED);

//    @PostMapping("/register")
//    public ResponseEntity<UserDto> registerUser(@RequestBody UserDto userDto){
//        userService.registerUser(userDto);
//        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
//    }