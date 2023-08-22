package com.example.mini_projectfashionblogapi.service.Implementation;

import com.example.mini_projectfashionblogapi.DTOs.CommentDto;
import com.example.mini_projectfashionblogapi.model.Comment;
import com.example.mini_projectfashionblogapi.model.Users;
import com.example.mini_projectfashionblogapi.repository.CommentRepo;
import com.example.mini_projectfashionblogapi.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommentImplementation implements CommentService {
    private final CommentRepo commentRepo;

    @Override
    public CommentDto commentedByUser(String firstName) {
//        CommentDto commentDto = new CommentDto();
//        commentDto.setContent(commentDto.getContent());
//       return commentRepo.save(commentDto);
//        Comment comment = new Comment();
//        comment.setFirstName(comment.getFirstName());
//
//        Comment commented = commentRepo.save(comment);
//        return new CommentDto(commented);
        return  null;
    }
}
