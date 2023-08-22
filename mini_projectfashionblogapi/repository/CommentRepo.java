package com.example.mini_projectfashionblogapi.repository;

import com.example.mini_projectfashionblogapi.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Long> {
    Comment findByContent(Comment Long);
}
