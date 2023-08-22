package com.example.mini_projectfashionblogapi.controller;

import com.example.mini_projectfashionblogapi.DTOs.LikeDto;
import com.example.mini_projectfashionblogapi.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/like")
public class LikeController {

    private final LikeService likeService;

    @GetMapping("content")
    public ResponseEntity<LikeDto> likeContent(@RequestBody LikeDto likeDto){
        likeService.likeContent(likeDto);
       return new ResponseEntity<>(likeDto, HttpStatus.CREATED);
    }


}
