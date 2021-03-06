package com.example.devnews.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping("")
    public List<Article> getAll() {
        return articleService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Article> getById(@PathVariable Long id) {
        return articleService.getById(id);
    }

    @PostMapping("")
    public Article create(@RequestBody Article article) {
        return articleService.create(article);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        articleService.delete(id);
    }

    @PutMapping("")
    public Article update(@RequestBody Article updArticle) {
        return articleService.update(updArticle);
    }
}
