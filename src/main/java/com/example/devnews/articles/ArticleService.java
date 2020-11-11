package com.example.devnews.articles;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArticleService {

    List<Article> articles;

    public ArticleService() {
        articles = new ArrayList<>();
        articles.add(new Article("Google Play Store new feature", "Google’s latest Play Store feature helps users compare apps", "Ryan Daws", getId()));
        articles.add(new Article("code overload", "51% of devs say they’re dealing with 100x more code than 10 years ago\n", "Ryan Daws", getId()));
    }

    public List<Article> getAll() {
        return articles;
    }

    public Article getById(Long id) {
        for (Article article : articles) {
            if (article.getId().equals((id))) return article;
        }
        return null;
    }

    public Article create(Article article) {
        articles.add(article);
        return article;
    }

    public void delete(Long id) {
        articles = articles.stream()
                .filter(article -> !article.getId().equals(id))
                .collect(Collectors.toList());
    }

    public Article update(Long id, Article updArticle) {
        articles.forEach(article -> {
            if (article.getId().equals(id)) {
                articles.set(articles.indexOf(article), updArticle);
            }
        });
        return null;
    }

    private Long getId() {
        return Long.valueOf(this.articles.size()+1);
    }

}
