package com.example.mini_projectfashionblogapi.service.Implementation;

import com.example.mini_projectfashionblogapi.DTOs.LikeDto;
import com.example.mini_projectfashionblogapi.model.Likes;
import com.example.mini_projectfashionblogapi.repository.LikeRepo;
import com.example.mini_projectfashionblogapi.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LikeImplementation implements LikeService {
    private  final LikeRepo likeRepo;
    @Override
    public Likes likeContent(LikeDto likeDto) {
        Likes likes = new Likes();
        likes.setContent(likeDto.getContent());
       return likeRepo.save(likes);
    }
}
