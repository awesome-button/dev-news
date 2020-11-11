package com.example.devnews.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    ArticleService articleService;

    public ArticleController() {
        articleService = new ArticleService();
    }

    @GetMapping("")
    public List<Article> getAll() {
        return articleService.getAll();
    }

    @GetMapping("/{id}")
    public Article getById(@PathVariable Long id) {
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

    @PutMapping("/{id}")
    public Article update(@PathVariable Long id, @RequestBody Article updArticle) {
        return articleService.update(id, updArticle);
    }
}
