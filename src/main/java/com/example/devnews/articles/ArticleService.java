package com.example.devnews.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    ArticleRepo repository;
//    List<Article> articles;

//    public ArticleService() {
//        articles = new ArrayList<>();
//        articles.add(new Article("Google Play Store new feature", "Google’s latest Play Store feature helps users compare apps", "Ryan Daws"));
//        articles.add(new Article("code overload", "51% of devs say they’re dealing with 100x more code than 10 years ago\n", "Ryan Daws"));
//    }

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
