package com.example.devnews.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    ArticleRepo repository;

    public List<Article> getAll() {
        return repository.findAll();
    }

    public Optional<Article> getById(Long id) {
        return repository.findById(id);
    }

    public Article create(Article article) {
        return repository.save(article);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Article update(Article updArticle) {
        return repository.save(updArticle);
    }


}
