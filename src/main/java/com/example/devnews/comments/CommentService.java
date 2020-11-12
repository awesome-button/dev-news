package com.example.devnews.comments;

import com.example.devnews.articles.Article;
import com.example.devnews.articles.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    CommentRepo repository;

    public List<Comment> getAll() {
        return repository.findAll();
    }

    public Optional<Comment> getById(Long id) {
        return repository.findById(id);
    }

    public Comment create(Comment comment) {
        return repository.save(comment);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Comment update(Comment updComment) {
        return repository.save(updComment);
    }

    public List<Comment> getAllByArticleId(Long articleId) {
        return repository.findAllByArticleId(articleId);
    }


}