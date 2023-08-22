package com.example.mini_projectfashionblogapi.DTOs;

import com.example.mini_projectfashionblogapi.model.Comment;
import com.example.mini_projectfashionblogapi.model.DesignProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private DesignProduct content;
    private String firstName;

    public CommentDto(Comment comment){
        this.content = comment.getContent();
        this.firstName = comment.getFirstName();
    }
}
